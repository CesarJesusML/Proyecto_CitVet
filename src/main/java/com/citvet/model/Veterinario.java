package com.citvet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "veterinarios")
public class Veterinario {

    @Id
    @Column(name = "cod_veterinario")
    private int cod_veterinario;

    @Column(name = "nombres_veterinario")
    private String nombres_veterinario;

    @Column(name = "apellidos_veterinario")
    private String apellidos_veterinario;

    @Column(name = "dni")
    private String dni;

    @ManyToOne
    @JoinColumn(name = "cod_distrito")
    Distrito distrito;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "especialidad")
    private String especialidad;

    @Column(name = "estado")
    private String estado;

    // Getters y setters
    public int getCod_veterinario() {
        return cod_veterinario;
    }

    public void setCod_veterinario(int cod_veterinario) {
        this.cod_veterinario = cod_veterinario;
    }

    public String getNombres_veterinario() {
        return nombres_veterinario;
    }

    public void setNombres_veterinario(String nombres_veterinario) {
        this.nombres_veterinario = nombres_veterinario;
    }

    public String getApellidos_veterinario() {
        return apellidos_veterinario;
    }

    public void setApellidos_veterinario(String apellidos_veterinario) {
        this.apellidos_veterinario = apellidos_veterinario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
