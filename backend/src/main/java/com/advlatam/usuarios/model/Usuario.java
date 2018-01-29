package com.advlatam.usuarios.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	private String cedula;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String estadoCivil;
	private String direccion1;
	private String direccion2;
	private String telefono;
	private String email;

	/**
	 * 
	 * @param cedula
	 * @param primerNombre
	 * @param segundoNombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param estadoCivil
	 * @param direccion1
	 * @param direccion2
	 * @param telefono
	 * @param email
	 */	
	public Usuario(String cedula, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String estadoCivil, String direccion1, String direccion2, String telefono,
			String email) {
		super();
		this.cedula = cedula;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.estadoCivil = estadoCivil;
		this.direccion1 = direccion1;
		this.direccion2 = direccion2;
		this.telefono = telefono;
		this.email = email;
	}
	
	
	protected Usuario() {
	}
	

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void EstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDireccion1() {
		return direccion1;
	}

	public void setDireccion1(String direccion1) {
		this.direccion1 = direccion1;
	}

	public String getDireccion2() {
		return direccion2;
	}

	public void setDireccion2(String direccion2) {
		this.direccion2 = direccion2;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
