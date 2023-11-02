package com.citvet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_servicio")
public class TipoServicio {

    @Id
    @Column(name = "cod_tipoServicio")
    private int cod_tipoServicio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "condicion")
    private char condicion;

    // Getters y setters
    public int getCod_tipoServicio() {
        return cod_tipoServicio;
    }

    public void setCod_tipoServicio(int cod_tipoServicio) {
        this.cod_tipoServicio = cod_tipoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }
}
