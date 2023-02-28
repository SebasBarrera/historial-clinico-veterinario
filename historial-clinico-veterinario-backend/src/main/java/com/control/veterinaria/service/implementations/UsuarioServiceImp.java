package com.control.veterinaria.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.control.veterinaria.model.Mascota;
import com.control.veterinaria.model.Usuario;
import com.control.veterinaria.repository.UsuarioRepository;
import com.control.veterinaria.service.interfaces.MascotaService;
import com.control.veterinaria.service.interfaces.UsuarioService;

@Service
@Transactional
public class UsuarioServiceImp implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	@Autowired
	private MascotaService mascotaService;

	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) repo.findAll();
	}

	@Override
	public Optional<Usuario> findById(int id) {
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
	public void delete(Usuario usuario) {
		repo.delete(usuario);
		List<Mascota> mascotas = mascotaService.findAllByUserId(usuario.getId());
		
		if (mascotas != null) {
			for (Mascota mascota : mascotas) {
				mascotaService.delete(mascota);
			}
		}
	}

	@Override
	public void save(Usuario usuario) {
		repo.save(usuario);
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
