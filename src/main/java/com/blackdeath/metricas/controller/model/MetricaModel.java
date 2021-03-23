package com.blackdeath.metricas.controller.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.blackdeath.metricas.entity.Metrica;
import com.blackdeath.metricas.enums.Criterio;
import com.blackdeath.metricas.enums.TipoValor;
import com.sun.istack.NotNull;

import lombok.Data;

/**
 * Modelo para {@link Metrica}
 * 
 * @author Seth Karim Luis Martínez
 * @since 23-03-2021
 *
 */
@Data
public class MetricaModel {

	/**
	 * Nombre de esta métrica
	 */
	@NotNull
	@NotEmpty(message = "Nombre es requerido")
	@NotBlank(message = "Nombre es requerido")
	private String nombre;

	/**
	 * Descripción de esta métrica
	 */
	@NotNull
	@NotEmpty(message = "Nombre es requerido")
	@NotBlank(message = "Nombre es requerido")
	private String descripcion;

	/**
	 * Criterio de evaluación de esta métrica
	 */
	@NotNull
	private Criterio criterio;

	/**
	 * Tipo de valor de esta métrica
	 */
	@NotNull
	private TipoValor tipoValor;

	/**
	 * Identificador único de la categoría a la que pertenece esta métrica
	 */
	@NotNull
	private Long idCategoria;

	/**
	 * Identificador único del evento al que pertenece esta métrica
	 */
	@NotNull
	private Long idEvento;

}
