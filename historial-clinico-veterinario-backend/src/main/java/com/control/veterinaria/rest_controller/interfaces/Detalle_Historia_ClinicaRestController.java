package com.control.veterinaria.rest_controller.interfaces;

import java.util.List;
import java.util.Optional;

import com.control.veterinaria.model.Detalle_Historia_Clinica;

public interface Detalle_Historia_ClinicaRestController {
	public void save(Detalle_Historia_Clinica detalle);
	public void delete(Integer id);
	public Optional<Detalle_Historia_Clinica> findById(Integer id);
	public Iterable<Detalle_Historia_Clinica> findAll();
	public void update(Integer id, Detalle_Historia_Clinica detalle);
	public List<Detalle_Historia_Clinica> findByHistoriaId(Integer id);
}
