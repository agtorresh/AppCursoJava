package org.ejercicios.trucos.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalNullable {
	
	public static void optNullable(PersonaVO persona) {
		if(persona.getNombre() != null) {
			System.out.println("**********************************");
			System.out.println("Prueba: " + persona.getNombre());
		}
		
		Optional.ofNullable(persona)
							.map(PersonaVO::getNombre)
							.ifPresent(System.out::println);
	}
	
	public static List<PersonaVO> obtenerPersonas() {
		PersonaVO p1 = new PersonaVO("Alan", 30); 
		PersonaVO p2 = new PersonaVO("Pedro", 15); 
		PersonaVO p3 = new PersonaVO("Eduardo", 28);
		List<PersonaVO> personas = Arrays.asList(p1, p2, p3);
		return personas;
	}
	
	public static void main(String[] args) {		
		List<PersonaVO> personas = obtenerPersonas();
		
		List<PersonaVO> mayoresEdad = personas.stream()
				.filter(p -> p.getEdad() >= 18)
				.collect(Collectors.toList());
		
		for (PersonaVO personaVO : mayoresEdad) {
			System.out.println(personaVO.getNombre());
		}
	}

}
