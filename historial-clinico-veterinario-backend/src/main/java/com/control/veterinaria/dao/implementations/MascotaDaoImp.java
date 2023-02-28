package com.control.veterinaria.dao.implementations;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.control.veterinaria.dao.interfaces.MascotaDao;
import com.control.veterinaria.model.Mascota;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
@Scope("singleton")
public class MascotaDaoImp implements MascotaDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Mascota save(Mascota mascota) {
		entityManager.persist(mascota);
		return mascota;
	}

	@Override
	public Mascota update(Mascota mascota) {
		entityManager.merge(mascota);
		return mascota;
	}

	@Override
	public void delete(Mascota mascota) {
		entityManager.remove(mascota);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Mascota> findAll() {
		String query = "SELECT m FROM Mascota m ORDER BY m.id";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public Mascota findById(Integer id) {
		return entityManager.find(Mascota.class, id);
	}

	@Override
	public boolean existsById(Integer id) {
		if (entityManager.find(Mascota.class, id) != null)
			return true;
		return false;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Mascota> findAllByUserId(Integer id) {
		String jpql = "SELECT m FROM Mascota m, User u "
				+ "WHERE m.usuario.id=u.id "
				+ "ODER BY m.id";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}
}
