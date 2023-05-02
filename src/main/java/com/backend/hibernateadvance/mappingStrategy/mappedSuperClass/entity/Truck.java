package com.backend.hibernateadvance.mappingStrategy.mappedSuperClass.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Truck extends Vehicle {
    private Integer maxLoad;
    private Boolean sleeperCab;
}
