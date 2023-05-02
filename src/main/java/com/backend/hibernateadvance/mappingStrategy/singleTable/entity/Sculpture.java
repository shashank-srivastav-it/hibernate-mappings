package com.backend.hibernateadvance.mappingStrategy.singleTable.entity;

import com.backend.hibernateadvance.mappingStrategy.singleTable.enumeration.Material;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue(value = "SCULPTURE")
public class Sculpture extends ArtPiece {

    @Enumerated(value = EnumType.STRING)
    private Material material;
    private Double weight;
}
