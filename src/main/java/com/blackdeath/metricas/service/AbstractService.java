package com.blackdeath.metricas.service;

import java.util.List;
import java.util.Optional;

import com.blackdeath.metricas.entity.AbstractEntity;
import com.blackdeath.metricas.repository.AbstractRepository;

/**
 * Clase de servicio abstracta
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2021
 *
 */
public abstract class AbstractService<T extends AbstractEntity> {

	protected AbstractRepository<T> repository;

	/**
	 * Constructor por defecto
	 * 
	 * @param repository
	 */
	protected AbstractService(AbstractRepository<T> repository) {
		this.repository = repository;
	}

	public Optional<T> buscarPorId(Long id) {
		return repository.findById(id);
	}

	public List<T> buscarTodos() {
		return repository.findAll();
	}

	public T guardar(T entity) {
		return repository.save(entity);
	}

	public void eliminar(Long id) {
		repository.deleteById(id);
	}
}
