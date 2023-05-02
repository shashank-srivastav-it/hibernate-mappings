package com.backend.hibernateadvance.compositeKey.model.entity;

import com.backend.hibernateadvance.compositeKey.model.idClass.ManagerPKId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "manager_tbl")
public class Manager {
    @EmbeddedId
    private ManagerPKId managerPKId;
    private String name;
    private String email;
    private String phone;
}
