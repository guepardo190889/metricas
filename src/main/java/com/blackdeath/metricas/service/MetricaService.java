package com.blackdeath.metricas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	 * Devuelve un {@link Page} de {@link Metrica} filtradas por nombre y
	 * {@link Categoria
	 * 
	 * @param idCategoria
	 * @param nombre
	 * @param numeroPagina
	 * @return
	 */
	public Page<Metrica> buscarTodosConPaginado(Long idCategoria, Optional<String> nombre,
			Optional<Integer> numeroPagina) {
		PageRequest paginado = PageRequest.of(numeroPagina.orElse(0), 10, Sort.Direction.ASC, "nombre");

		return repository.buscarPorCategoriaYNombre(idCategoria, nombre.orElse(""), paginado);
	}

}
