package com.hexagonal.telcel.domain.Models;

import java.time.LocalDateTime;

public class Empleado {

    private Long id;
    private String nombre;
    private String apellidos;
    private String num_telefonico;
    private String fecha_de_nacimiento;
    private boolean esAdmin;
    private LocalDateTime fecha_de_creacion;

    public Empleado(Long id, String nombre, String apellidos, String num_telefonico, String fecha_de_nacimiento, boolean esAdmin, LocalDateTime fecha_de_creacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_telefonico = num_telefonico;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.esAdmin = esAdmin;
        this.fecha_de_creacion = fecha_de_creacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNum_telefonico() {
        return num_telefonico;
    }

    public void setNum_telefonico(String num_telefonico) {
        this.num_telefonico = num_telefonico;
    }

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public LocalDateTime getFecha_de_creacion() {
        return fecha_de_creacion;
    }

    public void setFecha_de_creacion(LocalDateTime fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }
}
