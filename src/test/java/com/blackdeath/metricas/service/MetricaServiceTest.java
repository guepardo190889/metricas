package com.blackdeath.metricas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.blackdeath.metricas.entity.Categoria;
import com.blackdeath.metricas.entity.Evento;
import com.blackdeath.metricas.entity.Metrica;
import com.blackdeath.metricas.enums.Criterio;
import com.blackdeath.metricas.enums.TipoValor;

/**
 * Clase con pruebas automatizadas para {@link MetricaService}
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
 *
 */
@SpringBootTest
public class MetricaServiceTest {

	@Autowired
	private MetricaService service;

	@Autowired
	private CategoriaService categoriaService;

	@Autowired
	private EventoService eventoService;

	@Test
	public void guardar() {
		Categoria categoria = categoriaService.buscarPorId(1L).get();

		Evento evento = eventoService.buscarPorId(1L).get();

		Metrica metrica = new Metrica();
		metrica.setNombre("Métrica Prueba");
		metrica.setDescripcion("Descripción de la métrica uno");
		metrica.setCriterio(Criterio.MAS_ES_MEJOR);
		metrica.setTipoValor(TipoValor.CANTIDAD);
		metrica.setCategoria(categoria);
		metrica.setEvento(evento);

		metrica = service.guardar(metrica);

		assertNotNull(metrica);
		assertNotNull(metrica.getId());
		assertTrue(metrica.getId() > 0);
	}

	@Test
	public void buscarPorId() {
		Metrica metrica = service.buscarPorId(1L).get();

		assertNotNull(metrica);
		assertEquals("Tiempo de ciclo", metrica.getNombre());
		assertEquals("Tiempo que transcurre desde el inicio de una historia hasta terminarla estando en producción",
				metrica.getDescripcion());
		assertEquals(Criterio.MENOS_ES_MEJOR, metrica.getCriterio());
		assertEquals(TipoValor.TIEMPO, metrica.getTipoValor());
		assertNotNull(metrica.getCategoria());
		assertNotNull(metrica.getCategoria().getId());
		assertEquals(1L, metrica.getCategoria().getId());
		assertNotNull(metrica.getEvento());
		assertNotNull(metrica.getEvento().getId());
		assertEquals(1L, metrica.getEvento().getId());
	}

	@Test
	public void buscarConPaginadoConNombreYPaginaNulos() {
		Page<Metrica> paginado = service.buscarTodosConPaginado(4L, Optional.empty(), Optional.empty());

		assertNotNull(paginado);
		assertNotNull(paginado.getContent());
		assertTrue(paginado.getContent().size() > 0);
		assertEquals(10, paginado.getContent().size());
	}

	@Test
	public void buscarConPaginadoPorNombreYPaginadoNulo() {
		Page<Metrica> paginado = service.buscarTodosConPaginado(4L, Optional.of("ug"), Optional.empty());

		assertNotNull(paginado);
		assertNotNull(paginado.getContent());
		assertTrue(paginado.getContent().size() > 0);
		assertEquals(1, paginado.getContent().size());
	}

	@Test
	public void buscarConPaginadoYPaginaEspcificada() {
		Page<Metrica> paginado = service.buscarTodosConPaginado(4L, Optional.empty(), Optional.of(1));

		assertNotNull(paginado);
		assertNotNull(paginado.getContent());
		assertTrue(paginado.getContent().size() > 0);
		assertEquals(1, paginado.getContent().size());
	}

}
