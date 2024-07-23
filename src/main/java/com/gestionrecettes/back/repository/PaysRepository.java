package com.gestionrecettes.back.repository;

import com.gestionrecettes.back.model.entity.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Integer> {
}
