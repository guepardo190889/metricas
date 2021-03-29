package com.blackdeath.metricas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blackdeath.metricas.entity.Persona;
import com.blackdeath.metricas.service.PersonaService;

/**
 * Controlador para {@link Persona}
 * 
 * @author Seth Karim Luis Martínez
 * @since 29-03-2021
 *
 */
@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private PersonaService service;

	/**
	 * Devuelve un {@link Persona} por su identificador único
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Persona buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id).get();
	}

	/**
	 * Devuelve un listado de {@link Persona}s filtradas por {@code nombre}
	 * 
	 * @param nombre
	 * @return
	 */
	@GetMapping
	public List<Persona> buscarTodos(@RequestParam(required = false) Optional<String> nombre) {
		return service.buscarTodos(nombre);
	}

}
