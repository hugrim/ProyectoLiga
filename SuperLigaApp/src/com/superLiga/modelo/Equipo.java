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
public class Equipo {

	private int idEquipo;
	private String nombreEquipo;
	private int categoriaEquipo;
	private List<Jugador> listaJugadores;
	private int cantidadPartidosGanados;
	private int cantidadPartidosEmpatados;
	private int cantidadPartidosPerdidos;
	private int diferenciaGol;
	
	/**
	 * @return the idEquipo
	 */
	public int getIdEquipo() {
		return idEquipo;
	}

	/**
	 * @param idEquipo the idEquipo to set
	 */
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	/**
	 * @return the nombreEquipo
	 */
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	/**
	 * @param nombreEquipo the nombreEquipo to set
	 */
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	/**
	 * @return the categoriaEquipo
	 */
	public int getCategoriaEquipo() {
		return categoriaEquipo;
	}

	/**
	 * @param categoriaEquipo the categoriaEquipo to set
	 */
	public void setCategoriaEquipo(int categoriaEquipo) {
		this.categoriaEquipo = categoriaEquipo;
	}

	/**
	 * @return the listaJugadores
	 */
	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	/**
	 * @param listaJugadores the listaJugadores to set
	 */
	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	/**
	 * @return the cantidadPartidosGanados
	 */
	public int getCantidadPartidosGanados() {
		return cantidadPartidosGanados;
	}

	/**
	 * @param cantidadPartidosGanados the cantidadPartidosGanados to set
	 */
	public void setCantidadPartidosGanados(int cantidadPartidosGanados) {
		this.cantidadPartidosGanados = cantidadPartidosGanados;
	}

	/**
	 * @return the cantidadPartidosEmpatados
	 */
	public int getCantidadPartidosEmpatados() {
		return cantidadPartidosEmpatados;
	}

	/**
	 * @param cantidadPartidosEmpatados the cantidadPartidosEmpatados to set
	 */
	public void setCantidadPartidosEmpatados(int cantidadPartidosEmpatados) {
		this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
	}

	/**
	 * @return the cantidadPartidosPerdidos
	 */
	public int getCantidadPartidosPerdidos() {
		return cantidadPartidosPerdidos;
	}

	/**
	 * @param cantidadPartidosPerdidos the cantidadPartidosPerdidos to set
	 */
	public void setCantidadPartidosPerdidos(int cantidadPartidosPerdidos) {
		this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
	}

	/**
	 * @return the diferenciaGol
	 */
	public int getDiferenciaGol() {
		return diferenciaGol;
	}

	/**
	 * @param diferenciaGol the diferenciaGol to set
	 */
	public void setDiferenciaGol(int diferenciaGol) {
		this.diferenciaGol = diferenciaGol;
	}

	/**
	 * @param idEquipo
	 * @param nombreEquipo
	 * @param categoriaEquipo
	 * @param listaJugadores
	 * @param cantidadPartidosGanados
	 * @param cantidadPartidosEmpatados
	 * @param cantidadPartidosPerdidos
	 * @param diferenciaGol
	 */
	public Equipo(int idEquipo, String nombreEquipo, int categoriaEquipo, List<Jugador> listaJugadores,
			int cantidadPartidosGanados, int cantidadPartidosEmpatados, int cantidadPartidosPerdidos,
			int diferenciaGol) {
		super();
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;
		this.categoriaEquipo = categoriaEquipo;
		this.listaJugadores = listaJugadores;
		this.cantidadPartidosGanados = cantidadPartidosGanados;
		this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
		this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
		this.diferenciaGol = diferenciaGol;
	}

	/**
	 * @param nombreEquipo2
	 * @param categoriaEquipo2
	 */
	public Equipo(String nombreEquipo, int categoriaEquipo) {
			this.nombreEquipo = nombreEquipo;
			this.categoriaEquipo = categoriaEquipo;
	}
	
}
