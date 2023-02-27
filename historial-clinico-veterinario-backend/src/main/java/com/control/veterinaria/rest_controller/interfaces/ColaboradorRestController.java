package com.control.veterinaria.rest_controller.interfaces;

import java.util.Optional;

import com.control.veterinaria.model.Colaborador;

public interface ColaboradorRestController {
	public void save(Colaborador colaborador);
	public void delete(Integer id);
	public Optional<Colaborador> findById(Integer id);
	public Iterable<Colaborador> findAll();
	public void update(Integer id, Colaborador colaborador);
}
