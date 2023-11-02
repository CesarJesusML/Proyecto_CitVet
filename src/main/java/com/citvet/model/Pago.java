package com.citvet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pagos")
public class Pago {

    @Id
    @Column(name = "cod_pago")
    private int cod_pago;

    @ManyToOne
    @JoinColumn(name = "cod_cita")
    private Cita cita;

    @Column(name = "montoTotal")
    private double montoTotal;

    @Column(name = "fecha_hora_pago")
    private java.sql.Timestamp fecha_hora_pago;

    @ManyToOne
    @JoinColumn(name = "cod_tipoComprobante")
    private TipoComprobante tipoComprobante;

    // Getters y setters
    public int getCod_pago() {
        return cod_pago;
    }

    public void setCod_pago(int cod_pago) {
        this.cod_pago = cod_pago;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public java.sql.Timestamp getFecha_hora_pago() {
        return fecha_hora_pago;
    }

    public void setFecha_hora_pago(java.sql.Timestamp fecha_hora_pago) {
        this.fecha_hora_pago = fecha_hora_pago;
    }

    public TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
}
