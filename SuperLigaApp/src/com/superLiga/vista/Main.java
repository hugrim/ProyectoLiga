/**
 * 
 */
package com.superLiga.vista;


import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;


/**
 * @author Hugo Grimanis
 *
 */
public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[]args){
	   
	    String opcion;
	    boolean salir= false;
	    do{
	    	System.out.println("************************************************************************ \n");
	        System.out.println("Super Liga App 2024-2025 \n");
	    	System.out.println("************************************************************************ \n");
	    	System.out.println("************************************************************************ \n");
	        System.out.println("Menu Principal de Opciones: \n");
	    	System.out.println("************************************************************************ \n");        
	        System.out.println("1: Jugador\n");
	        System.out.println("2: Equipo\n");
	        System.out.println("3: Partido\n");
	        System.out.println("4: Categoria\n");
	        System.out.println("5: Liga\n");
	        System.out.println("6: Fixture\n");
	        System.out.println("7: Usuario - Profesor\n");
	        System.out.println("8: Administrador - Coordinador\n");
	        System.out.println("9: Salir\n");
	        System.out.println("************************************************************************ \n");
	        System.out.println("Seleccione una de las opciones validas \n");
	        opcion=scanner.nextLine();
	        switch (opcion){
			    	case "1":
			          	subMenu(scanner,"Jugador");
			            break;
			        case "2":
			        	subMenu(scanner,"Equipo");
			            break;
			        case "3":
			        	 subMenu(scanner,"Partido");
		                 break;
			        case "4":
	                    subMenu(scanner,"Categoria");
	                    break;
			        case "5":
	                    subMenu(scanner,"Liga");
	                    break;
			        case "6":
	                    subMenu(scanner,"Fixture");
	                    break;
			        case "7":
	                    subMenu(scanner,"Profesor");
	                    break;
			        case "8":
	                    subMenu(scanner,"Coordinador");
	                    break;  
			        case "9":
			            salir = true;
			            break;
			        default:
			            System.out.println("Opcion invalida.Debe seleccionar alguna de las opciones validas \n");
			            System.out.println("Por favor, intente de nuevo");
			            break;
			    }
	        } while  (!salir);

	    	scanner.close();
	        System.out.println(" Ha salido del programa");
	    }

	    public static int mostrarSubMenu(Scanner scanner, String opcionMenu){
	        String opcion;
	        System.out.println("\n\033[1m" + "Sub Menu " + opcionMenu + " :" + "\033[0m\n" +
	                "1: Agregar " + opcionMenu + " :" +
	                "2: Editar  " + opcionMenu + " :" +
	                "3: Eiminar " + opcionMenu + " :" +
	                "4: Consultar " + opcionMenu + " :" +
	                "5: Volver al menú principal");

	        System.out.print("\033[1m" + "> " + "\033[0m");
	        opcion = scanner.nextLine();
	        return Integer.parseInt(opcion);
	    }

	    public static void subMenu(Scanner scanner, String opcionMenu) {

	        int opcion;
	        
	    	if(opcionMenu.equals("Jugador")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar Jugador");
		                    // Lógica para agregar jugador
		                    break;
		                case 2:
		                    System.out.println("Editar Jugador");
		                    // Lógica para editar jugador
		                    break;
		                case 3:
		                    System.out.println("Eliminar Jugador");
		                    // Lógica para eliminar jugador
		                    break;
		                case 4:
		                    System.out.println("Consultar Jugador");
		                    // Lógica para consultar jugador
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	//System.out.println("Volviendo al menú principal...");
	    	else if(opcionMenu.equals("Equipo")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar Equipo");
		                    // Lógica para agregar equipo
		                    break;
		                case 2:
		                    System.out.println("Editar Equipo");
		                    // Lógica para editar equipo
		                    break;
		                case 3:
		                    System.out.println("Eliminar Equipo");
		                    // Lógica para eliminar equipo
		                    break;
		                case 4:
		                    System.out.println("Consultar Equipo");
		                    // Lógica para consultar equipo
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Partido")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar Partido");
		                    // Lógica para agregar equipo
		                    break;
		                case 2:
		                    System.out.println("Editar partido");
		                    // Lógica para editar equipo
		                    break;
		                case 3:
		                    System.out.println("Eliminar partido");
		                    // Lógica para eliminar equipo
		                    break;
		                case 4:
		                    System.out.println("Consultar partido");
		                    // Lógica para consultar equipo
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Categoria")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar Categoria");
		                    // Lógica para agregar categoría
		                    break;
		                case 2:
		                    System.out.println("Editar Categoria");
		                    // Lógica para editar categoría
		                    break;
		                case 3:
		                    System.out.println("Eliminar Categoria");
		                    // Lógica para eliminar categoría
		                    break;
		                case 4:
		                    System.out.println("Consultar Categoria");
		                    // Lógica para consultar categoría
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Liga")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar LIGA");
		                    // Lógica para agregar categoría
		                    break;
		                case 2:
		                    System.out.println("Editar LIGA");
		                    // Lógica para editar categoría
		                    break;
		                case 3:
		                    System.out.println("Eliminar LIGA");
		                    // Lógica para eliminar categoría
		                    break;
		                case 4:
		                    System.out.println("Consultar LIGA");
		                    // Lógica para consultar categoría
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Fixture")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            switch (opcion) {
			                case 1:
			                    System.out.println("Agregar FX");
			                    // Lógica para agregar categoría
			                    break;
			                case 2:
			                    System.out.println("Editar FX");
			                    // Lógica para editar categoría
			                    break;
			                case 3:
			                    System.out.println("Eliminar FX");
			                    // Lógica para eliminar categoría
			                    break;
			                case 4:
			                    System.out.println("Consultar FX");
			                    // Lógica para consultar categoría
			                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Profesor")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar Profesor");
		                    // Lógica para agregar profesor
		                    break;
		                case 2:
		                    System.out.println("Editar Profesor");
		                    // Lógica para editar profesor
		                    break;
		                case 3:
		                    System.out.println("Eliminar Profesor");
		                    // Lógica para eliminar profesor
		                    break;
		                case 4:
		                    System.out.println("Consultar Profesor");
		                    // Lógica para consultar profesor
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Coordinador")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar CO");
		                    // Lógica para agregar profesor
		                    break;
		                case 2:
		                    System.out.println("Editar CO");
		                    // Lógica para editar profesor
		                    break;
		                case 3:
		                    System.out.println("Eliminar CO");
		                    // Lógica para eliminar profesor
		                    break;
		                case 4:
		                    System.out.println("Consultar CO");
		                    // Lógica para consultar profesor
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}else {
				System.out.println("Volviendo al menú principal...");
			}
	    }
	}
