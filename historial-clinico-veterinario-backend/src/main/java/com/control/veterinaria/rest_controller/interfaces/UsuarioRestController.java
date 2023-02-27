package com.control.veterinaria.rest_controller.interfaces;

import java.util.Optional;

import com.control.veterinaria.model.Usuario;


public interface UsuarioRestController {
	public void save(Usuario usuario);
	public void delete(Integer id);
	public Optional<Usuario> findById(Integer id);
	public Iterable<Usuario> findAll();
	public void update(Integer id, Usuario usuario);
}
