package com.blackdeath.metricas.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blackdeath.metricas.controller.model.MetricaModel;
import com.blackdeath.metricas.entity.Categoria;
import com.blackdeath.metricas.entity.Metrica;
import com.blackdeath.metricas.service.MetricaService;

/**
 * Controlador para {@link Metrica}
 * 
 * @author Seth Karim Luis Martínez
 * @since 23-03-2021
 *
 */
@RestController
@RequestMapping("/metricas")
public class MetricaController {

	@Autowired
	private MetricaService service;

	/**
	 * Guarda una {@link Categoria}
	 * 
	 * @param categoria
	 * @return
	 */
	@PostMapping
	public ResponseEntity<Metrica> guardar(@Valid @RequestBody MetricaModel metrica) {
		return ResponseEntity.ok(service.guardar(new Metrica(metrica)));
	}

	/**
	 * Consulta filtrada y paginada de {@link Metrica}
	 * 
	 * @param idCategoria
	 * @param nombre
	 * @param pagina
	 * @return Page<Metrica>
	 */
	@GetMapping
	public Page<Metrica> buscarTodosConPaginado(@RequestParam(required = true) Long idCategoria,
			@RequestParam(required = false) Optional<String> nombre,
			@RequestParam(required = false) Optional<Integer> pagina) {
		return service.buscarTodosConPaginado(idCategoria, nombre, pagina);
	}

}
