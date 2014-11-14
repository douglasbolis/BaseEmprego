package controllers;

import models.Beneficio;
import models.dao.BeneficioDAO;
import models.dao.AnuncioDAO;
import models.dao.TipoBeneficioDAO;
import models.forms.BeneficioForm;
import models.forms.DetalheForm;

import play.data.Form;
import play.mvc.*;
import views.html.Beneficio.add;
import views.html.Beneficio.update;


import java.util.UUID;


/**
 * Created by clayton on 29/10/14.
 * Controlador responsavel pela tabela detalhe
 */
public class BeneficioController extends Controller {


    final static Form<BeneficioForm> _detalheForm = Form.form(BeneficioForm.class);




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
                (new BeneficioDAO()).delete(UUID.fromString(uuid));
            }catch (Exception e){
                badRequest(views.html.Anuncio.index.render(new AnuncioDAO().all()));
            }

            return AnuncioController.index();

        }else
        {
            return badRequest(views.html.Anuncio.index.render(new AnuncioDAO().all()));

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
            Beneficio alterar = new BeneficioDAO().findOne(UUID.fromString(uuid));
            BeneficioForm frm = new BeneficioForm();
            frm.uuid = alterar.uuid;
            frm.mestre_uuid = alterar.get_anuncio().uuid;
            frm.ListtpBeneficio = new TipoBeneficioDAO().all();
            frm.tpBeneficio = alterar.get_tpBeneficio();

            // preenchendo o formulario  com o conteudo do item solicitado
            return ok(update.render(_detalheForm.fill(frm)));

        }else
        {
            BeneficioForm frm = new BeneficioForm();
            frm.mestre_uuid = mestre_uuid;
            return ok(add.render(_detalheForm.fill(frm)));
        }


    }






    @play.db.jpa.Transactional
    public static Result addHandler(){
        Form<BeneficioForm> filledForm = _detalheForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                    add.render(filledForm)
            );
        } else {

            Beneficio dado = null;


            if (filledForm.value().isDefined() && filledForm.get().mestre_uuid != null) {

                UUID mestre_uuid = UUID.fromString(filledForm.get().mestre_uuid);
                if (mestre_uuid != null) {
                    dado = new Beneficio(filledForm.get().tpBeneficio);
                    dado.set_anuncio(new AnuncioDAO().findOne(mestre_uuid));
                }
            }



            if (dado != null){
                new BeneficioDAO().save(dado);
            }

            return redirect(routes.AnuncioController.index());
        }

    }




    @play.db.jpa.Transactional
    public static Result updateHandler(){
        Form<BeneficioForm> filledForm = _detalheForm.bindFromRequest();
        if(filledForm.hasErrors()) {
            return badRequest(
                    update.render(filledForm)

            );
        } else {

            Beneficio dado = null;

            if (filledForm.value().isDefined() && filledForm.value().get().uuid != null){
                dado = new BeneficioDAO().findOne(UUID.fromString(filledForm.get().uuid));
            }

            if (dado != null){
                dado.set_tpBeneficio(filledForm.get().tpBeneficio);
                new BeneficioDAO().save(dado);
            }

            return redirect(routes.AnuncioController.index());
        }

    }



}
