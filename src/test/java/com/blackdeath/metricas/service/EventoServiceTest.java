package com.blackdeath.metricas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blackdeath.metricas.entity.Categoria;
import com.blackdeath.metricas.entity.Evento;
import com.blackdeath.metricas.entity.Metrica;
import com.blackdeath.metricas.enums.Criterio;
import com.blackdeath.metricas.enums.TipoValor;

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
	private CategoriaService categoriaService;

	@Test
	public void guardar() {
		Evento evento = new Evento();
		evento.setNombre("Evento Prueba");

		evento = service.guardar(evento);

		assertNotNull(evento);
		assertNotNull(evento.getId());
		assertTrue(evento.getId() > 0);

		Optional<Evento> eventoBuscado = service.buscarPorId(evento.getId());

		assertTrue(eventoBuscado.isPresent());
		assertNotNull(eventoBuscado.get());
	}

	@Test
	public void guardarConMetrica() {
		Categoria categoria = categoriaService.buscarPorId(1L).get();

		Metrica metrica = new Metrica();
		metrica.setNombre("Métrica Prueba para Evento");
		metrica.setDescripcion("Descripción de la métrica uno");
		metrica.setCriterio(Criterio.MAS_ES_MEJOR);
		metrica.setTipoValor(TipoValor.CANTIDAD);
		metrica.setCategoria(categoria);

		Evento evento = new Evento();
		evento.setNombre("Evento Prueba con Métrica");

		evento.agregarMetrica(metrica);

		evento = service.guardar(evento);

		assertNotNull(evento);
		assertNotNull(evento.getId());
		assertTrue(evento.getId() > 0);

		Evento eventoBuscado = service.buscarPorId(evento.getId()).get();

		assertNotNull(eventoBuscado);
		assertNotNull(eventoBuscado.getMetricas());
		assertTrue(eventoBuscado.getMetricas().size() > 0);
	}

	@Test
	public void buscarPorId() {
		Evento evento = service.buscarPorId(1L).get();

		assertNotNull(evento);
		assertEquals("Cierre de historia", evento.getNombre());
	}

	@Test
	public void buscarTodosPorNombre() {
		List<Evento> eventos = service.buscarTodos(Optional.of("Instalación"));

		assertNotNull(eventos);
		assertTrue(eventos.size() > 0);
		assertEquals(1, eventos.size());
	}

	@Test
	public void buscarTodosPorNombreIgnoreCase() {
		List<Evento> eventos = service.buscarTodos(Optional.of("instalación"));

		assertNotNull(eventos);
		assertTrue(eventos.size() > 0);
		assertEquals(1, eventos.size());
	}

}
