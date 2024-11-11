package com.rancho_smart.ms_infraestructura.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rancho_smart.ms_infraestructura.entity.Finca;
import com.rancho_smart.ms_infraestructura.service.FincaService;

@RestController
@RequestMapping("/fincas")
public class FincaRESTController {

    @Autowired
    private FincaService fincaService;

    @GetMapping
    public ResponseEntity<List<Finca>> getAllFincas() {
        List<Finca> fincas = fincaService.getAllFincas();
        return new ResponseEntity<>(fincas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Finca> getFincaById(@PathVariable Long id) {
        Optional<Finca> finca = fincaService.getFincaById(id);
        return finca.map(ResponseEntity::ok)
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/usuario/{idUsuario}")
    public ResponseEntity<List<Finca>> getFincasByIdUsuario(@PathVariable Long idUsuario){
        List<Finca> fincasUsuario = this.fincaService.getFincasByIdUsuario(idUsuario);
        if(!fincasUsuario.isEmpty()){
            return new ResponseEntity<>(fincasUsuario, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping
    public ResponseEntity<Finca> createFinca(@RequestBody Finca finca) {
        Finca newFinca = fincaService.saveFinca(finca);
        return new ResponseEntity<>(newFinca, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Finca> updateFinca(@PathVariable Long id, @RequestBody Finca finca) {
        if (!fincaService.getFincaById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        finca.setIdFinca(id);
        Finca updatedFinca = fincaService.saveFinca(finca);
        return new ResponseEntity<>(updatedFinca, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFinca(@PathVariable Long id) {
        if (!fincaService.getFincaById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        fincaService.deleteFinca(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
