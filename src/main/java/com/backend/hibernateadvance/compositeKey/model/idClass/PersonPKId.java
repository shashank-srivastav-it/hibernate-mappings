package com.backend.hibernateadvance.compositeKey.model.idClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PersonPKId implements Serializable {
    private Long personId;
    private Long deptId;
}
