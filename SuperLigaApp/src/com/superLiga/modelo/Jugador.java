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
public class Jugador extends Persona{
	
	private int idJugador;
	private int categoria;
	private String equipoAsignado;
	private int nroCamiseta;

	/**
	 * @return idJugador
	 */
	public int getIdJugador() {
		return idJugador;
	}

	/**
	 * @param idJugador 
	 */
	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	/**
	 * @return  categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria 
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return  equipoAsignado
	 */
	public String getEquipoAsignado() {
		return equipoAsignado;
	}

	/**
	 * @param equipoAsignado 
	 */
	public void setEquipoAsignado(String equipoAsignado) {
		this.equipoAsignado = equipoAsignado;
	}

	/**
	 * @return  nroCamiseta
	 */
	public int getNroCamiseta() {
		return nroCamiseta;
	}

	/**
	 * @param nroCamiseta 
	 */
	public void setNroCamiseta(int nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}

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
	 * @param categoria
	 * @param equipoAsignado
	 * @param nroCamiseta
	 */
	public Jugador(String apellidoNombre, Date fechaNacimiento, int dni, char sexo, int edad, String domicilio,
			Provincia provincia, String codigoPostal, String email, long telefono, String hinchaClub, int categoria,
			String equipoAsignado, int nroCamiseta) {
		super(apellidoNombre, fechaNacimiento, dni, sexo, edad, domicilio, provincia, codigoPostal, email, telefono,
				hinchaClub);
		this.categoria = categoria;
		this.equipoAsignado = equipoAsignado;
		this.nroCamiseta = nroCamiseta;
	}

	/**
	 * 
	 */
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	
	
}
