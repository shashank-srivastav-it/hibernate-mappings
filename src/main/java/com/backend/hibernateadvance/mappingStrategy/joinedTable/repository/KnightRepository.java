package com.backend.hibernateadvance.mappingStrategy.joinedTable.repository;

import com.backend.hibernateadvance.mappingStrategy.joinedTable.entity.Knight;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Knight Data Rest Controller", description = "CRUD operations for Knight")
@RepositoryRestResource(path = "knights")
public interface KnightRepository extends JpaRepository<Knight, Long> {
}
