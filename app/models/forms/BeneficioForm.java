package models.forms;

import models.TipoBeneficio;
import play.data.validation.Constraints;

import java.util.List;

/**
 * Created by clayton on 29/10/14.
 * Modelo do formulario detalhe
 */
public class BeneficioForm extends EntityForm {


    public List<TipoBeneficio> ListtpBeneficio;

    @Constraints.Required
    public TipoBeneficio tpBeneficio;


    public String mestre_uuid;

    public String uuid;

}
