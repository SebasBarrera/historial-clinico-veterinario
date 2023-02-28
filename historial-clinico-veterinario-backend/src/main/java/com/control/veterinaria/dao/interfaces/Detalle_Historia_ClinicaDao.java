package com.control.veterinaria.dao.interfaces;

import java.util.List;

import com.control.veterinaria.model.Detalle_Historia_Clinica;

public interface Detalle_Historia_ClinicaDao {
	public Detalle_Historia_Clinica save(Detalle_Historia_Clinica detalle);
	public Detalle_Historia_Clinica update(Detalle_Historia_Clinica detalle);
	public void delete(Detalle_Historia_Clinica detalle);
	public List<Detalle_Historia_Clinica> findAll();
	public Detalle_Historia_Clinica findById(Integer id);
	public boolean existsById(Integer id);
}
