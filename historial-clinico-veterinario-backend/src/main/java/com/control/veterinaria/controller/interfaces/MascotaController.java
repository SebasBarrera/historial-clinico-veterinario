package com.control.veterinaria.controller.interfaces;

import java.util.List;
import java.util.Optional;

import com.control.veterinaria.model.Mascota;


public interface MascotaController {
	public void save(Mascota mascota);
	public void delete(Integer id);
	public Optional<Mascota> findById(Integer id);
	public Iterable<Mascota> findAll();
	public void update(Integer id, Mascota mascota);
	public List<Mascota> findByUserId(Integer id);
}