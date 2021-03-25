package com.blackdeath.metricas.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blackdeath.metricas.controller.model.CategoriaModel;
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
public class CategoriaController {

	@Autowired
	private CategoriaService service;

	/**
	 * Guarda una {@link Categoria}
	 * 
	 * @param categoria
	 * @return
	 */
	@PostMapping
	public ResponseEntity<Categoria> guardar(@Valid @RequestBody CategoriaModel categoria) {
		return ResponseEntity.ok(service.guardar(new Categoria(categoria)));
	}

	/**
	 * Devuelve un listado de {@link Categoria} filtradas por {@code nombre}
	 * 
	 * @return
	 */
	@GetMapping
	public ResponseEntity<List<Categoria>> buscarTodos(@RequestParam(required = false) Optional<String> nombre) {
		return ResponseEntity.ok(service.buscarTodos(nombre));
	}

}
