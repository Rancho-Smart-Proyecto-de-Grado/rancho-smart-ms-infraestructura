package com.rancho_smart.ms_infraestructura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.ms_infraestructura.entity.Finca;
import com.rancho_smart.ms_infraestructura.repository.FincaRepository;

@Service
public class FincaService {

    @Autowired
    private FincaRepository fincaRepository;

    public List<Finca> getAllFincas() {
        return fincaRepository.findAll();
    }

    public Optional<Finca> getFincaById(Long id) {
        return fincaRepository.findById(id);
    }

    public Finca saveFinca(Finca finca) {
        return fincaRepository.save(finca);
    }

    public void deleteFinca(Long id) {
        fincaRepository.deleteById(id);
    }
}
