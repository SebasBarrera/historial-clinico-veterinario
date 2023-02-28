package com.control.veterinaria.dao.interfaces;

import java.util.List;

import com.control.veterinaria.model.Colaborador;

public interface ColaboradorDao {
	public Colaborador save(Colaborador colaborador);
	public Colaborador update(Colaborador colaboradorp);
	public void delete(Colaborador colaborador);
	public List<Colaborador> findAll();
	public Colaborador findById(Integer id);
	public boolean existsById(Integer id);
	public boolean searchMascotasAtendidas(int id);
}
