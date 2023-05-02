package com.backend.hibernateadvance.compositeKey.model.idClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class ManagerPKId implements Serializable {
    private Long managerId;
    private Long deptId;
}
