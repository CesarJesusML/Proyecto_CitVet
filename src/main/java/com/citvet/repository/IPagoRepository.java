package com.citvet.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.citvet.model.Mascota;
import com.citvet.model.Pago;

public interface IPagoRepository extends JpaRepository<Pago, Integer> {

	
	
	@Query("SELECT p.cita.codCita FROM Pago p WHERE p.cita.codCita = :cod_cita")
	Integer buscar(@Param("cod_cita") int codigo);

	@Query("SELECT p.fecha_hora_pago AS fechaPago, SUM(p.monto_total) AS totalMonto FROM Pago p WHERE p.fecha_hora_pago = :fecha_hora_pago")
	List<Object[]> constotal(@Param("fecha_hora_pago") Date fecha_hora_pago);



}
