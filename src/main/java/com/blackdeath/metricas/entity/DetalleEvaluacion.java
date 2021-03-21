package com.blackdeath.metricas.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * Entidad que representa el deatlle de una evaluación realizada
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
 *
 */
@Getter
@Setter
@Entity
public class DetalleEvaluacion extends AbstractEntity {

	private static final long serialVersionUID = -788399933648657129L;

	/**
	 * Valor de la evaluación
	 */
	private Integer valor;

	/**
	 * {@link Evaluacion} a la que pertenece este detalle de evaluación
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "evaluacion_id", foreignKey = @ForeignKey(name = "evaluacion_id_fk"))
	private Evaluacion evaluacion;

	/**
	 * {@link Evento} que detonó el registro de este detalle de evaluación
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "evento_id", foreignKey = @ForeignKey(name = "evento_id_fk"))
	private Evento evento;

	/**
	 * {@link Metrica} de este detalle de evaluación
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "metrica_id", foreignKey = @ForeignKey(name = "metrica_id_fk"))
	private Metrica metrica;

}
