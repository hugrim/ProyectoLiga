/**
 * 
 */
package com.superLiga.modelo;

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
	 * @return the idJugador
	 */
	public int getIdJugador() {
		return idJugador;
	}

	/**
	 * @param idJugador the idJugador to set
	 */
	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	/**
	 * @return the categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
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

	/**
	 * @return the nroCamiseta
	 */
	public int getNroCamiseta() {
		return nroCamiseta;
	}

	/**
	 * @param nroCamiseta the nroCamiseta to set
	 */
	public void setNroCamiseta(int nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}
	
	/**
	 * @param idJugador
	 * @param categoria
	 * @param equipoAsignado
	 * @param nroCamiseta
	 */
	public Jugador(int idJugador, int categoria, String equipoAsignado, int nroCamiseta) {
		super();
		this.idJugador = idJugador;
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
