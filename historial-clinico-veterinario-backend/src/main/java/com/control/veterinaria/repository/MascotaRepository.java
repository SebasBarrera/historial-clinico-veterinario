package com.control.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.control.veterinaria.model.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Integer> {

	
}
