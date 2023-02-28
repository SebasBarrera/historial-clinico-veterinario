package com.control.veterinaria.dao.interfaces;

import java.util.List;

import com.control.veterinaria.model.Usuario;

public interface UsuarioDao {
	public Usuario save(Usuario usuario);
	public Usuario update(Usuario usuario);
	public void delete(Usuario usuario);
	public List<Usuario> findAll();
	public Usuario findById(Integer id);
	public boolean existsById(Integer id);
}
