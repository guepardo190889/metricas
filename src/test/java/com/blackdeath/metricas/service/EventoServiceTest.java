package com.blackdeath.metricas.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	private MetricaService metricaService;

	@Autowired
	private CategoriaService categoriaService;

	@Test
	public void guardar() {
		Categoria categoria = new Categoria();
		categoria.setNombre("Categoría Uno");

		categoria = categoriaService.guardar(categoria);

		Metrica metrica = new Metrica();
		metrica.setNombre("Métrica Uno");
		metrica.setDescripcion("Descripción de la métrica uno");
		metrica.setCriterio(Criterio.MAS_ES_MEJOR);
		metrica.setTipoValor(TipoValor.CANTIDAD);
		metrica.setCategoria(categoria);

		metrica = metricaService.guardar(metrica);

		Evento evento = new Evento();
		evento.setNombre("Evento Uno");
		evento.setMetrica(metrica);

		assertNotNull(evento);
		assertNotNull(evento.getId());
		assertTrue(evento.getId() > 0);

		Optional<Evento> eventoBuscado = service.buscarPorId(evento.getId());

		assertTrue(eventoBuscado.isPresent());
		assertNotNull(eventoBuscado.get());
		assertNotNull(eventoBuscado.get().getMetrica());
		assertTrue(eventoBuscado.get().getMetrica().getId() > 0);

	}
}
