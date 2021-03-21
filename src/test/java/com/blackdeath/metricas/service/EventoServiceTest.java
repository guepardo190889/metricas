package com.blackdeath.metricas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blackdeath.metricas.entity.Evento;
import com.blackdeath.metricas.entity.Metrica;

/**
 * Clase con pruebas automatizadas para {@link EventoService}
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
 *
 */
@SpringBootTest
public class EventoServiceTest {

	@Autowired
	private EventoService service;

	@Autowired
	private MetricaService metricaService;

	@Test
	public void guardar() {
		Metrica metrica = metricaService.buscarPorId(1L).get();

		Evento evento = new Evento();
		evento.setNombre("Evento Prueba");
		evento.setMetrica(metrica);
		
		evento = service.guardar(evento);

		assertNotNull(evento);
		assertNotNull(evento.getId());
		assertTrue(evento.getId() > 0);

		Optional<Evento> eventoBuscado = service.buscarPorId(evento.getId());

		assertTrue(eventoBuscado.isPresent());
		assertNotNull(eventoBuscado.get());
		assertNotNull(eventoBuscado.get().getMetrica());
		assertTrue(eventoBuscado.get().getMetrica().getId() > 0);
	}
	
	@Test
	public void buscarPorId() {
		Evento evento = service.buscarPorId(1L).get();

		assertNotNull(evento);
		assertEquals("Agilidad", evento.getNombre());
	}
	
}
