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
public class Equipo {

	private int idEquipo;
	private String nombreEquipo;
	private int categoriaEquipo;
	private String apellidoNombreJugador;
	private int nroCamisetaJugador;
	private int cantidadPartidosGanados;
	private int cantidadPartidosEmpatados;
	private int cantidadPartidosPerdidos;
	private int cantidadGolesAFavor;
	private int cantidadGolesenContra;
	private int diferenciaGol;
	private String apellidoNombreProfesor;

	/**
	 * @return idEquipo
	 */
	public int getIdEquipo() {
		return idEquipo;
	}


	/**
	 * @param idEquipo 
	 */
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}


	/**
	 * @return  nombreEquipo
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
	 * @return  categoriaEquipo
	 */
	public int getCategoriaEquipo() {
		return categoriaEquipo;
	}


	/**
	 * @param categoriaEquipo 
	 */
	public void setCategoriaEquipo(int categoriaEquipo) {
		this.categoriaEquipo = categoriaEquipo;
	}


	/**
	 * @return apellidoNombreJugador
	 */
	public String getApellidoNombreJugador() {
		return apellidoNombreJugador;
	}


	/**
	 * @param apellidoNombreJugador 
	 */
	public void setApellidoNombreJugador(String apellidoNombreJugador) {
		this.apellidoNombreJugador = apellidoNombreJugador;
	}


	/**
	 * @return nroCamisetaJugador
	 */
	public int getNroCamisetaJugador() {
		return nroCamisetaJugador;
	}


	/**
	 * @param nroCamisetaJugador 
	 */
	public void setNroCamisetaJugador(int nroCamisetaJugador) {
		this.nroCamisetaJugador = nroCamisetaJugador;
	}


	/**
	 * @return cantidadPartidosGanados
	 */
	public int getCantidadPartidosGanados() {
		return cantidadPartidosGanados;
	}


	/**
	 * @param cantidadPartidosGanados
	 */
	public void setCantidadPartidosGanados(int cantidadPartidosGanados) {
		this.cantidadPartidosGanados = cantidadPartidosGanados;
	}


	/**
	 * @return  cantidadPartidosEmpatados
	 */
	public int getCantidadPartidosEmpatados() {
		return cantidadPartidosEmpatados;
	}


	/**
	 * @param cantidadPartidosEmpatados
	 */
	public void setCantidadPartidosEmpatados(int cantidadPartidosEmpatados) {
		this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
	}


	/**
	 * @return cantidadPartidosPerdidos
	 */
	public int getCantidadPartidosPerdidos() {
		return cantidadPartidosPerdidos;
	}


	/**
	 * @param cantidadPartidosPerdidos
	 */
	public void setCantidadPartidosPerdidos(int cantidadPartidosPerdidos) {
		this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
	}


	/**
	 * @return cantidadGolesAFavor
	 */
	public int getCantidadGolesAFavor() {
		return cantidadGolesAFavor;
	}


	/**
	 * @param cantidadGolesAFavor
	 */
	public void setCantidadGolesAFavor(int cantidadGolesAFavor) {
		this.cantidadGolesAFavor = cantidadGolesAFavor;
	}


	/**
	 * @return  cantidadGolesenContra
	 */
	public int getCantidadGolesenContra() {
		return cantidadGolesenContra;
	}


	/**
	 * @param cantidadGolesenContra 
	 */
	public void setCantidadGolesenContra(int cantidadGolesenContra) {
		this.cantidadGolesenContra = cantidadGolesenContra;
	}


	/**
	 * @return diferenciaGol
	 */
	public int getDiferenciaGol() {
		return diferenciaGol;
	}


	/**
	 * @param diferenciaGol
	 */
	public void setDiferenciaGol(int diferenciaGol) {
		this.diferenciaGol = diferenciaGol;
	}

	/**
	 * @param nombreEquipo
	 * @param categoriaEquipo
	 * @param apellidoNombreJugador
	 * @param nroCamisetaJugador
	 * @param cantidadPartidosGanados
	 * @param cantidadPartidosEmpatados
	 * @param cantidadPartidosPerdidos
	 * @param cantidadGolesAFavor
	 * @param cantidadGolesenContra
	 * @param diferenciaGol
	 * @param apellidoNombreProfesor
	 */
	public Equipo(String nombreEquipo, int categoriaEquipo, String apellidoNombreJugador, int nroCamisetaJugador,
			int cantidadPartidosGanados, int cantidadPartidosEmpatados, int cantidadPartidosPerdidos,
			int cantidadGolesAFavor, int cantidadGolesenContra, int diferenciaGol, String apellidoNombreProfesor) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.categoriaEquipo = categoriaEquipo;
		this.apellidoNombreJugador = apellidoNombreJugador;
		this.nroCamisetaJugador = nroCamisetaJugador;
		this.cantidadPartidosGanados = cantidadPartidosGanados;
		this.cantidadPartidosEmpatados = cantidadPartidosEmpatados;
		this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
		this.cantidadGolesAFavor = cantidadGolesAFavor;
		this.cantidadGolesenContra = cantidadGolesenContra;
		this.diferenciaGol = diferenciaGol;
		this.apellidoNombreProfesor = apellidoNombreProfesor;
	}


	/**
	 * @param nombreEquipo2
	 * @param categoriaEquipo2
	 */
	public Equipo(String nombreEquipo, int categoriaEquipo) {
			this.nombreEquipo = nombreEquipo;
			this.categoriaEquipo = categoriaEquipo;
	}
	
	/**
	 * @param nombreEquipo2
	 * @param categoriaEquipo2
	 */
	public Equipo(String nombreEquipo) {
			this.nombreEquipo = nombreEquipo;
	}


	/**
	 * @return apellidoNombreProfesor
	 */
	public String getApellidoNombreProfesor() {
		return apellidoNombreProfesor;
	}


	/**
	 * @param apellidoNombreProfesor
	 */
	public void setApellidoNombreProfesor(String apellidoNombreProfesor) {
		this.apellidoNombreProfesor = apellidoNombreProfesor;
	}
	
	
	 // Método toString para imprimir los datos del equipo
    @Override
    public String toString() {
        return "Equipo : " + '\n' +
                "nombreEquipo=" + nombreEquipo + '\n' +
                "categoriaEquipo=" + categoriaEquipo + '\n' +
                "apellidoNombreJugador=" + apellidoNombreJugador + '\n' +
                "nroCamisetaJugador=" + nroCamisetaJugador + '\n' +
                "cantidadPartidosGanados=" + cantidadPartidosGanados + '\n' +
                "cantidadPartidosEmpatados=" + cantidadPartidosEmpatados + '\n' +
                "cantidadPartidosPerdidos=" + cantidadPartidosPerdidos + '\n' +
                "cantidadGolesAFavor=" + cantidadGolesAFavor + '\n' +
                "cantidadGolesEnContra=" + cantidadGolesenContra + '\n' +
                "diferenciaDeGol=" + diferenciaGol + '\n' +
                "apellidoNombreProfesor=" + apellidoNombreProfesor + '\n';
    }
}
