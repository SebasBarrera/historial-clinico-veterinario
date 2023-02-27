package com.control.veterinaria.businessDelegate.interfaces;

import java.util.List;

import com.control.veterinaria.model.Detalle_Historia_Clinica;

public interface Detalle_Historia_ClinicaBusinessDelegate {
	public final static String URL = "http://localhost:8080/api/detalle-historia-clinica/";
	public List<Detalle_Historia_Clinica> findAll();
	public Detalle_Historia_Clinica findById(Integer id);
	public Detalle_Historia_Clinica save(Detalle_Historia_Clinica detalle);
	public Detalle_Historia_Clinica update(Detalle_Historia_Clinica detalle);
	public void deleteById(Integer id);
	public static String getUrl() {
		return URL;
	}
}