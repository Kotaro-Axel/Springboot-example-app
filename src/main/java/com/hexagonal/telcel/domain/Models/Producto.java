package com.hexagonal.telcel.domain.Models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {
    private Long id;
    private String nombre_producto;
    private BigDecimal precio;
    private LocalDateTime fecha_de_creacion;


    public Producto(Long id, String nombre_producto, BigDecimal precio, LocalDateTime fecha_de_creacion) {
        this.id = id;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.fecha_de_creacion = fecha_de_creacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public LocalDateTime getFecha_de_creacion() {
        return fecha_de_creacion;
    }

    public void setFecha_de_creacion(LocalDateTime fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }
}
