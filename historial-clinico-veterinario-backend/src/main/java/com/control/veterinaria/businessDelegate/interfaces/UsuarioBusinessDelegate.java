package com.control.veterinaria.businessDelegate.interfaces;

import java.util.List;

import com.control.veterinaria.model.Usuario;

public interface UsuarioBusinessDelegate {
	
	public List<Usuario> findAll();
	public Usuario findById(Integer id);
	public Usuario save(Usuario usuario);
	public Usuario update(Usuario usuario);
	public void deleteById(Integer id);
	
}