package com.backend.hibernateadvance.attributeConverter;

import com.backend.hibernateadvance.compositeKey.model.idClass.ManagerPKId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToManagerPKIdConverter implements Converter<String, ManagerPKId> {
    @Override //1-2 1-managerId 2-deptId
    public ManagerPKId convert(String source) {
        String[] parts = source.split("-");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid input format: " + source);
        }
        Long managerId = Long.valueOf(parts[0]);
        Long deptId = Long.valueOf(parts[1]);
        return new ManagerPKId(managerId, deptId);
    }
}
