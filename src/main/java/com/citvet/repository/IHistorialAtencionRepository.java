package com.citvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citvet.model.HistorialAtencion;

public interface IHistorialAtencionRepository extends JpaRepository<HistorialAtencion, Integer> {

}
