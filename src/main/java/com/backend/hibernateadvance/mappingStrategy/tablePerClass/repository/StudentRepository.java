package com.backend.hibernateadvance.mappingStrategy.tablePerClass.repository;

import com.backend.hibernateadvance.mappingStrategy.tablePerClass.entity.Student;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "Student Data Rest Controller", description = "CRUD operations for Students")
@RepositoryRestResource(path = "students")
public interface StudentRepository extends JpaRepository<Student, Long> {
}
