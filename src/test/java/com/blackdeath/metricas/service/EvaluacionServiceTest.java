package com.blackdeath.metricas.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blackdeath.metricas.entity.DetalleEvaluacion;
import com.blackdeath.metricas.entity.Evaluacion;
import com.blackdeath.metricas.entity.Evento;
import com.blackdeath.metricas.entity.Evidencia;

/**
 * Clase con pruebas automatizadas para {@link EvaluacionService}
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
 *
 */
@SpringBootTest
public class EvaluacionServiceTest {

	@Autowired
	private EvaluacionService service;

	@Autowired
	EventoService eventoService;

	@Test
	public void guardar() {
		Evento evento = eventoService.buscarPorId(1L).get();

		DetalleEvaluacion detalle = new DetalleEvaluacion();
		detalle.setValor(1);
		detalle.setMetrica(evento.getMetricas().get(0));

		Evaluacion evaluacion = new Evaluacion();
		evaluacion.setFecha(new Date());
		evaluacion.setEvento(evento);
		evaluacion.agregarDetalle(detalle);

		evaluacion = service.guardar(evaluacion);

		assertNotNull(evaluacion);
		assertNotNull(evaluacion.getId());
		assertTrue(evaluacion.getId() > 0);

		Evaluacion evaluacionBuscada = service.buscarPorId(evaluacion.getId()).get();

		assertNotNull(evaluacionBuscada);
		assertNotNull(evaluacionBuscada.getDetalles());
		assertTrue(evaluacionBuscada.getDetalles().size() > 0);
	}

	@Test
	public void guardarConEvidencia() {
		Evento evento = eventoService.buscarPorId(1L).get();

		Evidencia evidencia = new Evidencia();
		evidencia.setArchivo("EVIDENCIA_BASE_64");

		DetalleEvaluacion detalle = new DetalleEvaluacion();
		detalle.setValor(1);
		detalle.setMetrica(evento.getMetricas().get(0));
		detalle.agregarEvidencia(evidencia);

		Evaluacion evaluacion = new Evaluacion();
		evaluacion.setFecha(new Date());
		evaluacion.setEvento(evento);
		evaluacion.agregarDetalle(detalle);

		evaluacion = service.guardar(evaluacion);

		assertNotNull(evaluacion);
		assertNotNull(evaluacion.getId());
		assertTrue(evaluacion.getId() > 0);

		Evaluacion evaluacionBuscada = service.buscarPorId(evaluacion.getId()).get();

		assertNotNull(evaluacionBuscada);
		assertNotNull(evaluacionBuscada.getDetalles());
		assertTrue(evaluacionBuscada.getDetalles().size() > 0);
	}
}
