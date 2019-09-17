package com.shiffler.springbootdemo.jacksondemo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
//If there's an unknown property in our JSON source it is ok to ignore it.
//This is keeping the middleName attribute in our sample-full.json file from breaking
//the application
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private boolean active;
    private Address address;
    private String[] languages;

}
