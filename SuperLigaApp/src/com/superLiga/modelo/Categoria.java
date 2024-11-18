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
	 * @return idCategoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}

	/**
	 * @param idCategoria 
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	/**
	 * @return anioCategoria
	 */
	public int getAnioCategoria() {
		return anioCategoria;
	}

	/**
	 * @param anioCategoria 
	 */
	public void setAnioCategoria(int anioCategoria) {
		this.anioCategoria = anioCategoria;
	}

	/**
	 * @return  jugadoresCategoria
	 */
	public List<Jugador> getJugadoresCategoria() {
		return jugadoresCategoria;
	}

	/**
	 * @param jugadoresCategoria 
	 */
	public void setJugadoresCategoria(List<Jugador> jugadoresCategoria) {
		this.jugadoresCategoria = jugadoresCategoria;
	}

	/**
	 * @return  equiposCategoria
	 */
	public List<Equipo> getEquiposCategoria() {
		return equiposCategoria;
	}

	/**
	 * @param equiposCategoria 
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

	/**
	 * @param anioCategoria2
	 */
	public Categoria(int anioCategoria) {
		this.anioCategoria = anioCategoria;
	}

	/**
	 * 
	 */
	public Categoria() {
		// TODO Auto-generated constructor stub
	}
	
}
