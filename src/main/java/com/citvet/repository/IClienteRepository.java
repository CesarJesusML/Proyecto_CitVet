package com.citvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citvet.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
}
