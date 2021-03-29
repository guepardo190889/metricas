package com.blackdeath.metricas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.blackdeath.metricas.entity.Persona;
import com.blackdeath.metricas.repository.PersonaRepository;

/**
 * Servicio para {@link Persona}
 * 
 * @author Seth Karim Luis Martínez
 * @since 22-03-2021
 *
 */
@Service
public class PersonaService extends AbstractService<Persona> {

	private PersonaRepository repository;

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	public PersonaService(PersonaRepository repository) {
		super(repository);
		this.repository = repository;
	}

	/**
	 * Devuelve una colección de {@link Persona}s filtradas por {@code nombre}
	 * 
	 * @param nombre
	 * @return
	 */
	public List<Persona> buscarTodos(Optional<String> nombre) {
		return repository.findAllByNombreIgnoreCaseContaining(nombre.orElse(""), Sort.by(Sort.Direction.ASC, "nombre"));
	}

}
