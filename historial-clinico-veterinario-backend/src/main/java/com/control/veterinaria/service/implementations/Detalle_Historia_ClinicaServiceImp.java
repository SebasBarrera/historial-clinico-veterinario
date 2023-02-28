package com.control.veterinaria.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.control.veterinaria.dao.interfaces.Detalle_Historia_ClinicaDao;
import com.control.veterinaria.model.Detalle_Historia_Clinica;
import com.control.veterinaria.service.interfaces.Detalle_Historia_ClinicaService;

@Service
@Transactional
public class Detalle_Historia_ClinicaServiceImp implements Detalle_Historia_ClinicaService {
	
	@Autowired
	private Detalle_Historia_ClinicaDao dao;

	@Override
	public List<Detalle_Historia_Clinica> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Detalle_Historia_Clinica> findAllByHistoriaId(int id) {
		return dao.findAllByHistoriaId(id);
	}

	@Override
	public Optional<Detalle_Historia_Clinica> findById(int id) {
		return  Optional.of(dao.findById(id));
	}
	
	@Override
	public boolean ExistById(int id) {
		return dao.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		dao.delete(dao.findById(id));
	}

	@Override
	public void delete(Detalle_Historia_Clinica detalle) {
		dao.delete(detalle);
	}

	@Override
	public void save(Detalle_Historia_Clinica detalle) {
		dao.save(detalle);
	}

	@Override
	public void update(Detalle_Historia_Clinica detalle) {
		dao.update(detalle);
	}

}
