package com.control.veterinaria.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.control.veterinaria.model.Mascota;
import com.control.veterinaria.repository.interfaces.MascotaRepository;
import com.control.veterinaria.service.interfaces.MascotaService;

@Service
@Transactional
public class MascotaServiceImp implements MascotaService {
	
	@Autowired
	private MascotaRepository repo;

	@Override
	public List<Mascota> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Mascota> findAllById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Mascota> findById(int id) {
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
	public void delete(Mascota mascota) {
		repo.delete(mascota);
	}

	@Override
	public void save(Mascota mascota) {
		repo.save(mascota);
	}

}
