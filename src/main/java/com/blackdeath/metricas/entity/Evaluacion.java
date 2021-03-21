package com.blackdeath.metricas.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Seth Karim Luis Martínez
 *
 */
@Setter
@Getter
@Entity
public class Evaluacion extends AbstractEntity {

	private static final long serialVersionUID = 1819783051029011114L;

	/**
	 * Fecha en la que se realiza esta evaluación;
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
}
