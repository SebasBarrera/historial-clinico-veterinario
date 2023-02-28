package com.control.veterinaria.dao.implementations;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.control.veterinaria.dao.interfaces.UsuarioDao;
import com.control.veterinaria.model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Scope("singleton")
public class UsuarioDaoImp implements UsuarioDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Usuario save(Usuario usuario) {
		entityManager.persist(usuario);
		return usuario;
	}

	@Override
	public Usuario update(Usuario usuario) {
		entityManager.merge(usuario);
		return usuario;
	}

	@Override
	public void delete(Usuario usuario) {
		entityManager.remove(usuario);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Usuario> findAll() {
		String query = "SELECT u FROM Usuario u ORDER BY u.id";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public Usuario findById(Integer id) {
		return entityManager.find(Usuario.class, id);
	}

	@Override
	public boolean existsById(Integer id) {
		if (entityManager.find(Usuario.class, id) != null)
			return true;
		return false;
	}
}
