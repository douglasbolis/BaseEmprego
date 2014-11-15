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

// quando converte para json ocorre erro de recursividade
//    public List<Beneficio> get_beneficios(){
//        return new BeneficioDAO().findMany("_anuncio",this);
//    }
//
//    public List<PreRequisito> get_prerequisitos(){
//        return new PreRequisitoDAO().findMany("_anuncio",this);
//    }


    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }





    public String get_estado() {
        return _estado;
    }

    public void set_estado(String _estado) {
        this._estado = _estado;
    }

    public String get_cidade() {
        return _cidade;
    }

    public void set_cidade(String _cidade) {
        this._cidade = _cidade;
    }


    public Float get_faixasalarialInferior() {
        return _faixasalarialInferior;
    }

    public void set_faixasalarialInferior(Float _faixasalarialInferior) {
        this._faixasalarialInferior = _faixasalarialInferior;
    }

    public Float get_faixasalarialSuperior() {
        return _faixasalarialSuperior;
    }

    public void set_faixasalarialSuperior(Float _faixasalarialSuperior) {
        this._faixasalarialSuperior = _faixasalarialSuperior;
    }


    @Column(name = "NOME", nullable = false)
    private String _nome;

    public String get_area() {
        return _area;
    }

    public void set_area(String _area) {
        this._area = _area;
    }

    public String get_escolaridadeMinima() {
        return _escolaridadeMinima;
    }

    public void set_escolaridadeMinima(String _escolaridadeMinima) {
        this._escolaridadeMinima = _escolaridadeMinima;
    }

    @Column(name = "AREA")
    private String _area;

    @Column(name = "ESCOLARIDADE_MINIMA")
    private String _escolaridadeMinima;


    @Column(name = "UF", nullable = false)
    private String _estado;

    @Column(name = "CIDADE", nullable = false)
    private String _cidade;




    @Column(name = "FAIXA_SALARIAL_INFERIOR")
    private Float _faixasalarialInferior;


    @Column(name = "FAIXA_SALARIAL_SUPERIOR")
    private Float _faixasalarialSuperior;






}
