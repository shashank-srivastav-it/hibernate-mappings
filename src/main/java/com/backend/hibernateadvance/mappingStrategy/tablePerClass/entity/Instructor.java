package com.backend.hibernateadvance.mappingStrategy.tablePerClass.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Instructor extends User {
    private Double salary;
}
