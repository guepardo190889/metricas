package com.blackdeath.metricas.entity;

import java.io.Serializable;

/**
 * Interfaz de entidad abstracta
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2020
 *
 */
public interface BaseEntity<T extends Serializable> extends Serializable {

	T getId();

}
