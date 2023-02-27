package com.control.veterinaria.rest_controller.interfaces;

import java.util.List;
import java.util.Optional;

import com.control.veterinaria.model.Mascota;


public interface MascotaRestController {
	public void save(Mascota mascota);
	public void delete(Integer id);
	public Optional<Mascota> findById(Integer id);
	public Iterable<Mascota> findAll();
	public void update(Integer id, Mascota mascota);
	public List<Mascota> findByUserId(Integer id);
}
