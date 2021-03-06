package com.blackdeath.metricas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.blackdeath.metricas.controller.model.CategoriaModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entidad que representa la clasificación superior o agrupación de una
 * {@link Metrica}
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2021
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Categoria extends AbstractEntity {

	private static final long serialVersionUID = 4912681818452609207L;

	/**
	 * Nombre de esta categoría
	 */
	@Column(unique = true, nullable = false, updatable = true, length = 128)
	private String nombre;

	/**
	 * Constructor que asigna el valor de los campos de esta categoría a partir de
	 * una {@link CategoriaModel}
	 * 
	 * @param categoria
	 */
	public Categoria(CategoriaModel categoria) {
		this.nombre = categoria.getNombre();
	}

}
