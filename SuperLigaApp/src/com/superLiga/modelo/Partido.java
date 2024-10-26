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
public class Partido {

	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int categoria;
	private Date fechaPartido;
	private int horaPartido;
	private int cantidadGolesEquipoLocal;
	private int cantidadGolesEquipoVisitante;
	
	/**
	 * @return the equipoLocal
	 */
	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	/**
	 * @param equipoLocal the equipoLocal to set
	 */
	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	/**
	 * @return the equipoVisitante
	 */
	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	/**
	 * @param equipoVisitante the equipoVisitante to set
	 */
	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
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
	 * @return the fechaPartido
	 */
	public Date getFechaPartido() {
		return fechaPartido;
	}

	/**
	 * @param fechaPartido the fechaPartido to set
	 */
	public void setFechaPartido(Date fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	/**
	 * @return the horaPartido
	 */
	public int getHoraPartido() {
		return horaPartido;
	}

	/**
	 * @param horaPartido the horaPartido to set
	 */
	public void setHoraPartido(int horaPartido) {
		this.horaPartido = horaPartido;
	}

	/**
	 * @return the cantidadGolesEquipoLocal
	 */
	public int getCantidadGolesEquipoLocal() {
		return cantidadGolesEquipoLocal;
	}

	/**
	 * @param cantidadGolesEquipoLocal the cantidadGolesEquipoLocal to set
	 */
	public void setCantidadGolesEquipoLocal(int cantidadGolesEquipoLocal) {
		this.cantidadGolesEquipoLocal = cantidadGolesEquipoLocal;
	}

	/**
	 * @return the cantidadGolesEquipoVisitante
	 */
	public int getCantidadGolesEquipoVisitante() {
		return cantidadGolesEquipoVisitante;
	}

	/**
	 * @param cantidadGolesEquipoVisitante the cantidadGolesEquipoVisitante to set
	 */
	public void setCantidadGolesEquipoVisitante(int cantidadGolesEquipoVisitante) {
		this.cantidadGolesEquipoVisitante = cantidadGolesEquipoVisitante;
	}

	/**
	 * @param equipoLocal
	 * @param equipoVisitante
	 * @param categoria
	 * @param fechaPartido
	 * @param horaPartido
	 * @param cantidadGolesEquipoLocal
	 * @param cantidadGolesEquipoVisitante
	 */
	public Partido(Equipo equipoLocal, Equipo equipoVisitante, int categoria, Date fechaPartido, int horaPartido,
			int cantidadGolesEquipoLocal, int cantidadGolesEquipoVisitante) {
		super();
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.categoria = categoria;
		this.fechaPartido = fechaPartido;
		this.horaPartido = horaPartido;
		this.cantidadGolesEquipoLocal = cantidadGolesEquipoLocal;
		this.cantidadGolesEquipoVisitante = cantidadGolesEquipoVisitante;
	}

	/**
	 * @param equipoLocal2
	 * @param equipoVisitante2
	 */
	public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
		this.equipoLocal = equipoLocal;
	}
}
