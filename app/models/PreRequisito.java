package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PreRequisito extends models.Entity {
    public PreRequisito(TipoPreRequisito tpPreRequisito){
        _tpPreRequisito = tpPreRequisito;
    }


    public TipoPreRequisito get_tpPreRequisito() {
        return _tpPreRequisito;
    }

    public void set_tpPreRequisito(TipoPreRequisito _tpPreRequisito) {
        this._tpPreRequisito = _tpPreRequisito;
    }

    @ManyToOne
    @JoinColumn(name="tipo_prerequisito_uuid")
    private TipoPreRequisito _tpPreRequisito;


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