package com.blackdeath.metricas.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
	@Column(nullable = false)
	private Integer valor;

	/**
	 * Comentario pertinente a esta evaluación
	 */
	@Column(nullable = true, unique = false, updatable = true, length = 256)
	private String comentario;

	/**
	 * {@link Evaluacion} a la que pertenece este detalle de evaluación
	 */
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "evaluacion_id", foreignKey = @ForeignKey(name = "evaluacion_id_fk"))
	private Evaluacion evaluacion;

	/**
	 * {@link Metrica} de este detalle de evaluación
	 */
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "metrica_id", foreignKey = @ForeignKey(name = "metrica_id_fk"))
	private Metrica metrica;

	/**
	 * Colección de evidencias corresondientes a este detalle
	 */
	@OneToMany(mappedBy = "detalleEvaluacion", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	private List<Evidencia> evidencias = new ArrayList<>();

	/**
	 * Agrega una {@link Evidencia} a este detalle
	 * 
	 * @param detalle
	 */
	public void agregarEvidencia(Evidencia evidencia) {
		evidencia.setDetalleEvaluacion(this);
		evidencias.add(evidencia);
	}

}
