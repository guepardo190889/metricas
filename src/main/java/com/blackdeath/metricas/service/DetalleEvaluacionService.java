package com.blackdeath.metricas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackdeath.metricas.entity.DetalleEvaluacion;
import com.blackdeath.metricas.repository.DetalleEvaluacionRepository;

/**
 * Servicio para {@link DetalleEvaluacion}
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
 *
 */
@Service
public class DetalleEvaluacionService extends AbstractService<DetalleEvaluacion> {

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	public DetalleEvaluacionService(DetalleEvaluacionRepository repository) {
		super(repository);
	}

}
