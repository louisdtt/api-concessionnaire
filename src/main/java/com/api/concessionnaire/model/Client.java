package com.api.concessionnaire.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Data
public class Client {

    @Id
    private int _id;
    private String _name;
}
