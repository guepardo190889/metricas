package com.blackdeath.metricas.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blackdeath.metricas.entity.Categoria;
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

		metrica = service.guardar(metrica);

		assertNotNull(metrica);
		assertNotNull(metrica.getId());
		assertTrue(metrica.getId() > 0);
	}
}
