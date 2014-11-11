package models.forms;

import play.data.validation.Constraints;

/**
 * Created by clayton on 29/10/14.
 * Modelo do formulario detalhe
 */
public class DetalheForm extends EntityForm {

    @Constraints.Required
    public String nome;


    public String mestre_uuid;

    public String uuid;

}
