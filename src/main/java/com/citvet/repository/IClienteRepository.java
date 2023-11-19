package com.citvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.citvet.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
	
	Cliente findBycodCliente(int cod_cliente);
	
	
}
