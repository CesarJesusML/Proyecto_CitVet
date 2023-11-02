package com.citvet.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita {

    @Id
    @Column(name = "cod_cita")
    private int cod_cita;

    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "cod_mascota")
    Mascota mascota;

    @Column(name = "fecha_cita")
    private Date fecha_cita;

    @Column(name = "hora_cita")
    private Time hora_cita;

    @ManyToOne
    @JoinColumn(name = "cod_servicio")
    Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "cod_veterinario")
    Veterinario veterinario;

    @Column(name = "duracion_estimada")
    private Time duracion_estimada;

    @Column(name = "estado_cita")
    private String estado_cita;

    
    // Getters y setters
    
	public int getCod_cita() {
		return cod_cita;
	}

	public void setCod_cita(int cod_cita) {
		this.cod_cita = cod_cita;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Date getFecha_cita() {
		return fecha_cita;
	}

	public void setFecha_cita(Date fecha_cita) {
		this.fecha_cita = fecha_cita;
	}

	public Time getHora_cita() {
		return hora_cita;
	}

	public void setHora_cita(Time hora_cita) {
		this.hora_cita = hora_cita;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public Time getDuracion_estimada() {
		return duracion_estimada;
	}

	public void setDuracion_estimada(Time duracion_estimada) {
		this.duracion_estimada = duracion_estimada;
	}

	public String getEstado_cita() {
		return estado_cita;
	}

	public void setEstado_cita(String estado_cita) {
		this.estado_cita = estado_cita;
	}

     
}
