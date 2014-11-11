//https://www.playframework.com/documentation/2.3.x/JavaJPA

package models;

import models.dao.BeneficioDAO;
import models.dao.PreRequisitoDAO;


import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;

/**
 * Created by clayton on 29/10/14.
 */

@Entity
public class Anuncio extends models.Entity {
    public Anuncio(String nome){
        _nome = nome;
    }

    public Anuncio() {}

    public List<Beneficio> get_beneficios(){
        return new BeneficioDAO().findMany("_anuncio",this);
    }

    public List<PreRequisito> get_prerequisitos(){
        return new PreRequisitoDAO().findMany("_anuncio",this);
    }


    @Column(name = "NOME", nullable = false)
    private String _nome;

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }






}
