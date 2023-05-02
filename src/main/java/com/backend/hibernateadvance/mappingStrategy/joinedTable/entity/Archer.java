package com.backend.hibernateadvance.mappingStrategy.joinedTable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Archer extends Infantry {
    private Integer range;
}
