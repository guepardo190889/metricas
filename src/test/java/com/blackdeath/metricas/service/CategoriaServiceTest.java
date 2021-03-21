package com.blackdeath.metricas.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blackdeath.metricas.entity.Categoria;

/**
 * Clase con pruebas automatizadas para {@link CategoriaService}
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2021
 *
 */
@SpringBootTest
public class CategoriaServiceTest {

	@Autowired
	private CategoriaService service;

	@Test
	public void guardarCategoria() {
		Categoria categoria = new Categoria();
		categoria.setNombre("Categoría Uno");

		Categoria categoriaGuardada = service.guardar(categoria);

		assertNotNull(categoriaGuardada);
		assertNotNull(categoriaGuardada.getId());
		assertTrue(categoriaGuardada.getId() > 0);
	}

}
