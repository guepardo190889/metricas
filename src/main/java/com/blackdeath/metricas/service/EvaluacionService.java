package com.blackdeath.metricas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackdeath.metricas.entity.Evaluacion;
import com.blackdeath.metricas.repository.EvaluacionRepository;

/**
 * Servicio para {@link Evaluacion}
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
 *
 */
@Service
public class EvaluacionService extends AbstractService<Evaluacion> {

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	public EvaluacionService(EvaluacionRepository repository) {
		super(repository);
	}

}
