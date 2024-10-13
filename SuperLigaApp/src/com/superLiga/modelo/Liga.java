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
public class Liga {

	private int idLiga;
	private String nombreLiga;
	private int nroFechaLiga;
	private int categoriaLiga;
	private List<Equipo> equipos;
	private List<Partido> partidos;
	
	/**
	 * @return the idLiga
	 */
	public int getIdLiga() {
		return idLiga;
	}

	/**
	 * @param idLiga the idLiga to set
	 */
	public void setIdLiga(int idLiga) {
		this.idLiga = idLiga;
	}

	/**
	 * @return the nombreLiga
	 */
	public String getNombreLiga() {
		return nombreLiga;
	}

	/**
	 * @param nombreLiga the nombreLiga to set
	 */
	public void setNombreLiga(String nombreLiga) {
		this.nombreLiga = nombreLiga;
	}

	/**
	 * @return the nroFechaLiga
	 */
	public int getNroFechaLiga() {
		return nroFechaLiga;
	}

	/**
	 * @param nroFechaLiga the nroFechaLiga to set
	 */
	public void setNroFechaLiga(int nroFechaLiga) {
		this.nroFechaLiga = nroFechaLiga;
	}

	/**
	 * @return the categoriaLiga
	 */
	public int getCategoriaLiga() {
		return categoriaLiga;
	}

	/**
	 * @param categoriaLiga the categoriaLiga to set
	 */
	public void setCategoriaLiga(int categoriaLiga) {
		this.categoriaLiga = categoriaLiga;
	}

	/**
	 * @return the equipos
	 */
	public List<Equipo> getEquipos() {
		return equipos;
	}

	/**
	 * @param equipos the equipos to set
	 */
	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
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
	 * @param idLiga
	 * @param nombreLiga
	 * @param nroFechaLiga
	 * @param categoriaLiga
	 * @param equipos
	 * @param partidos
	 */
	public Liga(int idLiga, String nombreLiga, int nroFechaLiga, int categoriaLiga, List<Equipo> equipos,
			List<Partido> partidos) {
		super();
		this.idLiga = idLiga;
		this.nombreLiga = nombreLiga;
		this.nroFechaLiga = nroFechaLiga;
		this.categoriaLiga = categoriaLiga;
		this.equipos = equipos;
		this.partidos = partidos;
	}
	
	
}
