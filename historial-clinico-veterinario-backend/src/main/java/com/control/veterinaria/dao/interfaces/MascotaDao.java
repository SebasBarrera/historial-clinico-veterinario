package com.control.veterinaria.dao.interfaces;

import java.util.List;

import com.control.veterinaria.model.Mascota;

public interface MascotaDao {
	public Mascota save(Mascota mascota);
	public Mascota update(Mascota mascota);
	public void delete(Mascota mascota);
	public List<Mascota> findAll();
	public Mascota findById(Integer id);
	public boolean existsById(Integer id);
}
