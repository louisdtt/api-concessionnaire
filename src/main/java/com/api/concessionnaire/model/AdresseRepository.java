package com.api.concessionnaire.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface AdresseRepository extends JpaRepository<Adresse, Integer> {
}
