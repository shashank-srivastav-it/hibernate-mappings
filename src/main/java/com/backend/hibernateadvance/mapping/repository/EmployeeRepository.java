package com.backend.hibernateadvance.mapping.repository;

import com.backend.hibernateadvance.mapping.entity.Employee;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Tag(name = "Employee Data Rest Controller", description = "CRUD operations for Employee")
@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
}
