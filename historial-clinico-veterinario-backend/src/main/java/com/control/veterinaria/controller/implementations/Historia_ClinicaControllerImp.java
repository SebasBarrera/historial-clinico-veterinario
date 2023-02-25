package com.control.veterinaria.controller.implementations;

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

import com.control.veterinaria.controller.interfaces.Historia_ClinicaController;
import com.control.veterinaria.model.Historia_Clinica;
import com.control.veterinaria.service.interfaces.Historia_ClinicaService;

@RestController
@RequestMapping("/api/historia-clinica")
public class Historia_ClinicaControllerImp implements Historia_ClinicaController{
	
	@Autowired
	private Historia_ClinicaService service;

	@Override
	@PostMapping("/")
	public void save(@RequestBody Historia_Clinica historia) {
		service.save(historia);
	}

	@Override
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}

	@Override
	@GetMapping("/{id}")
	public Optional<Historia_Clinica> findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@Override
	@GetMapping("/")
	public Iterable<Historia_Clinica> findAll() {
		return service.findAll();
	}

	@Override
	@PutMapping("/{id}")
	public void update(@PathVariable("id") Integer id, @RequestBody Historia_Clinica historia) {
		service.save(historia);
	}
}
