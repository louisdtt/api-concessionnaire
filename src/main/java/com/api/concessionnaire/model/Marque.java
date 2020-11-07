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
    private int id;
    private String name;
    @ManyToOne
    private Voiture voiture;
    @ManyToOne
    private Client client;

}
