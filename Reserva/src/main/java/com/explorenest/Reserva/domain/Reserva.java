package com.explorenest.Reserva.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Reserva {
    @Id
    private Integer id;
    private Integer cliente_id;
    private Date fecha_entrada;
    private Date fecha_salida;
    private String estado_reserva;
    //@OneToMany
    //private List<Integer> servicios_id;
    private Integer servicios_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getEstado_reserva() {
        return estado_reserva;
    }

    public void setEstado_reserva(String estado_reserva) {
        this.estado_reserva = estado_reserva;
    }

    public Integer getServicios_id() {
        return servicios_id;
    }

    public void setServicios_id(Integer servicios_id) {
        this.servicios_id = servicios_id;
    }
}
