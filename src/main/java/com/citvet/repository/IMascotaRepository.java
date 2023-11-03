package com.citvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citvet.model.Mascota;

public interface IMascotaRepository extends JpaRepository<Mascota, Integer> {
	
}
