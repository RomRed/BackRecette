package com.example.recette.repository;

import com.example.recette.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByLibRole(String libRole);
}
