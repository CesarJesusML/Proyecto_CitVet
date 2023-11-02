package com.citvet.model;

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

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "cod_tipoServicio")
    private TipoServicio tipoServicio;

    @Column(name = "precio")
    private double precio;

    @Column(name = "duracionEstimada")
    private java.sql.Time duracionEstimada;

    @Column(name = "materialesNecesarios", columnDefinition = "TEXT")
    private String materialesNecesarios;

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

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public java.sql.Time getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(java.sql.Time duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public String getMaterialesNecesarios() {
        return materialesNecesarios;
    }

    public void setMaterialesNecesarios(String materialesNecesarios) {
        this.materialesNecesarios = materialesNecesarios;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
