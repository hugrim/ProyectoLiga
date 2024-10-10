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
public class Profesor extends Persona{

	private int categoriaDirigida;
	private String equipoAsignado;
	private String directorTecnicoFavorito;
	
	/**
	 * @param categoriaDirigida
	 * @param equipoAsignado
	 * @param directorTecnicoFavorito
	 */
	public Profesor(int categoriaDirigida, String equipoAsignado, String directorTecnicoFavorito) {
		super();
		this.categoriaDirigida = categoriaDirigida;
		this.equipoAsignado = equipoAsignado;
		this.directorTecnicoFavorito = directorTecnicoFavorito;
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
