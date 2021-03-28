package com.blackdeath.metricas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.blackdeath.metricas.controller.model.MetricaModel;
import com.blackdeath.metricas.enums.Criterio;
import com.blackdeath.metricas.enums.TipoValor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Entidad que representa un elemento específico que se puede evaluar
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2021
 *
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Metrica extends AbstractEntity {

	private static final long serialVersionUID = 6733034615599948325L;

	/**
	 * Nombre de esta métrica
	 */
	@Column(nullable = false, unique = true, updatable = true, length = 128)
	private String nombre;

	/**
	 * Descripción detallada de esta métrica
	 */
	@Column(nullable = false, unique = false, updatable = true, length = 512)
	private String descripcion;

	/**
	 * Criterio específico por el que se evalúa esta métrica
	 */
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Criterio criterio;

	/**
	 * Tipo de valor de esta métrica
	 */
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoValor tipoValor;

	/**
	 * {@link Categoria} a la que pertence esta métrica
	 */
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_id", foreignKey = @ForeignKey(name = "categoria_id_fk"))
	private Categoria categoria;

	/**
	 * {@link Evento} al que pertence esta métrica
	 */
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "evento_id", foreignKey = @ForeignKey(name = "evento_id_fk"))
	private Evento evento;

	/**
	 * Constructor que asigna el valor de los campos de esta métrica a partir de una
	 * {@link MetricaModel}
	 * 
	 * @param metrica
	 */
	public Metrica(MetricaModel metrica) {
		this.nombre = metrica.getNombre();
		this.descripcion = metrica.getDescripcion();
		this.criterio = metrica.getCriterio();
		this.tipoValor = metrica.getTipoValor();

		Categoria categoria = new Categoria();
		categoria.setId(metrica.getIdCategoria());

		Evento evento = new Evento();
		evento.setId(metrica.getIdEvento());

		this.categoria = categoria;
		this.evento = evento;
	}

}
