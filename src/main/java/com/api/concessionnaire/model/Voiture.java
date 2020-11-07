package com.api.concessionnaire.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Voiture {

    @Id
    private int _id;
    private String _name;
}
