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
public class Coordinador extends Persona{
	private String directorTecnicoFavorito;
	private int cantidadProfesoresACargo;
	
	/**
	 * @param directorTecnicoFavorito
	 * @param cantidadProfesoresACargo
	 */
	public Coordinador(String directorTecnicoFavorito, int cantidadProfesoresACargo) {
		super();
		this.directorTecnicoFavorito = directorTecnicoFavorito;
		this.cantidadProfesoresACargo = cantidadProfesoresACargo;
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
