package com.control.veterinaria.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.control.veterinaria.dao.interfaces.Historia_ClinicaDao;
import com.control.veterinaria.model.Historia_Clinica;

@Service
@Transactional
public class Historia_ClinicaServiceImp implements com.control.veterinaria.service.interfaces.Historia_ClinicaService {
	
	@Autowired
	private Historia_ClinicaDao dao;

	@Override
	public List<Historia_Clinica> findAll() {
		return dao.findAll();
	}

	@Override
	public Optional<Historia_Clinica> findById(int id) {
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
	public void delete(Historia_Clinica historia) {
		dao.delete(historia);
	}

	@Override
	public void save(Historia_Clinica historia) {
		dao.save(historia);
	}

	@Override
	public void update(Historia_Clinica historia) {
		dao.update(historia);
	}

}
