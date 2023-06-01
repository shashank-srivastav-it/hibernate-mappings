package com.backend.hibernateadvance.mappingStrategy.tablePerClass.repository;

import com.backend.hibernateadvance.mappingStrategy.tablePerClass.entity.Person;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Person Data Rest Controller", description = "CRUD operations for Persons")
@RepositoryRestResource(path = "persons")
public interface PersonRepository extends JpaRepository<Person, Long> {
}
