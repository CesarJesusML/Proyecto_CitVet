package com.citvet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_servicio")
public class TipoServicio {

    @Id
    @Column(name = "cod_tipo_servicio")
    private int cod_tipo_servicio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "condicion")
    private char condicion;

    
    // Getters y setters
    
	public int getCod_tipo_servicio() {
		return cod_tipo_servicio;
	}

	public void setCod_tipo_servicio(int cod_tipo_servicio) {
		this.cod_tipo_servicio = cod_tipo_servicio;
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
