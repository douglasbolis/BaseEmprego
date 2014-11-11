package models.forms;

import play.data.validation.Constraints;

/**
 * Created by clayton on 29/10/14.
 * modelo do formulario mestre
 */
public class MestreForm extends EntityForm {

    @Constraints.Required
    public String nome;

    @Constraints.Required
    public String estado;

    @Constraints.Required
    public String cidade;

    @Constraints.Required
    public Float empresa;



}
