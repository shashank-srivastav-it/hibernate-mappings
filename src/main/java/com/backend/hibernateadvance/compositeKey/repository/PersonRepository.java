package com.backend.hibernateadvance.compositeKey.repository;

import com.backend.hibernateadvance.compositeKey.model.entity.Person;
import com.backend.hibernateadvance.compositeKey.model.idClass.PersonPKId;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Person Data Rest Controller", description = "CRUD operations for Persons")
@RepositoryRestResource(path = "persons")
public interface PersonRepository extends JpaRepository<Person, PersonPKId> {
}
