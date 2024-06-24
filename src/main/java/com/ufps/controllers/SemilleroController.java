package com.ufps.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufps.services.SemilleroService;

@RestController
@RequestMapping("/api/semilleros")
public class SemilleroController {
    private final SemilleroService semilleroService = new SemilleroService();

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSemillero(@PathVariable Integer id) {
        if (!semilleroService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        semilleroService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
