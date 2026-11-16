package org.ejercicios.trucos.java;

import java.io.Serializable;

public class PersonaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private Integer edad;
	private String apellidoPaterno;

	public PersonaVO() {

	}

	public PersonaVO(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

}
