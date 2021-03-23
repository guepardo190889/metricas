package com.blackdeath.metricas.controller.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.blackdeath.metricas.entity.Categoria;
import com.sun.istack.NotNull;

import lombok.Data;

/**
 * Modelo para {@link Categoria}
 * 
 * @author Seth Karim Luis Martínez
 * @since 22-03-2021
 *
 */
@Data
public class CategoriaModel {

	/**
	 * Nombre de esta categoría
	 */
	@NotNull
	@NotEmpty(message = "Nombre es requerido")
	@NotBlank(message = "Nombre es requerido")
	private String nombre;
}
