package com.backend.hibernateadvance.compositeKey.repository;


import com.backend.hibernateadvance.compositeKey.model.entity.Manager;
import com.backend.hibernateadvance.compositeKey.model.idClass.ManagerPKId;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Manager Data Rest Controller", description = "CRUD operations for Managers")
@RepositoryRestResource(path = "managers")
public interface ManagerRepository extends JpaRepository<Manager, ManagerPKId> {
}
