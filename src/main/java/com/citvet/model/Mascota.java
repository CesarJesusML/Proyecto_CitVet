package com.citvet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mascotas")
public class Mascota {

    @Id
    @Column(name = "cod_mascota")
    private int cod_mascota;

    @Column(name = "nombre_mascota")
    private String nombre_mascota;

    @Column(name = "chipIdentificacion")
    private String chipIdentificacion;

    @ManyToOne
    @JoinColumn(name = "cod_especie")
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "cod_raza")
    private Raza raza;

    @Column(name = "edad")
    private int edad;

    @Column(name = "peso")
    private double peso;

    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    private Cliente cliente;

    @Column(name = "estado")
    private String estado;

    // Getters y setters
    public int getCod_mascota() {
        return cod_mascota;
    }

    public void setCod_mascota(int cod_mascota) {
        this.cod_mascota = cod_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getChipIdentificacion() {
        return chipIdentificacion;
    }

    public void setChipIdentificacion(String chipIdentificacion) {
        this.chipIdentificacion = chipIdentificacion;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}