package com.blackdeath.metricas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blackdeath.metricas.entity.AbstractEntity;

/**
 * Clase de repositorio abstracta
 * 
 * @author Seth Karim Luis Martínez
 * @since 20-03-2021
 *
 */
public interface AbstractRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {

}
