/**
 * 
 */
package com.superLiga.modelo;

import java.util.Date;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class Persona {

	private String apellidoNombre;
	private Date fechaNacimiento;
	private int dni;
	private char sexo;
	private int edad;
	private String domicilio;
	private Provincia provincia;
	private String codigoPostal;
	private String email;
	private long telefono;
	private String hinchaClub;
	
	/**
	 * @param apellidoNombre
	 * @param fechaNacimiento
	 * @param dni
	 * @param sexo
	 * @param edad
	 * @param domicilio
	 * @param provincia
	 * @param codigoPostal
	 * @param email
	 * @param telefono
	 * @param hinchaClub
	 */
	public Persona(String apellidoNombre, Date fechaNacimiento, int dni, char sexo, int edad, String domicilio,
			Provincia provincia, String codigoPostal, String email, long telefono, String hinchaClub) {
		super();
		this.apellidoNombre = apellidoNombre;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.sexo = sexo;
		this.edad = edad;
		this.domicilio = domicilio;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.email = email;
		this.telefono = telefono;
		this.hinchaClub = hinchaClub;
	}
	/**
	 * 
	 */
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return  apellidoNombre
	 */
	public String getApellidoNombre() {
		return apellidoNombre;
	}
	/**
	 * @param apellidoNombre 
	 */
	public void setApellidoNombre(String apellidoNombre) {
		this.apellidoNombre = apellidoNombre;
	}
	/**
	 * @return fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento 
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return dni
	 */
	public int getDni() {
		return dni;
	}
	/**
	 * @param dni 
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}
	/**
	 * @return  sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return  edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad 
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}
	/**
	 * @param domicilio 
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	/**
	 * @return  provincia
	 */
	public Provincia getProvincia() {
		return provincia;
	}
	/**
	 * @param provincia
	 */
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	/**
	 * @return  codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}
	/**
	 * @param codigoPostal 
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	/**
	 * @return  email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email 
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return  telefono
	 */
	public long getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono 
	 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return  hinchaClub
	 */
	public String getHinchaClub() {
		return hinchaClub;
	}
	/**
	 * @param hinchaClub 
	 */
	public void setHinchaClub(String hinchaClub) {
		this.hinchaClub = hinchaClub;
	}	
}