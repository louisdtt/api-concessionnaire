package com.api.concessionnaire.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Concessionnaire {

    @Id
    private int id;
    private String name;
    @ManyToOne
    private Adresse adresse;
    @ManyToMany
    @JoinTable(
            name = "marque_concessionnaire",
            joinColumns = @JoinColumn(name = "marque_id"),
            inverseJoinColumns = @JoinColumn(name = "concessionnaire_id")
    )
    Set<Marque> marques;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Set<Marque> getMarques() {
        return marques;
    }

    public void setMarques(Set<Marque> marques) {
        this.marques = marques;
    }
}
