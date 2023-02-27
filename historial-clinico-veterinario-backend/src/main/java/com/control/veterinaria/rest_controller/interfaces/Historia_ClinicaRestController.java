package com.control.veterinaria.rest_controller.interfaces;

import java.util.Optional;

import com.control.veterinaria.model.Historia_Clinica;

public interface Historia_ClinicaRestController {
	public void save(Historia_Clinica historia);
	public void delete(Integer id);
	public Optional<Historia_Clinica> findById(Integer id);
	public Iterable<Historia_Clinica> findAll();
	public void update(Integer id, Historia_Clinica historia);
}
