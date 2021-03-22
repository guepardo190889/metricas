package com.blackdeath.metricas.service;

import org.springframework.beans.factory.annotation.Autowired;
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

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	public PersonaService(PersonaRepository repository) {
		super(repository);
	}

}
