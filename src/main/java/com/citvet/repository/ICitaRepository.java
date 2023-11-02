package com.citvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citvet.model.Cita;

public interface ICitaRepository extends JpaRepository<Cita, Integer> {

}
