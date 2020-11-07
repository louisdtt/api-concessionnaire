package com.api.concessionnaire.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Concessionnaire {

    @Id
    private int _id;
    private String _name;
    @ManyToOne
    private Adresse _adresse;
    @ManyToMany
    @JoinTable(
            name = "marque_concessionnaire",
            joinColumns = @JoinColumn(name = "marque_id"),
            inverseJoinColumns = @JoinColumn(name = "concessionnaire_id")
    )
    Set<Marque> marques;
}
