package com.backend.hibernateadvance.mappingStrategy.singleTable.repository;

import com.backend.hibernateadvance.mappingStrategy.singleTable.entity.Sculpture;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Sculptures Data Rest Controller", description = "CRUD operations for Sculptures")
@RepositoryRestResource(path = "sculptures")
public interface SculptureRepository extends JpaRepository<Sculpture, Long> {
}
