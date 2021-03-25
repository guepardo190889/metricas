package com.blackdeath.metricas.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.blackdeath.metricas.entity.Categoria;

/**
 * Repositorio para {@link Categoria}
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2020
 *
 */
@Repository
public interface CategoriaRepository extends AbstractRepository<Categoria> {

	/**
	 * Devuelve un listao de todas las {@link Categoria} filtradas por
	 * {@code nombre}
	 * 
	 * @param nombre
	 * @param ordenamiento
	 * @return
	 */
	List<Categoria> findAllByNombreIgnoreCaseContaining(String nombre, Sort ordenamiento);

}
