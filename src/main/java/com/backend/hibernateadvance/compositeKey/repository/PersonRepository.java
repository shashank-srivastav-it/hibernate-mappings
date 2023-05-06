package com.backend.hibernateadvance.compositeKey.repository;

import com.backend.hibernateadvance.compositeKey.model.entity.Person;
import com.backend.hibernateadvance.compositeKey.model.idClass.PersonPKId;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Tag(name = "Person Data Rest Controller", description = "CRUD operations for Persons")
@RepositoryRestResource(collectionResourceRel = "persons", path = "persons", itemResourceRel = "persons/{personId}_{deptId}")
public interface PersonRepository extends JpaRepository<Person, PersonPKId> {

    @RestResource(path = "personId/deptId")
    List<Person> findByPersonIdAndDeptId(@Param("personId") Long personId, @Param("deptId") Long deptId);

    @RestResource(exported = false)
    void deleteById(PersonPKId id);

    @RestResource(exported = false)
    Optional<Person> findById(PersonPKId id);
}
