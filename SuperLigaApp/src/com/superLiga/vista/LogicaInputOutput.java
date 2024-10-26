/**
 * 
 */
package com.superLiga.vista;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.superLiga.modelo.Categoria;
import com.superLiga.modelo.Coordinador;
import com.superLiga.modelo.Equipo;
import com.superLiga.modelo.Jugador;
import com.superLiga.modelo.Liga;
import com.superLiga.modelo.Partido;
import com.superLiga.modelo.Persona;
import com.superLiga.modelo.Profesor;
import com.superLiga.modelo.Provincia;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */

/**
 * Esta clase contendra la logica de todos los campos que se mostraran por linea de comandos para cada una de las entidades
 * Cada metodo se asocia a cada uno de los datos que se solicitaran por consola al usuario para cada entidad
 */
public class LogicaInputOutput {

	 private static Scanner scanner = new Scanner(System.in);
	 
	 /**
	  * Metodo para obtener cada uno de los campos que se requieren de la clase Jugador 
	  * @return Jugador
	  */
	 public static Jugador obtenerDatosJugador() {
		
		 Jugador jugador = (Jugador) obtenerDatosPersona();
		 
			/*
			 * System.out.print("Apellido y Nombre: ");
			 * jugador.setApellidoNombre(scanner.nextLine());
			 * 
			 * System.out.print("Fecha de Nacimiento (yyyy-mm-dd): ");
			 * jugador.setFechaNacimiento(parseDate(scanner.nextLine()));
			 * 
			 * System.out.print("DNI: "); jugador.setDni(scanner.nextInt());
			 * 
			 * System.out.print("Sexo (M/F): "); jugador.setSexo(scanner.next().charAt(0));
			 * scanner.nextLine(); // Limpiar el buffer
			 * 
			 * System.out.print("Direccion: "); jugador.setDomicilio(scanner.nextLine());
			 * 
			 * System.out.print("Provincia: ");
			 * 
			 * String provincia = scanner.nextLine().toUpperCase();
			 * 
			 * // Utilizando el valueOf() del Enum , convierto el valor ingresado por
			 * teclado a un valor del Enum, realizando la comparacion //Luego lo inserto en
			 * el objeto del tipo Jugador //En el caso que el valor no sea valido, se
			 * captura el error (con una excepcion IllegalArgumentException) y se muestra un
			 * mensaje al usuario try { jugador.setProvincia(Provincia.valueOf(provincia));
			 * } catch (IllegalArgumentException e) {
			 * System.out.println("Valor ingresado de Provincia no es válido."); }
			 * 
			 * System.out.print("Codigo Postal: ");
			 * jugador.setCodigoPostal(scanner.nextLine());
			 * 
			 * System.out.print("Telefono: "); jugador.setTelefono(scanner.nextLong());
			 * 
			 * System.out.print("Email: "); jugador.setEmail(scanner.next());
			 */

	        System.out.print("Categoria Jugador: ");
	        jugador.setCategoria(scanner.nextInt());

	        System.out.print("Equipo Asignado: ");
	        jugador.setEquipoAsignado(scanner.nextLine());

	        System.out.print("Numero de Camiseta: ");
	        jugador.setNroCamiseta(scanner.nextInt());

		 
		return jugador;		 
	 }
	 
	 /**
	  * Metodo para obtener cada uno de los campos que se requieren de la clase Equipo 
	  * @return Jugador
	  */

	 public static Equipo obtenerDatosEquipo() {
	        System.out.print("Ingrese el nombre del equipo: ");
	        String nombreEquipo = scanner.nextLine();

	        System.out.print("Ingrese la categoría del equipo: ");
	        int categoriaEquipo = scanner.nextInt();
	        scanner.nextLine(); // Limpiar el buffer

	        return new Equipo(nombreEquipo, categoriaEquipo);
	 }
	// Captura de datos para Partido
	    public static Partido obtenerDatosPartido() {
	        Equipo equipoLocal = obtenerDatosEquipo();
	        Equipo equipoVisitante = obtenerDatosEquipo();

	        System.out.print("Ingrese la categoría: ");
	        int categoria = scanner.nextInt();

	        System.out.print("Ingrese la fecha del partido (yyyy-mm-dd): ");
	        Date fechaPartido = parseDate(scanner.nextLine());

	        System.out.print("Ingrese la hora del partido: ");
	        int horaPartido = scanner.nextInt();

	        System.out.print("Ingrese la cantidad de goles del equipo local: ");
	        int cantidadGolesEquipoLocal = scanner.nextInt();

	        System.out.print("Ingrese la cantidad de goles del equipo visitante: ");
	        int cantidadGolesEquipoVisitante = scanner.nextInt();

	        return new Partido(equipoLocal, equipoVisitante, categoria, fechaPartido, horaPartido, cantidadGolesEquipoLocal, cantidadGolesEquipoVisitante);
	    }
	    

	    // Captura de datos para Categoria
	    public static Categoria obtenerDatosCategoria() {
	        System.out.print("Ingrese el año de la categoría: ");
	        int anioCategoria = scanner.nextInt();

	        return new Categoria(anioCategoria);
	    }

	    // Captura de datos para Coordinador
	    public static Coordinador obtenerDatosCoordinador() {
	    	
	    	Coordinador coordinador = (Coordinador) obtenerDatosPersona();
	    	
	        System.out.print("Ingrese el director técnico favorito: ");
	        coordinador.setDirectorTecnicoFavorito(scanner.nextLine());
	        return coordinador;
	    }

	    // Captura de datos para Persona
	    public static Persona obtenerDatosPersona() {
	        System.out.print("Ingrese el apellido y nombre: ");
	        String apellidoNombre = scanner.nextLine();

	        System.out.print("Ingrese la fecha de nacimiento (yyyy-mm-dd): ");
	        Date fechaNacimiento = parseDate(scanner.nextLine());

	        System.out.print("Ingrese el DNI: ");
	        int dni = scanner.nextInt();

	        System.out.print("Ingrese el sexo (M/F): ");
	        char sexo = scanner.next().charAt(0);
	        scanner.nextLine(); // Limpiar el buffer

	        System.out.print("Ingrese la edad: ");
	        int edad = scanner.nextInt();

	        System.out.print("Ingrese el domicilio: ");
	        String domicilio = scanner.nextLine();

	        System.out.print("Ingrese la provincia: ");
	        String provincia = scanner.nextLine().toUpperCase();

	        System.out.print("Ingrese el código postal: ");
	        String codigoPostal = scanner.nextLine();

	        System.out.print("Ingrese el email: ");
	        String email = scanner.nextLine();

	        System.out.print("Ingrese el teléfono: ");
	        long telefono = scanner.nextLong();

	        System.out.print("Ingrese el club al que hincha: ");
	        String hinchaClub = scanner.nextLine();
	        
			return new Persona(apellidoNombre, fechaNacimiento, dni, sexo, edad, domicilio, Provincia.valueOf(provincia) , codigoPostal, email, telefono, hinchaClub);
	    }

	    // Captura de datos para Profesor
	    public static Profesor obtenerDatosProfesor() {
	    	
	    	Profesor profesor = (Profesor) obtenerDatosPersona();

	        System.out.print("Ingrese la categoría dirigida: ");
	        profesor.setCategoriaDirigida(scanner.nextInt());

	        System.out.print("Ingrese el director técnico favorito: ");
	        profesor.setDirectorTecnicoFavorito(scanner.nextLine());

	        return profesor;
	     }

	    // Captura de datos para Liga
	    public static Liga obtenerDatosLiga() {
	    	
	        System.out.print("Ingrese el nombre de la liga: ");
	        String nombreLiga = scanner.nextLine();

	        System.out.print("Ingrese el número de fecha de la liga: ");
	        int nroFechaLiga = scanner.nextInt();

	        System.out.print("Ingrese la categoría de la liga: ");
	        int categoriaLiga = scanner.nextInt();

	        return new Liga(categoriaLiga, nombreLiga, nroFechaLiga, categoriaLiga, null, null);
	    }

	/**
	 * Metodo que parsea la fecha ingresada por consola a un formato especifico (yyyy-MM-dd)
	 * @param dateString
	 * @return Date con el formato adecuado
	 */
	private static Date parseDate(String dateString) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
		} catch (Exception e) {
			System.out.println("Error en el formato de la fecha.");
            return null;
		}
	}
}
