package com.backend.hibernateadvance.compositeKey.model.entity;

import com.backend.hibernateadvance.attributeConverter.PersonCallbacks;
import com.backend.hibernateadvance.attributeConverter.PersonNameConverter;
import com.backend.hibernateadvance.compositeKey.model.PersonName;
import com.backend.hibernateadvance.compositeKey.model.idClass.PersonPKId;
import com.backend.hibernateadvance.config.SpringContextHelper;
import com.backend.hibernateadvance.services.EncryptionService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @PrePersist
    @PreUpdate
    public void beforeInsertOrUpdate() {
        System.out.println("before update was called...");
        this.setEmail(getEncryptionService().encrypt(this.getEmail()));
    }

    @PostLoad
    public void postLoad() {
        System.out.println("Post Load was called...");
        this.setEmail(getEncryptionService().decrypt(this.getEmail()));
    }

    private EncryptionService getEncryptionService() {
        return SpringContextHelper.getApplicationContext().getBean(EncryptionService.class);
    }
}
