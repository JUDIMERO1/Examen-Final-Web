package com.ufps.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.entities.Semillero;
import com.ufps.repositories.SemilleroRepository;

@Service
public class SemilleroService {
    @Autowired
    private SemilleroRepository semilleroRepository;

    public void deleteById(int id) {
        semilleroRepository.deleteById(id);
    }

    public Optional<Semillero> findById(int id) {
        return semilleroRepository.findById(id);
    }
}
