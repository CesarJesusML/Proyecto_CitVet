package com.citvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citvet.model.TipoComprobante;

public interface ITipoComprobanteRepository extends JpaRepository<TipoComprobante, Integer> {

}
