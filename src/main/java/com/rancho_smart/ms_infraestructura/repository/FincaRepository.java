package com.rancho_smart.ms_infraestructura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rancho_smart.ms_infraestructura.entity.Finca;
import java.util.List;


@Repository

public interface FincaRepository extends JpaRepository<Finca, Long>{
    public List<Finca> findByIdUsuario(Long idUsuario);
}
