package com.blackdeath.metricas.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.blackdeath.metricas.entity.Evento;

/**
 * Repositorio para {@link Evento}
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
 *
 */
@Repository
public interface EventoRepository extends AbstractRepository<Evento> {

	/**
	 * Devuelve una colección de {@link Evento}s filtados por {@code nombre}
	 * 
	 * @param nombre
	 * @param ordenamiento
	 * @return
	 */
	List<Evento> findAllByNombreIgnoreCaseContaining(String nombre, Sort ordenamiento);
}
