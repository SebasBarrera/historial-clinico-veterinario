package com.control.veterinaria.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.control.veterinaria.model.Detalle_Historia_Clinica;
import com.control.veterinaria.repository.interfaces.Detalle_Historia_ClinicaRepository;
import com.control.veterinaria.service.interfaces.Detalle_Historia_ClinicaService;

@Service
@Transactional
public class Detalle_Historia_ClinicaServiceImp implements Detalle_Historia_ClinicaService {
	
	@Autowired
	private Detalle_Historia_ClinicaRepository repo;

	@Override
	public List<Detalle_Historia_Clinica> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Detalle_Historia_Clinica> findAllById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Detalle_Historia_Clinica> findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Detalle_Historia_Clinica detalle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Detalle_Historia_Clinica detalle) {
		// TODO Auto-generated method stub
		
	}

}
