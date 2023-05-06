package com.backend.hibernateadvance.compositeKey.model.entity;

import com.backend.hibernateadvance.attributeConverter.PersonCallbacks;
import com.backend.hibernateadvance.attributeConverter.PersonNameConverter;
import com.backend.hibernateadvance.compositeKey.model.PersonName;
import com.backend.hibernateadvance.compositeKey.model.idClass.PersonPKId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@IdClass(PersonPKId.class)
@Table(name = "person_tbl")
@EntityListeners(PersonCallbacks.class)
public class Person {
    @Id
    private Long personId;
    @Id
    private Long deptId;
    @Convert(converter = PersonNameConverter.class)
    private PersonName personName;
    private String email;
    private String phone;
}
