package com.blackdeath.metricas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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

	private CategoriaRepository repository;

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	public CategoriaService(CategoriaRepository repository) {
		super(repository);
		this.repository = repository;
	}

	public List<Categoria> buscarTodos(Optional<String> nombre) {
		return repository.findAllByNombreIgnoreCaseContaining(nombre.orElse(""), Sort.by(Sort.Direction.ASC, "nombre"));
	}

}
