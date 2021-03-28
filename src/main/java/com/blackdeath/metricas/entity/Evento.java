package com.blackdeath.metricas.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

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

	/**
	 * Colección de métricas que que se deben evaluar en este evento
	 */
	@OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Metrica> metricas = new ArrayList<>();

	/**
	 * Agrega una {@link Metrica} a este evento
	 * 
	 * @param metrica
	 */
	public void agregarMetrica(Metrica metrica) {
		metrica.setEvento(this);
		metricas.add(metrica);
	}
}
