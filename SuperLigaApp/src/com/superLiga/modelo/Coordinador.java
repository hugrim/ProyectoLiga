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
public class Coordinador extends Persona{
	
	private int idCoordinador;
	private String directorTecnicoFavorito;
	private int cantidadProfesoresACargo;
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
	 * @param directorTecnicoFavorito
	 * @param cantidadProfesoresACargo
	 */
	public Coordinador(String apellidoNombre, Date fechaNacimiento, int dni, char sexo, int edad, String domicilio,
			Provincia provincia, String codigoPostal, String email, long telefono, String hinchaClub,
			String directorTecnicoFavorito,int cantidadProfesoresACargo) {
		super(apellidoNombre, fechaNacimiento, dni, sexo, edad, domicilio, provincia, codigoPostal, email, telefono,
				hinchaClub);
		this.directorTecnicoFavorito = directorTecnicoFavorito;
		this.cantidadProfesoresACargo = cantidadProfesoresACargo;
	}


	/**
	 * 
	 */
	public Coordinador() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return idCoordinador
	 */
	public int getIdCoordinador() {
		return idCoordinador;
	}
	/**
	 * @param idCoordinador 
	 */
	public void setIdCoordinador(int idCoordinador) {
		this.idCoordinador = idCoordinador;
	}
	/**
	 * @return directorTecnicoFavorito
	 */
	public String getDirectorTecnicoFavorito() {
		return directorTecnicoFavorito;
	}
	/**
	 * @param directorTecnicoFavorito 
	 */
	public void setDirectorTecnicoFavorito(String directorTecnicoFavorito) {
		this.directorTecnicoFavorito = directorTecnicoFavorito;
	}
	/**
	 * @return cantidadProfesoresACargo
	 */
	public int getCantidadProfesoresACargo() {
		return cantidadProfesoresACargo;
	}
	/**
	 * @param cantidadProfesoresACargo 
	 */
	public void setCantidadProfesoresACargo(int cantidadProfesoresACargo) {
		this.cantidadProfesoresACargo = cantidadProfesoresACargo;
	}
}
