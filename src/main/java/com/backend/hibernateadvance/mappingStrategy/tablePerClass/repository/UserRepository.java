package com.backend.hibernateadvance.mappingStrategy.tablePerClass.repository;

import com.backend.hibernateadvance.mappingStrategy.tablePerClass.entity.User;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Tag(name = "User Data Rest Controller", description = "CRUD operations for Users")
@RepositoryRestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Long> {
}
