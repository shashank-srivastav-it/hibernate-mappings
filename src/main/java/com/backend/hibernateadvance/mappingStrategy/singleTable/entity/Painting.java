package com.backend.hibernateadvance.mappingStrategy.singleTable.entity;

import com.backend.hibernateadvance.mappingStrategy.singleTable.enumeration.PaintingTechnique;
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
@DiscriminatorValue(value = "PAINTING")
public class Painting extends ArtPiece {

    @Enumerated(value = EnumType.STRING)
    private PaintingTechnique paintingTechnique;
    private Double width;
    private Double height;

}
