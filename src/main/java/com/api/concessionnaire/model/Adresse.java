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
}
