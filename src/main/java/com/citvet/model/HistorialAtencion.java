package com.citvet.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "historial_atenciones")
public class HistorialAtencion {

    @Id
    @Column(name = "cod_atencion")
    private int cod_atencion;

    @ManyToOne
    @JoinColumn(name = "cod_cita")
    Cita cita;

    @Column(name = "detalle_atencion")
    private String detalle_atencion;

    @Column(name = "fecha_hora_atencion")
    private Timestamp fecha_hora_atencion;

    // Getters y setters
    public int getCod_atencion() {
        return cod_atencion;
    }

    public void setCod_atencion(int cod_atencion) {
        this.cod_atencion = cod_atencion;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public String getDetalle_atencion() {
        return detalle_atencion;
    }

    public void setDetalle_atencion(String detalle_atencion) {
        this.detalle_atencion = detalle_atencion;
    }

    public Timestamp getFecha_hora_atencion() {
        return fecha_hora_atencion;
    }

    public void setFecha_hora_atencion(Timestamp fecha_hora_atencion) {
        this.fecha_hora_atencion = fecha_hora_atencion;
    }
}
