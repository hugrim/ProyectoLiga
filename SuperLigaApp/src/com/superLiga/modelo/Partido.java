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

	private String equipoLocal;
	private String equipoVisitante;
	private int categoria;
	private Date fechaPartido;
	private int horaPartido;
	private int cantidadGolesEquipoLocal;
	private int cantidadGolesEquipoVisitante;
	private String equipoGanadorPartido;
	
	/**
	 * @return  equipoLocal
	 */
	public String getEquipoLocal() {
		return equipoLocal;
	}

	/**
	 * @param equipoLocal 
	 */
	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	/**
	 * @return  equipoVisitante
	 */
	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	/**
	 * @param equipoVisitante 
	 */
	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	/**
	 * @return  categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria 
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return  fechaPartido
	 */
	public Date getFechaPartido() {
		return fechaPartido;
	}

	/**
	 * @param fechaPartido 
	 */
	public void setFechaPartido(Date fechaPartido) {
		this.fechaPartido = fechaPartido;
	}

	/**
	 * @return  horaPartido
	 */
	public int getHoraPartido() {
		return horaPartido;
	}

	/**
	 * @param horaPartido 
	 */
	public void setHoraPartido(int horaPartido) {
		this.horaPartido = horaPartido;
	}

	/**
	 * @return  cantidadGolesEquipoLocal
	 */
	public int getCantidadGolesEquipoLocal() {
		return cantidadGolesEquipoLocal;
	}

	/**
	 * @param cantidadGolesEquipoLocal 
	 */
	public void setCantidadGolesEquipoLocal(int cantidadGolesEquipoLocal) {
		this.cantidadGolesEquipoLocal = cantidadGolesEquipoLocal;
	}

	/**
	 * @return  cantidadGolesEquipoVisitante
	 */
	public int getCantidadGolesEquipoVisitante() {
		return cantidadGolesEquipoVisitante;
	}

	/**
	 * @param cantidadGolesEquipoVisitante 
	 */
	public void setCantidadGolesEquipoVisitante(int cantidadGolesEquipoVisitante) {
		this.cantidadGolesEquipoVisitante = cantidadGolesEquipoVisitante;
	}

	/**
	 * @return  equipoGanadorPartido
	 */
	public String getEquipoGanadorPartido() {
		return equipoGanadorPartido;
	}

	/**
	 * @param equipoGanadorPartido 
	 */
	public void setEquipoGanadorPartido(String equipoGanadorPartido) {
		this.equipoGanadorPartido = equipoGanadorPartido;
	}

	/**
	 * @param equipoLocal
	 * @param equipoVisitante
	 * @param categoria
	 * @param fechaPartido
	 * @param horaPartido
	 * @param cantidadGolesEquipoLocal
	 * @param cantidadGolesEquipoVisitante
	 * @param equipoGanadorPartido
	 */
	public Partido(String equipoLocal, String equipoVisitante, int categoria, Date fechaPartido, int horaPartido,
			int cantidadGolesEquipoLocal, int cantidadGolesEquipoVisitante, String equipoGanadorPartido) {
		super();
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.categoria = categoria;
		this.fechaPartido = fechaPartido;
		this.horaPartido = horaPartido;
		this.cantidadGolesEquipoLocal = cantidadGolesEquipoLocal;
		this.cantidadGolesEquipoVisitante = cantidadGolesEquipoVisitante;
		this.equipoGanadorPartido = equipoGanadorPartido;
	}

	/**
	 * @param equipoLocal
	 * @param equipoVisitante
	 */
	public Partido(String equipoLocal, String equipoVisitante, int categoria, Date fechaPartido, int horaPartido) {
		this.equipoVisitante = equipoVisitante;
		this.equipoLocal = equipoLocal;
		this.categoria = categoria;
		this.fechaPartido = fechaPartido;
		this.horaPartido = horaPartido;
	}

	
	/**
	 * @param equipoLocal
	 * @param equipoVisitante
	 */
	public Partido(String equipoLocal, String equipoVisitante, int categoria) {
		this.equipoVisitante = equipoVisitante;
		this.equipoLocal = equipoLocal;
		this.categoria = categoria;
	}
	
	/**
	 * 
	 */
	public Partido() {
		// TODO Auto-generated constructor stub
	}
	
	 // Método toString para imprimir los datos del Partido
    @Override
    public String toString() {
        return "Partido: " + '\n' +
                "equipoLocal=" + equipoLocal + '\n' +
                "equipoVisitante=" + equipoVisitante + '\n' +
                "categoria=" + categoria + '\n' +
                "fechaPartido=" + fechaPartido + '\n' +
                "horaPartido=" + horaPartido + '\n' +
                "cantidadGolesEquipoLocal=" + cantidadGolesEquipoLocal + '\n' +
                "cantidadGolesEquipoVisitante=" + cantidadGolesEquipoVisitante + '\n' +
                "equipoGanadorPartido=" + equipoGanadorPartido + '\n';
    }
}
