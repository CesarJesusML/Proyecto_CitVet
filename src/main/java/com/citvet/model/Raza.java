package com.citvet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "razas")
public class Raza {

    @Id
    @Column(name = "cod_raza")
    private int codRaza;

    @ManyToOne
    @JoinColumn(name = "cod_especie")
    private Especie especie;

    @Column(name = "nombre_raza")
    private String nombre_raza;

    @Column(name = "condicion")
    private char condicion;

    // Getters y setters
    public int getCodRaza() {
        return codRaza;
    }

    public void setCodRaza(int codRaza) {
        this.codRaza = codRaza;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getNombre_raza() {
        return nombre_raza;
    }

    public void setNombre_raza(String nombre_raza) {
        this.nombre_raza = nombre_raza;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }
}
