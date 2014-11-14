package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TipoBeneficio extends models.Entity {
    public TipoBeneficio(String nome){
        _nome = nome;
    }

    public TipoBeneficio() {}


    @Column(name = "NOME", nullable = false)
    private String _nome;

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }







}