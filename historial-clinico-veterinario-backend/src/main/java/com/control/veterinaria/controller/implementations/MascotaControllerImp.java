package com.control.veterinaria.controller.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.control.veterinaria.controller.interfaces.MascotaController;
import com.control.veterinaria.model.Mascota;
import com.control.veterinaria.service.interfaces.MascotaService;

@RestController
@RequestMapping("/api/mascota")
public class MascotaControllerImp implements MascotaController {
	
	@Autowired
	private MascotaService service;

	@Override
	@PostMapping("/")
	public void save(@RequestBody Mascota mascota) {
		service.save(mascota);
	}

	@Override
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}

	@Override
	@GetMapping("/{id}")
	public Optional<Mascota> findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@Override
	@GetMapping("/")
	public Iterable<Mascota> findAll() {
		return service.findAll();
	}
	
	

	@Override
	@PutMapping("/{id}")
	public void update(@PathVariable("id") Integer id, @RequestBody Mascota mascota) {
		service.save(mascota);
	}
	
	@Override
	@GetMapping("/{id}")
	public List<Mascota> findByUserId(@PathVariable("id") Integer id) {
		return service.findAllById(id);
	}
}
