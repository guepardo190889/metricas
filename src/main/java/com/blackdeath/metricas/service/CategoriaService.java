package com.blackdeath.metricas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackdeath.metricas.entity.Categoria;
import com.blackdeath.metricas.repository.CategoriaRepository;

/**
 * Servicio para {@link Categoria}
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2020
 *
 */
@Service
public class CategoriaService extends AbstractService<Categoria> {

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	public CategoriaService(CategoriaRepository repository) {
		super(repository);
	}

}