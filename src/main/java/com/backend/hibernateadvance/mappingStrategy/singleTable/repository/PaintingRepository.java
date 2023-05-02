package com.backend.hibernateadvance.mappingStrategy.singleTable.repository;

import com.backend.hibernateadvance.mappingStrategy.singleTable.entity.Painting;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Painting Data Rest Controller", description = "CRUD operations for Painting")
@RepositoryRestResource(path = "paintings")
public interface PaintingRepository extends JpaRepository<Painting, Long> {
}
