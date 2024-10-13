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
public class Profesor extends Persona{

	private int idProfesor;
	private int categoriaDirigida;
	private List<Equipo> equipoAsignado;
	private String directorTecnicoFavorito;
	
	/**
	 * @param idProfesor
	 * @param categoriaDirigida
	 * @param equipoAsignado
	 * @param directorTecnicoFavorito
	 */
	public Profesor(int idProfesor, int categoriaDirigida, List<Equipo> equipoAsignado,
			String directorTecnicoFavorito) {
		super();
		this.idProfesor = idProfesor;
		this.categoriaDirigida = categoriaDirigida;
		this.equipoAsignado = equipoAsignado;
		this.directorTecnicoFavorito = directorTecnicoFavorito;
	}
	
	/**
	 * @return the idProfesor
	 */
	public int getIdProfesor() {
		return idProfesor;
	}
	/**
	 * @param idProfesor the idProfesor to set
	 */
	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	/**
	 * @return the categoriaDirigida
	 */
	public int getCategoriaDirigida() {
		return categoriaDirigida;
	}
	/**
	 * @param categoriaDirigida the categoriaDirigida to set
	 */
	public void setCategoriaDirigida(int categoriaDirigida) {
		this.categoriaDirigida = categoriaDirigida;
	}
	/**
	 * @return the equipoAsignado
	 */
	public List<Equipo> getEquipoAsignado() {
		return equipoAsignado;
	}
	/**
	 * @param equipoAsignado the equipoAsignado to set
	 */
	public void setEquipoAsignado(List<Equipo> equipoAsignado) {
		this.equipoAsignado = equipoAsignado;
	}
	/**
	 * @return the directorTecnicoFavorito
	 */
	public String getDirectorTecnicoFavorito() {
		return directorTecnicoFavorito;
	}
	/**
	 * @param directorTecnicoFavorito the directorTecnicoFavorito to set
	 */
	public void setDirectorTecnicoFavorito(String directorTecnicoFavorito) {
		this.directorTecnicoFavorito = directorTecnicoFavorito;
	}
	

}
