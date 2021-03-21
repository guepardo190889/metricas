package com.blackdeath.metricas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

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
	public void guardar() {
		Categoria categoria = new Categoria();
		categoria.setNombre("Categoría Prueba");

		Categoria categoriaGuardada = service.guardar(categoria);

		assertNotNull(categoriaGuardada);
		assertNotNull(categoriaGuardada.getId());
		assertTrue(categoriaGuardada.getId() > 0);
	}

	@Test
	public void eliminar() {
		Categoria categoria = new Categoria();
		categoria.setNombre("Categoría Prueba Eliminar");

		Categoria categoriaGuardada = service.guardar(categoria);

		service.eliminar(categoriaGuardada.getId());

		Optional<Categoria> categoriaBuscada = service.buscarPorId(categoriaGuardada.getId());

		assertFalse(categoriaBuscada.isPresent());
	}

	@Test
	public void buscarPorId() {
		Categoria categoria = service.buscarPorId(1L).get();

		assertNotNull(categoria);
		assertEquals("Agilidad", categoria.getNombre());
	}

	@Test
	public void buscarTodos() {
		List<Categoria> categorias = service.buscarTodos();

		assertNotNull(categorias);
		assertTrue(categorias.size() > 0);
	}
}
