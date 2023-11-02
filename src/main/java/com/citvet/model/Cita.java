package com.citvet.model;

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
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "cod_mascota")
    private Mascota mascota;

    @Column(name = "fecha_cita")
    private java.sql.Date fecha_cita;

    @Column(name = "hora_cita")
    private java.sql.Time hora_cita;

    @ManyToOne
    @JoinColumn(name = "cod_servicio")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "cod_veterinario")
    private Veterinario veterinario;

    @Column(name = "duracionEstimada")
    private java.sql.Time duracionEstimada;

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

    public java.sql.Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(java.sql.Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public java.sql.Time getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(java.sql.Time hora_cita) {
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

    public java.sql.Time getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(java.sql.Time duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public String getEstado_cita() {
        return estado_cita;
    }

    public void setEstado_cita(String estado_cita) {
        this.estado_cita = estado_cita;
    }
}
