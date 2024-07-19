package com.example.recette.controller;

import com.example.recette.model.entity.Continent;
import com.example.recette.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/continents")
public class ContinentController {

    @Autowired
    private ContinentService continentService;

    @GetMapping
    public List<Continent> getAllContinents() {
        return continentService.getAllContinents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Continent> getContinentById(@PathVariable Long id) {
        Optional<Continent> continent = continentService.getContinentById(id);
        return continent.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Continent createContinent(@RequestBody Continent continent) {
        return continentService.saveContinent(continent);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Continent> updateContinent(@PathVariable Long id, @RequestBody Continent updatedContinent) {
        if (!continentService.getContinentById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        updatedContinent.setId(Math.toIntExact(id));
        return ResponseEntity.ok(continentService.saveContinent(updatedContinent));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContinent(@PathVariable Long id) {
        if (!continentService.getContinentById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        continentService.deleteContinent(id);
        return ResponseEntity.noContent().build();
    }
}
