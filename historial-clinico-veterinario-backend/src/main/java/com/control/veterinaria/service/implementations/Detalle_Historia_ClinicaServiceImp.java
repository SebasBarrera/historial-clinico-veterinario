package com.control.veterinaria.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.control.veterinaria.model.Detalle_Historia_Clinica;
import com.control.veterinaria.repository.Detalle_Historia_ClinicaRepository;
import com.control.veterinaria.service.interfaces.Detalle_Historia_ClinicaService;

@Service
@Transactional
public class Detalle_Historia_ClinicaServiceImp implements Detalle_Historia_ClinicaService {
	
	@Autowired
	private Detalle_Historia_ClinicaRepository repo;

	@Override
	public List<Detalle_Historia_Clinica> findAll() {
		// TODO Auto-generated method stub
		return (List<Detalle_Historia_Clinica>) repo.findAll();
	}

	@Override
	public List<Detalle_Historia_Clinica> findAllById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Detalle_Historia_Clinica> findById(int id) {
		return  repo.findById(id);
	}
	
	@Override
	public boolean ExistById(int id) {
		return repo.existsById(id);
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
	}

	@Override
	public void delete(Detalle_Historia_Clinica detalle) {
		repo.delete(detalle);
	}

	@Override
	public void save(Detalle_Historia_Clinica detalle) {
		repo.save(detalle);
	}

}
