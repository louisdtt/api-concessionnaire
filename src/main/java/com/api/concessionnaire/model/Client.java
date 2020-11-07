package com.api.concessionnaire.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Client {

    @Id
    private int id;
    private String name;
    @OneToMany
    @JoinColumn(name = "client_id")
    private Set<Voiture> voitures = new HashSet<Voiture>();
}
