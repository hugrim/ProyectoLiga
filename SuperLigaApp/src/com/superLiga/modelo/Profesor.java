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
public class Profesor extends Persona{

	private int idProfesor;
	private int categoriaDirigida;
	private String directorTecnicoFavorito;
	private String equipoAsignado;
	
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
	 * @param categoriaDirigida
	 * @param directorTecnicoFavorito
	 * @param equipoAsignado
	 */
	public Profesor(String apellidoNombre, Date fechaNacimiento, int dni, char sexo, int edad, String domicilio,
			Provincia provincia, String codigoPostal, String email, long telefono, String hinchaClub, int categoriaDirigida, String directorTecnicoFavorito, String equipoAsignado) {
		super(apellidoNombre, fechaNacimiento, dni, sexo, edad, domicilio, provincia, codigoPostal, email, telefono,
				hinchaClub);
		this.categoriaDirigida = categoriaDirigida;
		this.directorTecnicoFavorito = directorTecnicoFavorito;
		this.equipoAsignado = equipoAsignado;
	}


	/**
	 * 
	 */
	public Profesor() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return  idProfesor
	 */
	public int getIdProfesor() {
		return idProfesor;
	}
	/**
	 * @param idProfesor 
	 */
	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	/**
	 * @return categoriaDirigida
	 */
	public int getCategoriaDirigida() {
		return categoriaDirigida;
	}
	/**
	 * @param categoriaDirigida 
	 */
	public void setCategoriaDirigida(int categoriaDirigida) {
		this.categoriaDirigida = categoriaDirigida;
	}

	/**
	 * @return  directorTecnicoFavorito
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
	 * @return the equipoAsignado
	 */
	public String getEquipoAsignado() {
		return equipoAsignado;
	}


	/**
	 * @param equipoAsignado the equipoAsignado to set
	 */
	public void setEquipoAsignado(String equipoAsignado) {
		this.equipoAsignado = equipoAsignado;
	}
	

}
