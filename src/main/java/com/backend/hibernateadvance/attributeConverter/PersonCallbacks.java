package com.backend.hibernateadvance.attributeConverter;

import com.backend.hibernateadvance.compositeKey.model.entity.Person;
import com.backend.hibernateadvance.config.SpringContextHelper;
import com.backend.hibernateadvance.services.EncryptionService;

import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class PersonCallbacks {

    @PrePersist
    @PreUpdate
    public void beforeInsertOrUpdate(Person person) {
        System.out.println("before update was called...");
        person.setPhone(getEncryptionService().encrypt(person.getPhone()));
    }

    @PostLoad
    public void postLoad(Person person) {
        System.out.println("Post Load was called...");
        person.setPhone(getEncryptionService().decrypt(person.getPhone()));
    }

    private EncryptionService getEncryptionService() {
        return SpringContextHelper.getApplicationContext().getBean(EncryptionService.class);
    }
}
