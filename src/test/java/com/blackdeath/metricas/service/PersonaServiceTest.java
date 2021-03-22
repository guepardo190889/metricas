package com.blackdeath.metricas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blackdeath.metricas.entity.Persona;

/**
 * Clase con pruebas automatizadas para {@link PersonaService}
 * 
 * @author Seth Karim Luis Martínez
 * @since 22-03-2021
 *
 */
@SpringBootTest
public class PersonaServiceTest {

	@Autowired
	private PersonaService service;

	@Test
	public void guardar() {
		Persona persona = new Persona();
		persona.setNombre("Persona Prueba");
		persona.setApellidoPaterno("Apellido_Prueba_1");
		persona.setApellidoMaterno("Apellido_Prueba_2");

		persona = service.guardar(persona);

		assertNotNull(persona);
		assertNotNull(persona.getId());
		assertTrue(persona.getId() > 0);
	}

	@Test
	public void buscarPorId() {
		Persona persona = new Persona();
		persona.setNombre("Persona Prueba Búsqueda");
		persona.setApellidoPaterno("Apellido_Busqueda_1");
		persona.setApellidoMaterno("Apellido_Busqueda_2");

		persona = service.guardar(persona);

		Persona personaBusqueda = service.buscarPorId(persona.getId()).get();

		assertNotNull(personaBusqueda);
		assertNotNull(personaBusqueda.getId());
		assertTrue(personaBusqueda.getId() > 0);
		assertEquals(persona.getNombre(), personaBusqueda.getNombre());
		assertEquals(persona.getApellidoPaterno(), personaBusqueda.getApellidoPaterno());
		assertEquals(persona.getApellidoMaterno(), personaBusqueda.getApellidoMaterno());
	}

}
