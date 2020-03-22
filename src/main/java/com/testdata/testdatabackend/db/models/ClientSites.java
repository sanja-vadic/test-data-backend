package com.testdata.testdatabackend.db.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ClientSites {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String domain;
    private Integer clientId;
}
