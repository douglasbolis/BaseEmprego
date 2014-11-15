package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Anuncio;
import models.Beneficio;
import models.ElementoLista;
import models.PreRequisito;
import models.dao.AnuncioDAO;
import models.dao.BeneficioDAO;
import models.dao.PreRequisitoDAO;
import models.forms.MestreForm;
import play.data.Form;
import play.libs.Json;
import play.libs.Scala;
import play.mvc.*;
import scala.Option;
import scala.Tuple2;
import scala.collection.Seq;
import views.html.Anuncio.add;
import views.html.Anuncio.update;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import scala.Some.*;


/**
 * Created by clayton on 29/10/14.
 * Controlador responsavel pela tabela mestre
 */
public class AnuncioController extends Controller {


    final static Form<MestreForm> _mestreForm = Form.form(MestreForm.class);



    @play.db.jpa.Transactional
    public static  Result index_json(Option<String> uf){


        ObjectNode result = Json.newObject();
        result.put("data",Json.toJson(_getResult(uf)));

        return ok(Json.toJson(result));
    }


    private static List<Anuncio> _getResult(Option<String> uf){
        AnuncioDAO dao = new AnuncioDAO();
        if (uf.isDefined() && !uf.isEmpty() && !uf.get().isEmpty()){
            return dao.findMany("_estado", uf.get().toUpperCase());
        }else {
            return dao.all();
        }
    }

    public static Result index(Option<String> uf) {
        return ok(views.html.Anuncio.index.render());
    }




    @play.db.jpa.Transactional
    public static Result detalhe(String uuid){
        Anuncio anuncio  = new AnuncioDAO().findOne(UUID.fromString(uuid));
        List<Beneficio> lstBeneficio = new BeneficioDAO().findMany("_anuncio",anuncio);
        List<PreRequisito> lstPreRequisito = new PreRequisitoDAO().findMany("_anuncio",anuncio);
        return ok (views.html.Anuncio.detalhe.render(anuncio,lstBeneficio,lstPreRequisito));

    }









    @play.db.jpa.Transactional
    public static Result add(){
        return persist("");
    }

    @play.db.jpa.Transactional
    public static Result update(String uuid){
        return persist(uuid);
    }


    @play.db.jpa.Transactional
    public static Result delete(String uuid){
        if (uuid != null && !uuid.isEmpty()){
            try{
                (new AnuncioDAO()).delete(UUID.fromString(uuid));
            }catch (Exception e){
                return badRequest(views.html.error.render("Não foi possível excluir o anuncio, deve apagar todos os benefícios e requisitos antes de apagá-lo"));
            }

            return index(null);

        }else
        {
            return badRequest(views.html.error.render("Não foi possível excluir o anuncio, não foi informado qual registro deveria apagar"));

        }

    }





    private static Result persist(String uuid){
        /*
        *  baseando na existencia do uuid podemos definir
        *
        *  vazio - adiciona
        *  preenchido - altera
        *
        * */
        if (uuid != null && !uuid.isEmpty()){
            Anuncio alterar = new AnuncioDAO().findOne(UUID.fromString(uuid));
            MestreForm frm = new MestreForm();
            frm.uuid = alterar.uuid;
            frm.nome = alterar.get_nome();
            frm.estado = alterar.get_estado();
            frm.cidade = alterar.get_cidade();
            frm.faixasalarialInferior = alterar.get_faixasalarialInferior();
            frm.faixasalarialSuperior = alterar.get_faixasalarialSuperior();



            // preenchendo o formulario  com o conteudo do item solicitado
            return ok(update.render(_mestreForm.fill(frm), Application.estados()));

        }else
        {

            return ok(add.render(_mestreForm,Application.estados()));
        }


    }






    @play.db.jpa.Transactional
    public static Result addHandler(){
        Form<MestreForm> filledForm = _mestreForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                    add.render(filledForm,Application.estados())
            );
        } else {

            Anuncio dado = null;


            if (filledForm.value().isDefined()) {
                dado = new Anuncio(filledForm.value().get().nome);
                dado.set_estado(filledForm.get().estado.toUpperCase());
                dado.set_cidade(filledForm.get().cidade.toUpperCase());
                dado.set_faixasalarialInferior(filledForm.get().faixasalarialInferior);
                dado.set_faixasalarialSuperior(filledForm.get().faixasalarialSuperior);

                if  (filledForm.get().faixasalarialInferior == null && filledForm.get().faixasalarialSuperior != null)
                    dado.set_faixasalarialInferior(dado.get_faixasalarialSuperior());

                if  (filledForm.get().faixasalarialSuperior == null && filledForm.get().faixasalarialInferior != null)
                    dado.set_faixasalarialSuperior(dado.get_faixasalarialInferior());

            }




            if (dado != null){
                dado = new AnuncioDAO().save(dado);
            }

            return redirect(routes.AnuncioController.detalhe(dado.uuid));
        }

    }




    @play.db.jpa.Transactional
    public static Result updateHandler(){
        Form<MestreForm> filledForm = _mestreForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                    update.render(filledForm,Application.estados())

            );
        } else {

            Anuncio dado = null;

            if (filledForm.value().isDefined() && filledForm.value().get().uuid != null){
                dado = new AnuncioDAO().findOne(UUID.fromString(filledForm.get().uuid));
            }

            if (dado != null){
                dado.set_nome(filledForm.get().nome);
                dado.set_estado(filledForm.get().estado.toUpperCase());
                dado.set_cidade(filledForm.get().cidade.toUpperCase());
                dado.set_faixasalarialInferior(filledForm.get().faixasalarialInferior);
                dado.set_faixasalarialSuperior(filledForm.get().faixasalarialSuperior);
                new AnuncioDAO().save(dado);
            }

            return redirect(routes.AnuncioController.detalhe(dado.uuid));
        }

    }



}

