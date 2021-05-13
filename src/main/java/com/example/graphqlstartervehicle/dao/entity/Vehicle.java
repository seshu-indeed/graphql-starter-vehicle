package com.example.graphqlstartervehicle.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String type;

    private String modelCode;

    private String brandName;

    private LocalDate launchDate;

    private transient  String formattedDate;

    // Getter and setter
    public String getFormattedDate() {
        return getLaunchDate().toString();
    }
}