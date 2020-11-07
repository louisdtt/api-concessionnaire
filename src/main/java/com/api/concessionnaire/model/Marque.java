package com.api.concessionnaire.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity
@Data
public class Marque {

    @Id
    private int _id;
    private String _name;
    @ManyToOne
    private Voiture _voiture;
    @ManyToOne
    private Client _client;
    @ManyToMany(mappedBy = "_marques")
    Set<Concessionnaire> _concessionnaires;
}
