package com.backend.hibernateadvance.mapping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Column
    protected String street;

    @Column
    protected String zipcode;

    @Column
    protected String city;
}
