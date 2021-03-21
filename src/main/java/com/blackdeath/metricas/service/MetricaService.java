package com.blackdeath.metricas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	/**
	 * Constructor que inyecta el repositorio de este servicio
	 * 
	 * @param repository
	 */
	@Autowired
	public MetricaService(MetricaRepository repository) {
		super(repository);
	}

}
