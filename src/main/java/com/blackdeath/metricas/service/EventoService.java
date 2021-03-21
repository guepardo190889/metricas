package com.blackdeath.metricas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackdeath.metricas.entity.Evento;
import com.blackdeath.metricas.repository.EventoRepository;

/**
 * 
 * Servicio para {@link Evento}
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
 *
 */
@Service
public class EventoService extends AbstractService<Evento> {

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	public EventoService(EventoRepository repository) {
		super(repository);
	}

}
