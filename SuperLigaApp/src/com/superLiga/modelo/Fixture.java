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
public class Fixture {

	private int idFixture;
	private String nombreEquipo;
	private int cantidadPuntosEquipo;
	
	/**
	 * @return nombreEquipo
	 */
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	/**
	 * @param nombreEquipo
	 */
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	/**
	 * @return cantidadPuntosEquipo
	 */
	public int getCantidadPuntosEquipo() {
		return cantidadPuntosEquipo;
	}

	/**
	 * @param cantidadPuntosEquipo
	 */
	public void setCantidadPuntosEquipo(int cantidadPuntosEquipo) {
		this.cantidadPuntosEquipo = cantidadPuntosEquipo;
	}


	/**
	 * @param nombreEquipo
	 * @param cantidadPuntosEquipo
	 */
	public Fixture(String nombreEquipo, int cantidadPuntosEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.cantidadPuntosEquipo = cantidadPuntosEquipo;
	}

	/**
	 * @return idFixture
	 */
	public int getIdFixture() {
		return idFixture;
	}

	/**
	 * @param idFixture
	 */
	public void setIdFixture(int idFixture) {
		this.idFixture = idFixture;
	}

}
