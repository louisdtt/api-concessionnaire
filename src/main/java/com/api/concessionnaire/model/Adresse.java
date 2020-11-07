package com.api.concessionnaire.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Adresse {

    @Id
    private int _id;
    private int _numRue;
    private String _rue;
    private int _codePostal;
    private String _ville;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getNumRue() {
        return _numRue;
    }

    public void setNumRue(int _numRue) {
        this._numRue = _numRue;
    }

    public String getRue() {
        return _rue;
    }

    public void setRue(String _rue) {
        this._rue = _rue;
    }

    public int getCodePostal() {
        return _codePostal;
    }

    public void setCodePostal(int _codePostal) {
        this._codePostal = _codePostal;
    }

    public String getVille() {
        return _ville;
    }

    public void setVille(String _ville) {
        this._ville = _ville;
    }
}
