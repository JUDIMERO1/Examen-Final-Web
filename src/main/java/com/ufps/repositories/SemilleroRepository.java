package com.ufps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ufps.entities.Semillero;

public interface SemilleroRepository extends JpaRepository<Semillero, Integer> {
	
}