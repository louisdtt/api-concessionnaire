package com.api.concessionnaire.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Adresse {

    @Id
    private int id;
    private int numRue;
    private String rue;
    private int codePostal;
    private String ville;

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int _numRue) {
        this.numRue = _numRue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String _rue) {
        this.rue = _rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int _codePostal) {
        this.codePostal = _codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String _ville) {
        this.ville = _ville;
    }
}
