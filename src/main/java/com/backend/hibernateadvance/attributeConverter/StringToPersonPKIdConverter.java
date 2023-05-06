package com.backend.hibernateadvance.attributeConverter;


import com.backend.hibernateadvance.compositeKey.model.idClass.PersonPKId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

//@Component
//public class StringToPersonPKIdConverter implements Converter<String, PersonPKId> {
//    @Override
//    public PersonPKId convert(String source) {
//        String[] parts = source.split(",");
//        Long personId = Long.valueOf(parts[0]);
//        Long deptId = Long.valueOf(parts[1]);
//        return new PersonPKId(personId, deptId);
//    }
//
//}