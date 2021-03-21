package com.blackdeath.metricas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackdeath.metricas.entity.Categoria;
import com.blackdeath.metricas.service.CategoriaService;

/**
 * Controlador para {@link Categoria}
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2021
 *
 */
@RestController
@RequestMapping("/categorias")
public class CategoriaController extends AbstractController<Categoria> {

	@Autowired
	private CategoriaService service;

	/**
	 * Devuelve todas las {@link Categoria}
	 * 
	 * @return
	 */
	@GetMapping
	public ResponseEntity<List<Categoria>> buscarTodos() {
		return ResponseEntity.ok(service.buscarTodos());
	}

}
