package com.control.veterinaria.businessDelegate.interfaces;
import java.util.List;

import com.control.veterinaria.model.Colaborador;

public interface ColaboradorBusinessDelegate {
	public final static String URL = "http://localhost:8080/api/colaborador/";
	public List<Colaborador> findAll();
	public Colaborador findById(Integer id);
	public Colaborador save(Colaborador colaborador);
	public Colaborador update(Colaborador colaborador);
	public void deleteById(Integer id);
	public static String getUrl() {
		return URL;
	}
}
