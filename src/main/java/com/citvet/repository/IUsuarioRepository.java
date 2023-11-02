package com.citvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citvet.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

}
