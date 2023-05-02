package com.backend.hibernateadvance.compositeKey.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonName implements Serializable {
    private String firstName;
    private String lastName;
}
