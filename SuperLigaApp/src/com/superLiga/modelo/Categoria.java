/**
 * 
 */
package com.superLiga.modelo;

import java.util.List;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class Categoria {

	private int idCategoria;
	private int anioCategoria;
	private List<Jugador> jugadoresCategoria;
	private List<Equipo> equiposCategoria;
	
	/**
	 * @return the idCategoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}

	/**
	 * @param idCategoria the idCategoria to set
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	/**
	 * @return the anioCategoria
	 */
	public int getAnioCategoria() {
		return anioCategoria;
	}

	/**
	 * @param anioCategoria the anioCategoria to set
	 */
	public void setAnioCategoria(int anioCategoria) {
		this.anioCategoria = anioCategoria;
	}

	/**
	 * @return the jugadoresCategoria
	 */
	public List<Jugador> getJugadoresCategoria() {
		return jugadoresCategoria;
	}

	/**
	 * @param jugadoresCategoria the jugadoresCategoria to set
	 */
	public void setJugadoresCategoria(List<Jugador> jugadoresCategoria) {
		this.jugadoresCategoria = jugadoresCategoria;
	}

	/**
	 * @return the equiposCategoria
	 */
	public List<Equipo> getEquiposCategoria() {
		return equiposCategoria;
	}

	/**
	 * @param equiposCategoria the equiposCategoria to set
	 */
	public void setEquiposCategoria(List<Equipo> equiposCategoria) {
		this.equiposCategoria = equiposCategoria;
	}

	/**
	 * @param idCategoria
	 * @param anioCategoria
	 * @param jugadoresCategoria
	 * @param equiposCategoria
	 */
	public Categoria(int idCategoria, int anioCategoria, List<Jugador> jugadoresCategoria,
			List<Equipo> equiposCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.anioCategoria = anioCategoria;
		this.jugadoresCategoria = jugadoresCategoria;
		this.equiposCategoria = equiposCategoria;
	}
	
}
