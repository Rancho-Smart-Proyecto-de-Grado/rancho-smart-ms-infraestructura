package com.rancho_smart.ms_infraestructura.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FINCA")
public class Finca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFinca;

    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "AREA_TOTAL")
    private double areaTotal;

    @Column(name = "FECHA_REGISTRO")
    private LocalDateTime fechaRegistro;

    @Column(name = "DESCRIPCION_FINCA")
    private String descripcionFinca;

    @Column(name = "OBSERVACIONES")
    private String observaciones;

    @Column(name = "FOTO")
    private byte[] foto;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Long> empleados;

    public Finca() {
    }

    public Finca(Long idUsuario, String nombre, String direccion, double areaTotal, LocalDateTime fechaRegistro,
            String descripcionFinca, String observaciones, byte[] foto, List<Long> empleados) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.direccion = direccion;
        this.areaTotal = areaTotal;
        this.fechaRegistro = fechaRegistro;
        this.descripcionFinca = descripcionFinca;
        this.observaciones = observaciones;
        this.foto = foto;
        this.empleados = empleados;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getDescripcionFinca() {
        return descripcionFinca;
    }

    public void setDescripcionFinca(String descripcionFinca) {
        this.descripcionFinca = descripcionFinca;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public List<Long> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Long> empleados) {
        this.empleados = empleados;
    }

    
}
