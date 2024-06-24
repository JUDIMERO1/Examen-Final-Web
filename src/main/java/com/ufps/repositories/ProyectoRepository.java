package com.ufps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufps.entities.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
    List<Proyecto> findByLineaId(Long lineaId);
}