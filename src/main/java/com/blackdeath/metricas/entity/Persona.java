package com.blackdeath.metricas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Persona que puede evaluar o ser evaluada
 * 
 * @author Seth Karim Luis Martínez
 * @since 22-03-2021
 *
 */
@Getter
@Setter
@Entity
public class Persona extends AbstractEntity {

	private static final long serialVersionUID = 1756873002846120686L;

	/**
	 * Nombres de esta persona
	 */
	@Column(nullable = false, unique = false, updatable = true, length = 64)
	private String nombre;

	/**
	 * Apellido paterno de esta persona
	 */
	@Column(nullable = false, unique = false, updatable = true, length = 32)
	private String apellidoPaterno;

	/**
	 * Apellido materno de esta persona
	 */
	@Column(nullable = false, unique = false, updatable = true, length = 32)
	private String apellidoMaterno;

}
