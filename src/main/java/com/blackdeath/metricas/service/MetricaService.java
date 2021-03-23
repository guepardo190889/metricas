package com.blackdeath.metricas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackdeath.metricas.entity.Categoria;
import com.blackdeath.metricas.entity.Metrica;
import com.blackdeath.metricas.repository.MetricaRepository;

/**
 * Servicio para {@link Metrica}
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
 *
 */
@Service
public class MetricaService extends AbstractService<Metrica> {

	private MetricaRepository repository;

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	public MetricaService(MetricaRepository repository) {
		super(repository);
		this.repository = repository;
	}

	/**
	 * Devuelve un listado de todas las {@link Metrica} filtradas por
	 * {@link Categoria} mediante {@code idCategoria}
	 * 
	 * @param idCategoria
	 * @return
	 */
	public List<Metrica> buscarTodosPorCategoria(Long idCategoria) {
		return this.repository.findAllByCategoria(idCategoria);
	}

}
