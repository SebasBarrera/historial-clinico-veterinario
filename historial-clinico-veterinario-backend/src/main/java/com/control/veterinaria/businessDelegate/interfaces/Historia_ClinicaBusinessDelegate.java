package com.control.veterinaria.businessDelegate.interfaces;

import java.util.List;

import com.control.veterinaria.model.Historia_Clinica;

public interface Historia_ClinicaBusinessDelegate {
	public final static String URL = "http://localhost:8080/api/historia-clinica/";
	public List<Historia_Clinica> findAll();
	public Historia_Clinica findById(Integer id);
	public Historia_Clinica save(Historia_Clinica historial);
	public Historia_Clinica update(Historia_Clinica historial);
	public void deleteById(Integer id);
	public static String getUrl() {
		return URL;
	}
}