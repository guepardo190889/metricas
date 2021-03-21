package com.blackdeath.metricas.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase de entidad abstracta
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2020
 *
 */
@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity implements BaseEntity<Long> {

	protected static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
