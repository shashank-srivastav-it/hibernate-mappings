package com.backend.hibernateadvance.mappingStrategy.tablePerClass.repository;

import com.backend.hibernateadvance.mappingStrategy.tablePerClass.entity.Instructor;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Instructor Data Rest Controller", description = "CRUD operations for Instructors")
@RepositoryRestResource(path = "instructors")
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
