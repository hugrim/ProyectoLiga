/**
 * 
 */
package com.superLiga.modelo;

/**
 * @author qwert
 *
 */
public class Jugador extends Persona{

	private int categoria;
	private String equipoAsignado;
	private int nroCamiseta;
	
	/**
	 * @param categoria
	 * @param equipoAsignado
	 * @param nroCamiseta
	 */
	public Jugador(int categoria, String equipoAsignado, int nroCamiseta) {
		super();
		this.categoria = categoria;
		this.equipoAsignado = equipoAsignado;
		this.nroCamiseta = nroCamiseta;
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
	
}
