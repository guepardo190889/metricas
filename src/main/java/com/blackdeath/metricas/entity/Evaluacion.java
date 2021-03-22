package com.blackdeath.metricas.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Temporal;

import lombok.Getter;
import lombok.Setter;

/**
 * Entidad que representa una evaluación realizada
 * 
 * @author Seth Karim Luis Martínez
 * @since 21-03-2021
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
	@Column(nullable = false)
	private Date fecha;

	/**
	 * {@link Evento} que detona esta evaluación
	 */
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "evento_id", foreignKey = @ForeignKey(name = "evento_id_fk"))
	private Evento evento;

	/**
	 * Colección de detalles que pertenecen a esta evaluación
	 */
	@OneToMany(mappedBy = "evaluacion", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	private List<DetalleEvaluacion> detalles = new ArrayList<>();

	/**
	 * Agrega un {@link DetalleEvaluacion} a esta evaluación
	 * 
	 * @param detalle
	 */
	public void agregarDetalle(DetalleEvaluacion detalle) {
		detalle.setEvaluacion(this);
		detalles.add(detalle);
	}
}
