package com.blackdeath.metricas.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.sun.istack.NotNull;

/**
 * Controlador para {@link Metrica}
 * 
 * @author Seth Karim Luis Martínez
 * @since 23-03-2021
 *
 */
@RestController
@RequestMapping("/metricas")
public class MetricaController extends AbstractController<Metrica> {

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
	 * Devuelve un {@link List} con todas las {@link Metrica}
	 * 
	 * @return
	 */
	@GetMapping
	public ResponseEntity<List<Metrica>> buscarTodos() {
		return ResponseEntity.ok(service.buscarTodos());
	}

	/**
	 * Devuelve un listado de todas las {@link Metrica} filtradas por
	 * {@link Categoria} mediante {@code idCategoria}
	 * 
	 * @param idCategoria
	 * @return
	 */
	@GetMapping
	public ResponseEntity<List<Metrica>> buscarPorCategoria(
			@Valid @NotNull @Min(1) @RequestParam(name = "idCategoria") Long idCategoria) {
		return ResponseEntity.ok(service.buscarTodosPorCategoria(idCategoria));
	}

}
