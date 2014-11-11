package controllers;

import models.Anuncio;
import models.dao.AnuncioDAO;
import models.forms.MestreForm;
import play.data.Form;
import play.mvc.*;
import views.html.Anuncio.add;
import views.html.Anuncio.update;
import java.util.UUID;


/**
 * Created by clayton on 29/10/14.
 * Controlador responsavel pela tabela mestre
 */
public class AnuncioController extends Controller {


    final static Form<MestreForm> _mestreForm = Form.form(MestreForm.class);

    @play.db.jpa.Transactional
    public static Result index() {
        return ok(views.html.Anuncio.index.render(new AnuncioDAO().all()));
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
                badRequest(views.html.Anuncio.index.render(new AnuncioDAO().all()));
            }

            return index();

        }else
        {
            return badRequest(views.html.Anuncio.index.render(new AnuncioDAO().all()));

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


            if (filledForm.value().isDefined())
                dado = new Anuncio(filledForm.value().get().nome);

            if (dado != null){
                new AnuncioDAO().save(dado);
            }

            return redirect(routes.AnuncioController.index());
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
                new AnuncioDAO().save(dado);
            }

            return redirect(routes.AnuncioController.index());
        }

    }



}
