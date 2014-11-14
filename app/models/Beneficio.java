package models;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Beneficio extends models.Entity {
    public Beneficio(TipoBeneficio tpBeneficio){
        _tpBeneficio = tpBeneficio;
    }


    public TipoBeneficio get_tpBeneficio() {
        return _tpBeneficio;
    }

    public void set_tpBeneficio(TipoBeneficio _tpBeneficio) {
        this._tpBeneficio = _tpBeneficio;
    }

    @ManyToOne
    @JoinColumn(name="tipo_beneficio_uuid")
    private TipoBeneficio _tpBeneficio;



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