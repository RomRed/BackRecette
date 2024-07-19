package com.example.recette.service;

import com.example.recette.model.entity.Continent;
import com.example.recette.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContinentService {

    @Autowired
    private ContinentRepository continentRepository;

    public List<Continent> getAllContinents() {
        return continentRepository.findAll();
    }

    public Optional<Continent> getContinentById(Long id) {
        return continentRepository.findById(id);
    }

    public Continent saveContinent(Continent continent) {
        return continentRepository.save(continent);
    }

    public void deleteContinent(Long id) {
        continentRepository.deleteById(id);
    }
}