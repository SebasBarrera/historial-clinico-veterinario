package com.control.veterinaria.dao.implementations;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.control.veterinaria.dao.interfaces.Historia_ClinicaDao;
import com.control.veterinaria.model.Historia_Clinica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Scope("singleton")
public class Historia_ClinicaDaoImp implements Historia_ClinicaDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Historia_Clinica save(Historia_Clinica historia) {
		entityManager.persist(historia);
		return historia;
	}

	@Override
	public Historia_Clinica update(Historia_Clinica historia) {
		entityManager.merge(historia);
		return historia;
	}

	@Override
	public void delete(Historia_Clinica historia) {
		entityManager.remove(historia);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Historia_Clinica> findAll() {
		String query = "SELECT h FROM Historia_Clinica h ORDER BY h.id";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public Historia_Clinica findById(Integer id) {
		return entityManager.find(Historia_Clinica.class, id);
	}

	@Override
	public boolean existsById(Integer id) {
		if (entityManager.find(Historia_Clinica.class, id) != null)
			return true;
		return false;
	}
}
