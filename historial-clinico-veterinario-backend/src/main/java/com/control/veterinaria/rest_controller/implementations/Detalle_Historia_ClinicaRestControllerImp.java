package com.control.veterinaria.rest_controller.implementations;

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

import com.control.veterinaria.model.Detalle_Historia_Clinica;
import com.control.veterinaria.rest_controller.interfaces.Detalle_Historia_ClinicaRestController;
import com.control.veterinaria.service.interfaces.Detalle_Historia_ClinicaService;

@RestController
@RequestMapping("/api/detalle")
public class Detalle_Historia_ClinicaRestControllerImp implements Detalle_Historia_ClinicaRestController{
	
	@Autowired
	private Detalle_Historia_ClinicaService service;

	@Override
	@PostMapping("/")
	public void save(@RequestBody Detalle_Historia_Clinica detalle) {
		service.save(detalle);
	}

	@Override
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}

	@Override
	@GetMapping("/{id}")
	public Optional<Detalle_Historia_Clinica> findById(@PathVariable("id") Integer id) {
		return service.findById(id);
	}

	@Override
	@GetMapping("/")
	public Iterable<Detalle_Historia_Clinica> findAll() {
		return service.findAll();
	}

	@Override
	@PutMapping("/{id}")
	public void update(@PathVariable("id") Integer id, @RequestBody Detalle_Historia_Clinica detalle) {
		service.update(detalle);
	}
	
	@Override
	@GetMapping("/por-historia/{id}")
	public List<Detalle_Historia_Clinica> findByHistoriaId(@PathVariable("id") Integer id) {
		return service.findAllById(id);
	}
	
}