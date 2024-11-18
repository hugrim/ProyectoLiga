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
public class Liga {

	private int idLiga;
	private String nombreLiga;
	private int nroFechaLiga;
	private int categoriaLiga;
	private String equipos;
	private int posicionEquipo;

	
	/**
	 * @return  idLiga
	 */
	public int getIdLiga() {
		return idLiga;
	}

	/**
	 * @param idLiga 
	 */
	public void setIdLiga(int idLiga) {
		this.idLiga = idLiga;
	}

	/**
	 * @return nombreLiga
	 */
	public String getNombreLiga() {
		return nombreLiga;
	}

	/**
	 * @param nombreLiga 
	 */
	public void setNombreLiga(String nombreLiga) {
		this.nombreLiga = nombreLiga;
	}

	/**
	 * @return  nroFechaLiga
	 */
	public int getNroFechaLiga() {
		return nroFechaLiga;
	}

	/**
	 * @param nroFechaLiga 
	 */
	public void setNroFechaLiga(int nroFechaLiga) {
		this.nroFechaLiga = nroFechaLiga;
	}

	/**
	 * @return  categoriaLiga
	 */
	public int getCategoriaLiga() {
		return categoriaLiga;
	}

	/**
	 * @param categoriaLiga 
	 */
	public void setCategoriaLiga(int categoriaLiga) {
		this.categoriaLiga = categoriaLiga;
	}

	/**
	 * @return  equipos
	 */
	public String getEquipos() {
		return equipos;
	}

	/**
	 * @param equipos 
	 */
	public void setEquipos(String equipos) {
		this.equipos = equipos;
	}

	/**
	 * @return  posicionEquipo
	 */
	public int getPosicionEquipo() {
		return posicionEquipo;
	}

	/**
	 * @param posicionEquipo 
	 */
	public void setPosicionEquipo(int posicionEquipo) {
		this.posicionEquipo = posicionEquipo;
	}

	/**
	 * @param nombreLiga
	 * @param nroFechaLiga
	 * @param categoriaLiga
	 * @param equipos
	 * @param posicionEquipo
	 */
	public Liga(String nombreLiga, int nroFechaLiga, int categoriaLiga, String equipos,
			int posicionEquipo) {
		super();
		this.nombreLiga = nombreLiga;
		this.nroFechaLiga = nroFechaLiga;
		this.categoriaLiga = categoriaLiga;
		this.equipos = equipos;
		this.posicionEquipo = posicionEquipo;
	}
	
	
	/**
	 * @param nombreLiga
	 * @param categoriaLiga
	 */
	public Liga(String nombreLiga, int categoriaLiga) {
		super();
		this.nombreLiga = nombreLiga;
		this.categoriaLiga = categoriaLiga;
	}

	/**
	 * 
	 */
	public Liga() {
		// TODO Auto-generated constructor stub
	}
}
