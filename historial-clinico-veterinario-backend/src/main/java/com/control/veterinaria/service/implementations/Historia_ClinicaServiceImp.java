package com.control.veterinaria.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.control.veterinaria.model.Historia_Clinica;
import com.control.veterinaria.repository.interfaces.Historia_ClinicaRepository;

@Service
@Transactional
public class Historia_ClinicaServiceImp implements com.control.veterinaria.service.interfaces.Historia_ClinicaService {
	
	@Autowired
	private Historia_ClinicaRepository repo;

	@Override
	public List<Historia_Clinica> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Historia_Clinica> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Historia_Clinica historia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Historia_Clinica historia) {
		// TODO Auto-generated method stub
		
	}

}
