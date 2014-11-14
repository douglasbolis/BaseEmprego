package models.dao;

import models.TipoBeneficio;

import java.util.List;

/**
 * Created by clayton on 30/10/14.
 */
public class TipoBeneficioDAO extends EntityDAO<TipoBeneficio>{

    public TipoBeneficioDAO(){
        super(TipoBeneficio.class);
    }


    public Boolean  Repetido (String tpBeneficio_uuid){
        Boolean xreturn = false;

        if (tpBeneficio_uuid.isEmpty()){

        }else
        {
            List<TipoBeneficio> saida  = this.all();

        }

        return xreturn;
    }

}
