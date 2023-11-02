package com.citvet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especies")
public class Especie {

    @Id
    @Column(name = "cod_especie")
    private int cod_especie;

    @Column(name = "nombre_especie")
    private String nombre_especie;

    @Column(name = "condicion")
    private char condicion;

    // Getters y setters
    public int getCod_especie() {
        return cod_especie;
    }

    public void setCod_especie(int cod_especie) {
        this.cod_especie = cod_especie;
    }

    public String getNombre_especie() {
        return nombre_especie;
    }

    public void setNombre_especie(String nombre_especie) {
        this.nombre_especie = nombre_especie;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }
}
