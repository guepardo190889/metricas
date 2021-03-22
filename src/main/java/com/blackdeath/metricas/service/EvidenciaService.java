package com.blackdeath.metricas.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.blackdeath.metricas.entity.Evidencia;
import com.blackdeath.metricas.repository.EvidenciaRepository;

/**
 * Servicio para {@link Evidencia}
 * 
 * @author Seth Karim Luis Martínez
 * @since 22-03-2021
 */
public class EvidenciaService extends AbstractService<Evidencia> {

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	private EvidenciaService(EvidenciaRepository repository) {
		super(repository);
	}

}
