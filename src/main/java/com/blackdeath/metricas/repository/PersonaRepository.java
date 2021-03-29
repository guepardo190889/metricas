package com.blackdeath.metricas.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.blackdeath.metricas.entity.Persona;

/**
 * Repositorio para {@link Persona}
 * 
 * @author Seth Karim Luis Martínez
 * @since 22-03-2021
 *
 */
@Repository
public interface PersonaRepository extends AbstractRepository<Persona> {

	/**
	 * Devuelve una colección de {@link Persona}s filtradas por {@code nombre}
	 * 
	 * @param nombre
	 * @param ordenamiento
	 * @return
	 */
	List<Persona> findAllByNombreIgnoreCaseContaining(String nombre, Sort ordenamiento);
}
