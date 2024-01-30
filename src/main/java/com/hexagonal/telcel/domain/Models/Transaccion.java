package com.hexagonal.telcel.domain.Models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaccion {

    private Long id;
    private Long empleadoiD;
    private Long prouctoiD;
    private float cantidad;
    private String metodo_de_pago;
    private BigDecimal total;
    private LocalDateTime fecha_de_creacion;


    public Transaccion(Long id, Long empleadoiD, Long prouctoiD, float cantidad,
                       String metodo_de_pago, BigDecimal total, LocalDateTime fecha_de_creacion) {
        this.id = id;
        this.empleadoiD = empleadoiD;
        this.prouctoiD = prouctoiD;
        this.cantidad = cantidad;
        this.metodo_de_pago = metodo_de_pago;
        this.total = total;
        this.fecha_de_creacion = fecha_de_creacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmpleadoiD() {
        return empleadoiD;
    }

    public void setEmpleadoiD(Long empleadoiD) {
        this.empleadoiD = empleadoiD;
    }

    public Long getProuctoiD() {
        return prouctoiD;
    }

    public void setProuctoiD(Long prouctoiD) {
        this.prouctoiD = prouctoiD;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getMetodo_de_pago() {
        return metodo_de_pago;
    }

    public void setMetodo_de_pago(String metodo_de_pago) {
        this.metodo_de_pago = metodo_de_pago;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDateTime getFecha_de_creacion() {
        return fecha_de_creacion;
    }

    public void setFecha_de_creacion(LocalDateTime fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }
}
