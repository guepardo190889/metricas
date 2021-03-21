package com.blackdeath.metricas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Esta clase representa la clasificación superior o agrupación de una
 * {@link Metrica}
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2021
 *
 */
@Getter
@Setter
@Entity
@Table(name = "categoria")
public class Categoria extends AbstractEntity {

	private static final long serialVersionUID = 4912681818452609207L;

	@Column(name = "nombre", unique = true, nullable = false, updatable = true, length = 128)
	private String nombre;

}
