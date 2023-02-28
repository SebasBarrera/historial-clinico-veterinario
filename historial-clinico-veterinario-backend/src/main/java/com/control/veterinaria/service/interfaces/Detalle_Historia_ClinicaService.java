package com.control.veterinaria.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.control.veterinaria.model.Detalle_Historia_Clinica;

public interface Detalle_Historia_ClinicaService {
	public List<Detalle_Historia_Clinica> findAll();
	public List<Detalle_Historia_Clinica> findAllByHistoriaId(int id);
	public Optional<Detalle_Historia_Clinica> findById(int id);
	public void deleteById(int id);
	public void delete(Detalle_Historia_Clinica detalle);
	public void save(Detalle_Historia_Clinica detalle);
	boolean ExistById(int id);
	public void update(Detalle_Historia_Clinica detalle);
}
