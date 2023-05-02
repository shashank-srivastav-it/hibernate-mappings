package com.backend.hibernateadvance.compositeKey.entity;

import com.backend.hibernateadvance.compositeKey.entity.idClass.PersonPKId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@IdClass(PersonPKId.class)
@Table(name = "person_tbl")
public class Person {
    @Id
    private Long personId;
    @Id
    private Long deptId;
    private String name;
    private String email;
    private String phone;
}
