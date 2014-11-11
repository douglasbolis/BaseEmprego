package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PreRequisito extends models.Entity {
    public PreRequisito(String nome){
        _nome = nome;
    }

    public PreRequisito() {}


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