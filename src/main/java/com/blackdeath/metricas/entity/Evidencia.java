package com.blackdeath.metricas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * Entidad que representa una evidencia o prueba
 * 
 * @author Seth Karim Luis Martínez
 * @since 22-03-2021
 *
 */
@Getter
@Setter
@Entity
public class Evidencia extends AbstractEntity {

	private static final long serialVersionUID = -1956063353072362403L;

	/**
	 * Archivo en base64 que soporta esta evidencia
	 */
	@Column(nullable = false, unique = false, updatable = false, columnDefinition = "text")
	private String archivo;

	/**
	 * {@link DetalleEvaluacion} al que pertence esta evidencia
	 */
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "detalle_evaluacion_id", foreignKey = @ForeignKey(name = "detalle_evaluacion_id_fk"))
	private DetalleEvaluacion detalleEvaluacion;

}
