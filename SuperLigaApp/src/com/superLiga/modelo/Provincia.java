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
public enum Provincia {

	BUENOS_AIRES("Buenos Aires"),
	CATAMARCA("Catamarca"),
	CHACO("Chaco"),
	CHUBUT("Chubut"),
	CIUDAD_AUTONOMA_DE_BUENOS_AIRES("Ciudad Autónoma De Buenos Aires"),
	CORDOBA("Córdoba"),
	CORRIENTES("Corrientes"),
	ENTRE_RIOS("Entre Ríos"),
	FORMOSA("Formosa"),
	JUJUY("Jujuy"),
	LA_PAMPA("La Pampa"),
	LA_RIOJA("La Rioja"),
	MENDOZA("Mendoza"),
	MISIONES("Misiones"),
	NEUQUEN("Neuquén"),
	RIO_NEGRO("Río Negro"),
	SALTA("Salta"),
	SAN_JUAN("San Juan"),
	SAN_LUIS("San Luis"),
	SANTA_CRUZ("Santa Cruz"),
	SANTA_FE("Santa Fe"),
	SANTIAGO_DEL_ESTERO("Santiago Del Estero"),
	TIERRA_DEL_FUEGO("Tierra Del Fuego"),
	TUCUMAN("Tucumán");

	/**
	 * @param string
	 */
	Provincia(String descripcion) {
		this.setDescripcion(descripcion);
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	private String descripcion;
}
