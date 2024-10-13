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
public class Coordinador extends Persona{
	
	private int idCoordinador;
	private String directorTecnicoFavorito;
	private List<Profesor> listaProfesores;
	private int cantidadProfesoresACargo;
	
	/**
	 * @param idCoordinador
	 * @param directorTecnicoFavorito
	 * @param listaProfesores
	 * @param cantidadProfesoresACargo
	 */
	public Coordinador(int idCoordinador, String directorTecnicoFavorito, List<Profesor> listaProfesores,
			int cantidadProfesoresACargo) {
		super();
		this.idCoordinador = idCoordinador;
		this.directorTecnicoFavorito = directorTecnicoFavorito;
		this.listaProfesores = listaProfesores;
		this.cantidadProfesoresACargo = cantidadProfesoresACargo;
	}
	
	/**
	 * @return the idCoordinador
	 */
	public int getIdCoordinador() {
		return idCoordinador;
	}
	/**
	 * @param idCoordinador the idCoordinador to set
	 */
	public void setIdCoordinador(int idCoordinador) {
		this.idCoordinador = idCoordinador;
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
	/**
	 * @return the listaProfesores
	 */
	public List<Profesor> getListaProfesores() {
		return listaProfesores;
	}
	/**
	 * @param listaProfesores the listaProfesores to set
	 */
	public void setListaProfesores(List<Profesor> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}
	/**
	 * @return the cantidadProfesoresACargo
	 */
	public int getCantidadProfesoresACargo() {
		return cantidadProfesoresACargo;
	}
	/**
	 * @param cantidadProfesoresACargo the cantidadProfesoresACargo to set
	 */
	public void setCantidadProfesoresACargo(int cantidadProfesoresACargo) {
		this.cantidadProfesoresACargo = cantidadProfesoresACargo;
	}
}
