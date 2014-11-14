package models.forms;

import models.TipoBeneficio;
import models.TipoPreRequisito;
import play.data.validation.Constraints;

import java.util.List;

/**
 * Created by clayton on 29/10/14.
 * Modelo do formulario detalhe
 */
public class PreRequisitoForm extends EntityForm {


    public List<TipoPreRequisito> listTpPreRequisito;

    @Constraints.Required
    public TipoBeneficio  tpPreRequisito;

    public String mestre_uuid;

    public String uuid;

}
