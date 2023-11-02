package com.citvet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_comprobante")
public class TipoComprobante {

    @Id
    @Column(name = "cod_tipoComprobante")
    private int cod_tipoComprobante;

    @Column(name = "nombre_tipoComprobante")
    private String nombre_tipoComprobante;

    @Column(name = "condicion")
    private char condicion;

    // Getters y setters
    public int getCod_tipoComprobante() {
        return cod_tipoComprobante;
    }

    public void setCod_tipoComprobante(int cod_tipoComprobante) {
        this.cod_tipoComprobante = cod_tipoComprobante;
    }

    public String getNombre_tipoComprobante() {
        return nombre_tipoComprobante;
    }

    public void setNombre_tipoComprobante(String nombre_tipoComprobante) {
        this.nombre_tipoComprobante = nombre_tipoComprobante;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }
}
