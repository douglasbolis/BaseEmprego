package models;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Beneficio extends models.Entity {
    public Beneficio(String nome){
        _nome = nome;
    }

    public Beneficio() {}


    @Column(name = "NOME", nullable = false)
    private String _nome;

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }


    public Anuncio get_anuncio() {
        return _anuncio;
    }

    public void set_anuncio(Anuncio _anuncio) {
        this._anuncio = _anuncio;
    }

    @ManyToOne
    @JoinColumn(name="anuncio_uuid")
    private Anuncio _anuncio;






}