package com.backend.hibernateadvance.mappingStrategy.mappedSuperClass.repository;

import com.backend.hibernateadvance.mappingStrategy.mappedSuperClass.entity.Tank;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Tank Data Rest Controller", description = "CRUD operations for Tank")
@RepositoryRestResource(path = "tanks")
public interface TankRepository extends JpaRepository<Tank, Long> {
}
