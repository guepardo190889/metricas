package com.blackdeath.metricas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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

	private EventoRepository repository;

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	public EventoService(EventoRepository repository) {
		super(repository);
		this.repository = repository;
	}

	/**
	 * Devuelve una colección de {@link Evento}s filtrados por {@code nombre}
	 * 
	 * @param nombre
	 * @return
	 */
	public List<Evento> buscarTodos(Optional<String> nombre) {
		return repository.findAllByNombreIgnoreCaseContaining(nombre.orElse(""), Sort.by(Sort.Direction.ASC, "nombre"));
	}

}
