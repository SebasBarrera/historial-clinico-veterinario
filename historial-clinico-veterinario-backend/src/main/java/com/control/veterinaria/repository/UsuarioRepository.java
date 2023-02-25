package com.control.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.control.veterinaria.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
}
