package com.backend.hibernateadvance.mappingStrategy.joinedTable.repository;

import com.backend.hibernateadvance.mappingStrategy.joinedTable.entity.Archer;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Archer Data Rest Controller", description = "CRUD operations for Archer")
@RepositoryRestResource(path = "archers")
public interface ArcherRepository extends JpaRepository<Archer, Long> {
}