package com.backend.hibernateadvance.mappingStrategy.mappedSuperClass.repository;

import com.backend.hibernateadvance.mappingStrategy.mappedSuperClass.entity.Truck;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Truck Data Rest Controller", description = "CRUD operations for Truck")
@RepositoryRestResource(path = "trucks")
public interface TruckRepository extends JpaRepository<Truck, Long> {
}
