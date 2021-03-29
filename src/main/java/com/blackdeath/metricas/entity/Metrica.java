package com.blackdeath.metricas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.blackdeath.metricas.enums.Criterio;
import com.blackdeath.metricas.enums.TipoValor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_id", foreignKey = @ForeignKey(name = "categoria_id_fk"))
	private Categoria categoria;

}
