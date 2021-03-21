package com.blackdeath.metricas.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Getter;
import lombok.Setter;

/**
 * Entidad que representa la clasificación superior o agrupación de una
 * {@link Metrica}
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2021
 *
 */
@Getter
@Setter
@Entity
public class Categoria extends AbstractEntity {

	private static final long serialVersionUID = 4912681818452609207L;

	/**
	 * Nombre de esta categoría
	 */
	@Column(unique = true, nullable = false, updatable = true, length = 128)
	private String nombre;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	private List<Metrica> metricas = new ArrayList<>();

}
