package com.blackdeath.metricas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * Entidad que representa un suceso que detona una {@link Evaluacion}
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2021
 *
 */
@Setter
@Getter
@Entity
public class Evento extends AbstractEntity {

	private static final long serialVersionUID = -5365663392225811466L;

	/**
	 * Nombre de este evento
	 */
	@Column(unique = true, nullable = false, updatable = true, length = 128)
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "metrica_id", foreignKey = @ForeignKey(name = "metrica_id_fk"))
	private Metrica metrica;

}
