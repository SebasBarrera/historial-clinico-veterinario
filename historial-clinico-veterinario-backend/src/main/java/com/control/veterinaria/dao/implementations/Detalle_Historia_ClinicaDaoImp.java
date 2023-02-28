package com.control.veterinaria.dao.implementations;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.control.veterinaria.dao.interfaces.Detalle_Historia_ClinicaDao;
import com.control.veterinaria.model.Detalle_Historia_Clinica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Scope("singleton")
public class Detalle_Historia_ClinicaDaoImp implements Detalle_Historia_ClinicaDao{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Detalle_Historia_Clinica save(Detalle_Historia_Clinica detalle) {
		entityManager.persist(detalle);
		return detalle;
	}

	@Override
	public Detalle_Historia_Clinica update(Detalle_Historia_Clinica detalle) {
		entityManager.merge(detalle);
		return detalle;
	}

	@Override
	public void delete(Detalle_Historia_Clinica detalle) {
		entityManager.remove(detalle);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Detalle_Historia_Clinica> findAll() {
		String query = "\"SELECT d FROM Detalle_Historia_Clinica d ORDER BY d.id";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public Detalle_Historia_Clinica findById(Integer id) {
		return entityManager.find(Detalle_Historia_Clinica.class, id);
	}

	@Override
	public boolean existsById(Integer id) {
		if (entityManager.find(Detalle_Historia_Clinica.class, id) != null)
			return true;
		return false;
	}

	@Override
	public List<Detalle_Historia_Clinica> findAllByHistoriaId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
