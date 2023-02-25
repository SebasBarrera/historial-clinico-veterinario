package com.control.veterinaria.controller.interfaces;

import java.util.Optional;

import com.control.veterinaria.model.Colaborador;

public interface ColaboradorController {
	public void save(Colaborador colaborador);
	public void delete(Integer id);
	public Optional<Colaborador> findById(Integer id);
	public Iterable<Colaborador> findAll();
	public void update(Integer id, Colaborador colaborador);
}
