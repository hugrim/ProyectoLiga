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
public class Fixture {

	private int posicionEquipo;
	private List<Equipo> listEquipo;
	private int cantidadPuntosEquipo;
	private List<Partido> partidos;
	
	/**
	 * @return the posicionEquipo
	 */
	public int getPosicionEquipo() {
		return posicionEquipo;
	}

	/**
	 * @param posicionEquipo the posicionEquipo to set
	 */
	public void setPosicionEquipo(int posicionEquipo) {
		this.posicionEquipo = posicionEquipo;
	}

	/**
	 * @return the listEquipo
	 */
	public List<Equipo> getListEquipo() {
		return listEquipo;
	}

	/**
	 * @param listEquipo the listEquipo to set
	 */
	public void setListEquipo(List<Equipo> listEquipo) {
		this.listEquipo = listEquipo;
	}

	/**
	 * @return the cantidadPuntosEquipo
	 */
	public int getCantidadPuntosEquipo() {
		return cantidadPuntosEquipo;
	}

	/**
	 * @param cantidadPuntosEquipo the cantidadPuntosEquipo to set
	 */
	public void setCantidadPuntosEquipo(int cantidadPuntosEquipo) {
		this.cantidadPuntosEquipo = cantidadPuntosEquipo;
	}

	/**
	 * @return the partidos
	 */
	public List<Partido> getPartidos() {
		return partidos;
	}

	/**
	 * @param partidos the partidos to set
	 */
	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	/**
	 * @param posicionEquipo
	 * @param listEquipo
	 * @param cantidadPuntosEquipo
	 * @param partidos
	 */
	public Fixture(int posicionEquipo, List<Equipo> listEquipo, int cantidadPuntosEquipo, List<Partido> partidos) {
		super();
		this.posicionEquipo = posicionEquipo;
		this.listEquipo = listEquipo;
		this.cantidadPuntosEquipo = cantidadPuntosEquipo;
		this.partidos = partidos;
	}

}
