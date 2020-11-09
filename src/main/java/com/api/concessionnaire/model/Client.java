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

    public Set<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(Set<Voiture> voitures) {
        this.voitures = voitures;
    }
}
