package com.blackdeath.metricas.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.blackdeath.metricas.entity.Categoria;
import com.blackdeath.metricas.entity.Metrica;

/**
 * Repositorio para {@link Metrica}
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
 *
 */
@Repository
public interface MetricaRepository extends AbstractRepository<Metrica> {

	/**
	 * Devuelve un listado de todas las {@link Metrica} filtradas por
	 * {@link Categoria} mediante {@code idCategoria}
	 * 
	 * @param idCategoria
	 * @return
	 */
	public List<Metrica> findAllByCategoria(Long idCategoria);

}
