package controllers;

import models.Anuncio;
import models.Beneficio;
import models.PreRequisito;
import models.dao.AnuncioDAO;
import models.dao.BeneficioDAO;
import models.dao.PreRequisitoDAO;
import models.forms.MestreForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import views.html.Anuncio.add;
import views.html.Anuncio.update;

import java.util.List;
import java.util.UUID;


/**
 * Created by clayton on 29/10/14.
 * Controlador responsavel pela tabela mestre
 */
public class AnuncioController extends Controller {


    final static Form<MestreForm> _mestreForm = Form.form(MestreForm.class);

//    @play.db.jpa.Transactional
//    public static Result index() {
//        return ok(views.html.Anuncio.index.render(new AnuncioDAO().all()));
//    }

    @play.db.jpa.Transactional
    public static  Result index(){
        List<Anuncio> anuncios = new AnuncioDAO().all();

        return ok(Json.toJson(anuncios));
    }


    @play.db.jpa.Transactional
    public static Result detalhe(String uuid){
        Anuncio anuncio  = new AnuncioDAO().findOne(UUID.fromString(uuid));
        List<Beneficio> lstBeneficio = new BeneficioDAO().findMany("_anuncio",anuncio.uuid);
        List<PreRequisito> lstPreRequisito = new PreRequisitoDAO().findMany("_anuncio",anuncio.uuid);
        return ok (views.html.Anuncio.detalhe.render(anuncio,lstBeneficio,lstPreRequisito));

    }

//    @play.db.jpa.Transactional
//    public static Result indexuf(String UF) {
//        return ok(views.html.Anuncio.index.render(new AnuncioDAO().findMany("_estado",UF.toUpperCase())));
//    }







    @play.db.jpa.Transactional
    public static Result add(){
        return persist("");
    }

    @play.db.jpa.Transactional
    public static Result update(String uuid){
        return persist(uuid);
    }


//    @play.db.jpa.Transactional
//    public static Result delete(String uuid){
//        if (uuid != null && !uuid.isEmpty()){
//            try{
//                (new AnuncioDAO()).delete(UUID.fromString(uuid));
//            }catch (Exception e){
//                badRequest(views.html.Anuncio.index.render(new AnuncioDAO().all()));
//            }
//
//            return index();
//
//        }else
//        {
//            return badRequest(views.html.Anuncio.index.render(new AnuncioDAO().all()));
//
//        }
//
//    }





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
            //TODO fazer tratamento de mascara
            frm.faixasalarialInferior = alterar.get_faixasalarialInferior();
            frm.faixasalarialSuperior = alterar.get_faixasalarialSuperior();



            // preenchendo o formulario  com o conteudo do item solicitado
            return ok(update.render(_mestreForm.fill(frm)));

        }else
        {
            return ok(add.render(_mestreForm));
        }


    }






    @play.db.jpa.Transactional
    public static Result addHandler(){
        Form<MestreForm> filledForm = _mestreForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                    add.render(filledForm)
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
                    update.render(filledForm)

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
