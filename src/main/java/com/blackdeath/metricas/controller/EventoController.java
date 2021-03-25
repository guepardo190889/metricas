package com.blackdeath.metricas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blackdeath.metricas.entity.Evento;
import com.blackdeath.metricas.service.EventoService;

/**
 * Controador para {@link Evento}
 * 
 * @author Seth Karim Luis Martínez
 * @since 25-03-2021
 *
 */
@RestController
@RequestMapping("/eventos")
public class EventoController {

	@Autowired
	private EventoService service;

	/**
	 * Devuelve un {@link Evento} por su identificador único
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/id")
	public Evento buscarPorId(Long id) {
		return service.buscarPorId(id).get();
	}

	/**
	 * Devuelve un listado de {@link Evento}s filtrados por {@code nombre}
	 * 
	 * @return
	 */
	@GetMapping
	public List<Evento> buscarTodos(@RequestParam(required = false) Optional<String> nombre) {
		return service.buscarTodos(nombre);
	}

}
