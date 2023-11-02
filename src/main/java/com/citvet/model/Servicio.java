package com.citvet.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @Column(name = "cod_servicio")
    private int cod_servicio;

    @Column(name = "nombre_servicio")
    private String nombre_servicio;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "cod_tipo_servicio")
    TipoServicio tipo_servicio;

    @Column(name = "precio")
    private double precio;

    @Column(name = "duracion_estimada")
    private Time duracion_estimada;

    @Column(name = "materiales_necesarios")
    private String materiales_necesarios;

    @Column(name = "estado")
    private String estado;
    
    // Getters y setters

	public int getCod_servicio() {
		return cod_servicio;
	}

	public void setCod_servicio(int cod_servicio) {
		this.cod_servicio = cod_servicio;
	}

	public String getNombre_servicio() {
		return nombre_servicio;
	}

	public void setNombre_servicio(String nombre_servicio) {
		this.nombre_servicio = nombre_servicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoServicio getTipo_servicio() {
		return tipo_servicio;
	}

	public void setTipo_servicio(TipoServicio tipo_servicio) {
		this.tipo_servicio = tipo_servicio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Time getDuracion_estimada() {
		return duracion_estimada;
	}

	public void setDuracion_estimada(Time duracion_estimada) {
		this.duracion_estimada = duracion_estimada;
	}

	public String getMateriales_necesarios() {
		return materiales_necesarios;
	}

	public void setMateriales_necesarios(String materiales_necesarios) {
		this.materiales_necesarios = materiales_necesarios;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
