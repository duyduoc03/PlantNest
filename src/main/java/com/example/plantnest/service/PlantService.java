package com.example.plantnest.service;

import com.example.plantnest.entity.Plant;
import com.example.plantnest.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService {

    @Autowired
    private PlantRepository plantRepository;

    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    public Plant createPlant(Plant plant) {
        return plantRepository.save(plant);
    }
}
