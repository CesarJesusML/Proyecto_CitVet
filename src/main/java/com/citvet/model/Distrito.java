package com.citvet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "distritos")
public class Distrito {

    @Id
    @Column(name = "cod_distrito")
    private int cod_distrito;

    @Column(name = "nom_distrito")
    private String nom_distrito;

    @Column(name = "condicion")
    private char condicion;

    // Getters y setters
    public int getCod_distrito() {
        return cod_distrito;
    }

    public void setCod_distrito(int cod_distrito) {
        this.cod_distrito = cod_distrito;
    }

    public String getNom_distrito() {
        return nom_distrito;
    }

    public void setNom_distrito(String nom_distrito) {
        this.nom_distrito = nom_distrito;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }
}
