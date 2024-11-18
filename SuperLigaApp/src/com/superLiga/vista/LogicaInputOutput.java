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
		
		 Persona persona = obtenerDatosPersona();
		 
	        System.out.print("Categoria Jugador: ");
	        int categoria = scanner.nextInt();

	        if (scanner.hasNextLine()) {
	            scanner.nextLine();
	        }
		 
		return new Jugador(persona.getApellidoNombre(), persona.getFechaNacimiento(), persona.getDni(), persona.getSexo(), persona.getEdad(), persona.getDomicilio(), persona.getProvincia(), persona.getCodigoPostal(), persona.getEmail(), persona.getTelefono(), persona.getHinchaClub(), categoria, "", 0);
				
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

	    // Captura de datos para Categoria
	    public static Categoria obtenerDatosCategoria() {
	        System.out.print("Ingrese el año de la categoría: ");
	        int anioCategoria = scanner.nextInt();

	        return new Categoria(anioCategoria);
	    }

	    // Captura de datos para Coordinador
	    public static Coordinador obtenerDatosCoordinador() {
	    	Persona persona = obtenerDatosPersona();

	        System.out.print("Ingrese el director técnico favorito: ");
            String directorTecnicoFavorito = scanner.nextLine().toLowerCase();

		 
			return new Coordinador(persona.getApellidoNombre(), persona.getFechaNacimiento(), persona.getDni(), persona.getSexo(), 
								persona.getEdad(), persona.getDomicilio(), persona.getProvincia(), persona.getCodigoPostal(), persona.getEmail(), 
								persona.getTelefono(), persona.getHinchaClub(),directorTecnicoFavorito,0);

	    }

	    // Captura de datos para Persona
	    public static Persona obtenerDatosPersona() {
	        System.out.print("Ingrese el apellido y nombre: ");
	        String apellidoNombre = scanner.nextLine().toLowerCase();

	        System.out.print("Ingrese la fecha de nacimiento (yyyy-mm-dd): ");
	        Date fechaNacimiento = parseDate(scanner.nextLine());

	        System.out.print("Ingrese el DNI: ");
	        int dni = scanner.nextInt();

	        System.out.print("Ingrese el sexo (M/F): ");
	        char sexo = scanner.next().charAt(0);
	        scanner.nextLine(); // Limpiar el buffer

	        System.out.print("Ingrese la edad: ");
	        int edad = scanner.nextInt();
	        
	        if (scanner.hasNextLine()) {
	            scanner.nextLine();
	        }
	        
	        System.out.print("Ingrese el domicilio: ");
	        String domicilio = scanner.nextLine();

	        System.out.print("Ingrese la provincia: ");
	        String provinciaInput = scanner.nextLine();
	        
	        Provincia provincia = obtenerProvinciaPorDescripcion(provinciaInput);
	        if (provincia != null) {
	            System.out.println("Provincia seleccionada: " + provincia.getDescripcion());
	        } else {
	            System.out.println("Provincia no válida.");
	        }

	        System.out.print("Ingrese el código postal: ");
	        String codigoPostal = scanner.nextLine();

	        System.out.print("Ingrese el email: ");
	        String email = scanner.nextLine();

	        System.out.print("Ingrese el teléfono: ");
	        long telefono = scanner.nextLong();
	        
	        if (scanner.hasNextLine()) {
	            scanner.nextLine();
	        }

	        System.out.print("Ingrese el club al que hincha: ");
	        String hinchaClub = scanner.nextLine();
	        
			return new Persona(apellidoNombre, fechaNacimiento, dni, sexo, edad, domicilio, provincia , codigoPostal, email, telefono, hinchaClub);
	    }
	    
	    public static Provincia obtenerProvinciaPorDescripcion(String descripcion) {
	        for (Provincia provincia : Provincia.values()) {
	            if (provincia.getDescripcion().equalsIgnoreCase(descripcion)) {
	                return provincia;
	            }
	        }
	        return null; // O lanza una excepción si no se encuentra
	    }

	    // Captura de datos para Profesor
	    public static Profesor obtenerDatosProfesor() {
	    	Persona persona = obtenerDatosPersona();

	        System.out.print("Ingrese el director técnico favorito: ");
            String directorTecnicoFavorito = scanner.nextLine().toLowerCase();

            System.out.print("Ingrese la categoría a Dirigir: ");
	        int categoriaDirigida = scanner.nextInt();
	        
	        if (scanner.hasNextLine()) {
	            scanner.nextLine();
	        }
		 
			return new Profesor(persona.getApellidoNombre(), persona.getFechaNacimiento(), persona.getDni(), persona.getSexo(), 
								persona.getEdad(), persona.getDomicilio(), persona.getProvincia(), persona.getCodigoPostal(), persona.getEmail(), 
								persona.getTelefono(), persona.getHinchaClub(), categoriaDirigida, directorTecnicoFavorito, "");
			
	     }

	    // Captura de datos para Liga
	    public static Liga obtenerDatosLiga() {
	    	
	        System.out.print("Ingrese el nombre de la liga: ");
	        String nombreLiga = scanner.nextLine();

	        System.out.print("Ingrese la categoría de la liga: ");
	        int categoriaLiga = scanner.nextInt();

	        return new Liga(nombreLiga, categoriaLiga);
	    }

	/**
	 * Metodo que parsea la fecha ingresada por consola a un formato especifico (yyyy-MM-dd)
	 * @param dateString
	 * @return Date con el formato adecuado
	 */
	public static Date parseDate(String dateString) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
		} catch (Exception e) {
			System.out.println("Error en el formato de la fecha.");
            return null;
		}
	}
}
