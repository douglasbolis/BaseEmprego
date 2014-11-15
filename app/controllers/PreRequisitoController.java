package controllers;

import models.Beneficio;
import models.PreRequisito;
import models.dao.AnuncioDAO;
import models.dao.BeneficioDAO;
import models.dao.PreRequisitoDAO;
import models.forms.DetalheForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.PreRequisito.add;
import views.html.PreRequisito.update;

import java.util.UUID;


/**
 * Created by clayton on 29/10/14.
 * Controlador responsavel pela tabela detalhe
 */
public class PreRequisitoController extends Controller {


    final static Form<DetalheForm> _detalheForm = Form.form(DetalheForm.class);




    @play.db.jpa.Transactional
    public static Result add(String mestre_uuid){
        return persist(mestre_uuid, "");
    }

    @play.db.jpa.Transactional
    public static Result update(String uuid){
        return persist("", uuid);
    }





    @play.db.jpa.Transactional
    public static Result delete(String uuid){
        if (uuid != null && !uuid.isEmpty()){

            try{
                PreRequisitoDAO dao = new PreRequisitoDAO();
                PreRequisito item = dao.findOne(UUID.fromString(uuid));
                dao.delete(UUID.fromString(item.uuid));

                return AnuncioController.detalhe(item.get_anuncio().uuid);

            }catch (Exception e){
                return badRequest(views.html.error.render("Não foi possível encontrar o registro"));
            }



        }else
        {
            return badRequest(views.html.error.render("Não foi informado na requisicao o registro que deseja excluir"));

        }

    }





    private static Result persist(String mestre_uuid, String uuid){
        /*
        *  baseando na existencia do uuid podemos definir
        *
        *  vazio - adiciona
        *  preenchido - altera
        *
        * */
        if (uuid != null && !uuid.isEmpty()){
            PreRequisito alterar = new PreRequisitoDAO().findOne(UUID.fromString(uuid));
            DetalheForm frm = new DetalheForm();
            frm.uuid = alterar.uuid;
            frm.mestre_uuid = alterar.get_anuncio().uuid;
            frm.nome = alterar.get_nome();

            // preenchendo o formulario  com o conteudo do item solicitado
            return ok(update.render(_detalheForm.fill(frm)));

        }else
        {
            DetalheForm frm = new DetalheForm();
            frm.mestre_uuid = mestre_uuid;
            return ok(add.render(_detalheForm.fill(frm)));
        }


    }






    @play.db.jpa.Transactional
    public static Result addHandler(){
        Form<DetalheForm> filledForm = _detalheForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                    add.render(filledForm)
            );
        } else {

            PreRequisito dado = null;


            if (filledForm.value().isDefined() && filledForm.get().mestre_uuid != null) {

                UUID mestre_uuid = UUID.fromString(filledForm.get().mestre_uuid);
                if (mestre_uuid != null) {
                    dado = new PreRequisito();
                    dado.set_anuncio(new AnuncioDAO().findOne(mestre_uuid));
                    dado.set_nome(filledForm.get().nome);
                }
            }



            if (dado != null){
                new PreRequisitoDAO().save(dado);
            }

            return redirect(routes.AnuncioController.detalhe(filledForm.get().mestre_uuid));
        }

    }




    @play.db.jpa.Transactional
    public static Result updateHandler(){
        Form<DetalheForm> filledForm = _detalheForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                    update.render(filledForm)


            );
        } else {

            PreRequisito dado = null;

            if (filledForm.value().isDefined() && filledForm.value().get().uuid != null){
                dado = new PreRequisitoDAO().findOne(UUID.fromString(filledForm.get().uuid));
            }

            if (dado != null){
                dado.set_nome(filledForm.get().nome);
                new PreRequisitoDAO().save(dado);
            }

            return redirect(routes.AnuncioController.detalhe(filledForm.get().mestre_uuid));
        }

    }



}
