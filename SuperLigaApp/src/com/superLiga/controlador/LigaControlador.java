/**
 * 
 */
package com.superLiga.controlador;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.superLiga.modelo.Categoria;
import com.superLiga.modelo.Coordinador;
import com.superLiga.modelo.Equipo;
import com.superLiga.modelo.Fixture;
import com.superLiga.modelo.Jugador;
import com.superLiga.modelo.Liga;
import com.superLiga.modelo.Partido;
import com.superLiga.modelo.Profesor;
import com.superLiga.modelo.ServiceImpl.CategoriaServiceimpl;
import com.superLiga.modelo.ServiceImpl.CoordinadorServiceImpl;
import com.superLiga.modelo.ServiceImpl.EquipoServiceImpl;
import com.superLiga.modelo.ServiceImpl.FixtureServiceImpl;
import com.superLiga.modelo.ServiceImpl.JugadorServiceImpl;
import com.superLiga.modelo.ServiceImpl.LigaServiceImpl;
import com.superLiga.modelo.ServiceImpl.PartidoServiceImpl;
import com.superLiga.modelo.ServiceImpl.ProfesorServiceImpl;
import com.superLiga.vista.LogicaInputOutput;


/**
 * @author Hugo Grimanis
 *
 */
public class LigaControlador {
	static Scanner scanner = new Scanner(System.in);
	
	
	
		public void msotrarMenu() {
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
				            System.out.println("Opcion invalida. Debe seleccionar alguna de las opciones validas");
				            System.out.println("Por favor, intente de nuevo \n");
				            break;
				    }
		        } while  (!salir);

		    	scanner.close();
		        System.out.println(" Ha salido del programa");
		}
		
	    public static int mostrarSubMenu(Scanner scanner, String opcionMenu){
	        String opcion;
	        System.out.println("\n\033[1m" + "Sub Menu " + opcionMenu + " " + "\033[0m\n" +
	                "1: Agregar " + opcionMenu + " : \n" +
	                "2: Editar  " + opcionMenu + " : \n" +
	                "3: Eliminar " + opcionMenu + " : \n" +
	                "4: Consultar " + opcionMenu + " : \n" +
	                "5: Volver al menú principal \n");

	        System.out.print("\033[1m" + "> " + "\033[0m");
	        opcion = scanner.nextLine();
	        return ( isNumerico(opcion) ? Integer.parseInt(opcion) : -1);  
	    }
	    
	    private static JugadorServiceImpl crearJugadorService() {
	        return new JugadorServiceImpl();
	    }
	    
	    private static CategoriaServiceimpl crearCategoriaService() {
	    	return new CategoriaServiceimpl();
	    }
	    
	    private static EquipoServiceImpl crearEquipoService() {
	    	return new EquipoServiceImpl();
	    }
	    
	    private static ProfesorServiceImpl crearProfesorService() {
	    	return new ProfesorServiceImpl();
	    }
	    
	    private static CoordinadorServiceImpl crearCoordinadorService() {
	    	return new CoordinadorServiceImpl();
	    }
	    
	    private static PartidoServiceImpl crearPartidoService() {
	    	return new PartidoServiceImpl();
	    }
	    
	    private static FixtureServiceImpl crearFixtutureService() {
	    	return new FixtureServiceImpl();
	    }

	    private static LigaServiceImpl crearLigaService() {
	    	return new LigaServiceImpl();
	    }
	     
	    /**
		 * @param opcion
		 * @return
		 */
		private static boolean isNumerico(String opcion) {
			return opcion != null && opcion.matches("[0-9.]+");
		}

		public static void subMenu(Scanner scanner, String opcionMenu) {

	        int opcion;
	        
	    	if(opcionMenu.equals("Jugador")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            JugadorServiceImpl jugadorServiceImpl = crearJugadorService();
		            EquipoServiceImpl equipoServiceImple = crearEquipoService();
		            switch (opcion) {
		                case 1:
		                	// Lógica para agregar jugador
		                    System.out.println("Agregar Jugador");
		            		Jugador jugador = LogicaInputOutput.obtenerDatosJugador();
		                    jugadorServiceImpl.agregar(jugador);
		                    System.out.println("El jugador " + jugador.getApellidoNombre()  + " ha sido agregado al Club");
		                    break;
		                case 2:
		        	        System.out.print("Ingrese el DNI del jugador para asignarle un Equipo: ");
		        	        int dni = scanner.nextInt();
		        	        
		        	        if (scanner.hasNextLine()) {
		        	            scanner.nextLine();
		        	        }
		        	        
		        	        if(!jugadorServiceImpl.consultarJugadorPorDni(dni)) {
		        	        	System.out.println("El jugador no existe en la base de datos del sistema");
		        	        	break;
		        	        }else {
		        	        	int categoriaJugador = jugadorServiceImpl.consultarCategoriaJugadorPorDni(dni);
		        	        	
		        	        	List<Equipo> equipos = equipoServiceImple.consultarEquipoPorCategoria(categoriaJugador);
		        	        	
		        	        	if(equipos.isEmpty()) {
		        	        		System.out.println("No existen Equipos para la categoria: " + categoriaJugador);
		        	        		System.out.println("Primero Debe agregar Equipos (en el menu de Equipos) para luego poder asignarle Equipo al Jugador");
		        	        		break;
		        	        	}else {		        	        		
		        	        		System.out.println("Los Equipos que pertenecen a la misma categoria (" + categoriaJugador + ") del jugador son los siguientes: ");
		        	        		
		        	        		// Imprimimos los resultados
		        	        		for (Equipo equipo : equipos) {
		        	        			System.out.println(equipo.getNombreEquipo());
		        	        		}
		        	        		
		        	    	        if (scanner.hasNextLine()) {
		        	    	            scanner.nextLine();
		        	    	        }
		        	        		
		        	        		System.out.print("Ingrese el Equipo al cual asignar el Jugador: ");
		        	        		String equipoAsignado =scanner.nextLine().toLowerCase();
		        	        		
		        	        		System.out.print("Ingrese el Numero de Camiseta del Jugador: ");
		        	        		int nroCamiseta = scanner.nextInt();
		        	        		
		        	        		if (scanner.hasNextLine()) {
		        	        			scanner.nextLine();
		        	        		}
		        	        		
		        	        		if(jugadorServiceImpl.editar(dni,equipoAsignado,nroCamiseta)) {
		        	        			System.out.println("El jugador se ha asignado al Equipo con los datos brindados");
		        	        		}		        		        
		        	        	}		        	        	
		        	        }        	        	
		                    
		                    break;
		                case 3:
		                    System.out.println("Eliminar Jugador");
		                    System.out.print("Ingrese el DNI del jugador para eliminar: ");
		        	        int dniEliminar = scanner.nextInt();
		        	        
		        	        if (scanner.hasNextLine()) {
		        	            scanner.nextLine();
		        	        }
		        	        
		        	        if(!jugadorServiceImpl.consultarJugadorPorDni(dniEliminar)) {
		        	        	System.out.println("El jugador no existe en la base de datos del sistema");
		        	        	break;
		        	        }else {
		        	        	
		        	        	if(jugadorServiceImpl.eliminarPorDNI(dniEliminar)) {
		        	        		System.out.println("El jugador ha sido eliminado");
		        	        	}
		        	        }
	        		        
		                    break;
		                case 4:
		                    System.out.println("Consultar Jugador");
							
							  System.out.print("Ingrese el DNI del jugador para consultar sus datos: "); 
							  int dniConsulta = scanner.nextInt();
							  
		        		        if (scanner.hasNextLine()) {
		        		        	scanner.nextLine();
		        		        }
							  
							  if(!jugadorServiceImpl.consultarJugadorPorDni(dniConsulta)) {
								  System.out.println("El jugador no existe en la base de datos del sistema");
								  break;
							  }else {
								  
								  Jugador jugadorConsulta = jugadorServiceImpl.consultarFullJugador(dniConsulta);
								  
								  if (jugadorConsulta != null) {
									  System.out.println("Jugador encontrado: ");
									  System.out.println("Nombre: " + jugadorConsulta.getApellidoNombre());
									  System.out.println("Fecha de nacimiento: " + jugadorConsulta.getFechaNacimiento());
									  System.out.println("Sexo: " + jugadorConsulta.getSexo());
									  System.out.println("Edad: " + jugadorConsulta.getEdad());
									  System.out.println("Dirección: " + jugadorConsulta.getDomicilio());
									  System.out.println("Provincia: " + jugadorConsulta.getProvincia());
									  System.out.println("Código Postal: " + jugadorConsulta.getCodigoPostal());
									  System.out.println("Email: " + jugadorConsulta.getEmail());
									  System.out.println("Teléfono: " + jugadorConsulta.getTelefono());
									  System.out.println("Hincha del club: " + jugadorConsulta.getHinchaClub());
									  System.out.println("Categoría del jugador: " + jugadorConsulta.getCategoria());
									  System.out.println("Equipo asignado: " + jugadorConsulta.getEquipoAsignado());
									  System.out.println("Número de camiseta: " + jugadorConsulta.getNroCamiseta());
								  } else {
									  System.out.println("Jugador no encontrado.");
								  }
							  }						  
							 		                    
		                    break;
		                case 5:
		                    System.out.println("Volviendo al menú principal... \n \n");
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	//System.out.println("Volviendo al menú principal... \n");
	    	else if(opcionMenu.equals("Equipo")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            EquipoServiceImpl equipoServiceImpl = crearEquipoService();
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar Equipo");
		                    Equipo equipoNuevo = LogicaInputOutput.obtenerDatosEquipo();
		                    equipoServiceImpl.agregar(equipoNuevo);
		                    System.out.println("El Equipo " + equipoNuevo.getNombreEquipo()  + " ha sido agregado al Club");
		                    break;
		                case 2:
		        			System.out.print("Ingrese el nombre del Equipo a actualizar resultados de Partido: ");
		        			
		        			String nombreEquipo = scanner.nextLine().toLowerCase();
		        			
		        			if(!equipoServiceImpl.consultarEquipoPorNombre(nombreEquipo)) {
		        				System.out.println("El Equipo no existe en la base de datos del sistema");
		        				break;
		        			}else {

		        					System.out.print("Ingrese la cantidad de partidos Ganados: ");
		        					int cantidadPartidosGanados = scanner.nextInt();
		        					
		        					if (scanner.hasNextLine()) {
		        						scanner.nextLine();
		        					}
		        					
		        					System.out.print("Ingrese la cantidad de partidos Empatados: ");
		        					int cantidadPartidosEmpatados = scanner.nextInt();
		        					
		        					if (scanner.hasNextLine()) {
		        						scanner.nextLine();
		        					}
		        					
		        					System.out.print("Ingrese la cantidad de partidos Perdidos: ");
		        					int cantidadPartidosPerdidos = scanner.nextInt();
		        					
		        					if (scanner.hasNextLine()) {
		        						scanner.nextLine();
		        					}
		        					
		        					System.out.print("Ingrese la cantidad de goles a Favor: ");
		        					int cantidadGolesAFavor = scanner.nextInt();
		        					
		        					if (scanner.hasNextLine()) {
		        						scanner.nextLine();
		        					}
		        					
		        					System.out.print("Ingrese la cantidad de goles en Contra: ");
		        					int cantidadGolesenContra = scanner.nextInt();
		        					
		        					if (scanner.hasNextLine()) {
		        						scanner.nextLine();
		        					}
		        					
		        					System.out.print("Ingrese la diferencia de Gol: ");
		        					int diferenciadeGol  = scanner.nextInt();
		        									
		        					if (scanner.hasNextLine()) {
		        						scanner.nextLine();
		        					}
		        					
		        					if(equipoServiceImpl.actualizarResultadosEquipo(cantidadPartidosGanados, cantidadPartidosEmpatados, cantidadPartidosPerdidos, cantidadGolesAFavor, cantidadGolesenContra, diferenciadeGol, nombreEquipo)) {
			        		        	System.out.println("El Equipo se ha actualizado con los datos brindados");
			        		        }
		        		    }
		                    break;
		                case 3:
		                    System.out.println("Eliminar Equipo");
		                    System.out.print("Ingrese el nombre del Equipo para eliminar: ");
		        	        String nombreEquipoEliminar = scanner.nextLine().toLowerCase();
	        		        
		        	        if(equipoServiceImpl.eliminarEquipoPorNombre(nombreEquipoEliminar)) {
		        	        	System.out.println("El equipo ha sido eliminado");
		        	        }else {
		        	        	System.out.println("El nombre de Equipo " + nombreEquipoEliminar+ " no existe en el sistema");
		        	        }
		                    break;
		                case 4:
		                	System.out.println("Consultar Equipo");
							
							  System.out.print("Ingrese el nombre del Equipo para consultar: ");
							  String nombreEquipoBuscar = scanner.nextLine().toLowerCase();
							  
							  if(!equipoServiceImpl.consultarEquipoPorNombre(nombreEquipoBuscar)) {
								  System.out.println("El equipo no existe en la base de datos del sistema");
								  break;
							  }else {
								  
								  Equipo equipoConsulta = equipoServiceImpl.consultarFulEquipo(nombreEquipoBuscar);
								  
								  if (equipoConsulta != null) {
									  System.out.println("Equipo encontrado: ");
									  System.out.println(equipoConsulta); 
								  }
							  }					  
		                    
		                    break;
		                case 5:
		                    System.out.println("Volviendo al menú principal... \n");
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Partido")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            
		            PartidoServiceImpl partidoServiceImpl = crearPartidoService();
		            EquipoServiceImpl equipoServiceImple = crearEquipoService();
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar Partido");
		                    
		                    System.out.print("Ingrese la categoría: ");
		        	        int categoriaAgregar = scanner.nextInt();
		        	        
		        	        if (scanner.hasNextLine()) {
	        		            scanner.nextLine();
	        		        }
		                	
		                	List<Equipo> equipos = equipoServiceImple.consultarEquipoPorCategoria(categoriaAgregar);		        	        	

		                	if(equipos.isEmpty()) {
	        	        		System.out.println("No existen Equipos para la categoria: " + categoriaAgregar);
	        	        		System.out.println("Primero Debe agregar Equipos (en el menu correspondiente) para luego poder continuar");

	        	        		break;
	        	        	}else {
	        	        		
	        	        		if(equipos.size() < 2) {
	        	        			System.out.println("En la categoria no hay cargados mas de dos equipos");
	        	        			System.out.println("Por lo tanto no se puede cargar un Partido");
	        	        			System.out.println("Debe agregar mas equipos para poder armar un partido");
	        	        			break;
	        	        		}else {
	        	        			
	        	        			System.out.println("Los Equipos que pertenecen a la misma categoria (" + categoriaAgregar + ") del jugador son los siguientes: ");
	        	        			
	        	        			// Imprimimos los resultados
	        	        			for (Equipo equipo : equipos) {
	        	        				System.out.println(equipo.getNombreEquipo());
	        	        			}	        	        			
	        	        			
	        	        			System.out.println("Ingrese el nombre del Equipo Local segun la lista brindada anteriormente: ");
	        	        			String nombreEquipoLocal = scanner.nextLine().toLowerCase();
	        	        			
	        	        			
	        	        			System.out.println("Ingrese el nombre del Equipo Visitante segun la lista brindada anteriormente: ");
	        	        			String nombreEquipoVisitante = scanner.nextLine().toLowerCase();
	        	        			
	        	        			Partido partidoNuevo = new Partido(nombreEquipoLocal, nombreEquipoVisitante,categoriaAgregar);
	        	        			partidoServiceImpl.agregar(partidoNuevo);
	        	        			System.out.println("El Partido ha sido agregado al Club");
	        	        			break;
	        	        		}	        	        		
	        	        	}	                    
		                    
		                case 2:	                    
		        	        System.out.println("Opcion para actualizar resultado de un Partido");
		        	        
		        	        System.out.println("Ingrese la categoría: ");
		        	        int categoria = scanner.nextInt();
		        	        
        					if (scanner.hasNextLine()) {
        						scanner.nextLine();
        					}
        					
        					if(!partidoServiceImpl.consultarPartidoPorCategoria(categoria)) {
        						System.out.println("No existen cargados Partidos para la Categoria");
        						System.out.println("Debe cargar un partido en el punto de menu correspondiente");
        						break;
        					}else {
        						
        						System.out.println("Ingrese la fecha del partido (yyyy-mm-dd): ");
        						Date fechaPartido = LogicaInputOutput.parseDate(scanner.nextLine());
        						
        						System.out.println("Ingrese la hora del partido: ");
        						int horaPartido = scanner.nextInt();
        						
        						if (scanner.hasNextLine()) {
        							scanner.nextLine();
        						}        					
        							
    							System.out.println("Ingrese la cantidad de goles del equipo local: ");
    							int cantidadGolesEquipoLocal = scanner.nextInt();
    							
    							if (scanner.hasNextLine()) {
    								scanner.nextLine();
    							}
    							
    							System.out.println("Ingrese la cantidad de goles del equipo visitante: ");
    							int cantidadGolesEquipoVisitante = scanner.nextInt();
    							
    							if (scanner.hasNextLine()) {
    								scanner.nextLine();
    							}
    							
    							System.out.println("Ingrese el Equipo Ganador del Partido: ");
    							String equipoGanadorPartido = scanner.nextLine().toLowerCase();
    							
    							if(partidoServiceImpl.actualizarResultadoPartido(cantidadGolesEquipoLocal, cantidadGolesEquipoVisitante, equipoGanadorPartido, categoria, fechaPartido, horaPartido)) {
    								System.out.println("El Partido se ha actualizado con los datos brindados");
    							}
        						
        					}
        					
		                    break;
		                case 3:
		                    System.out.println("No se puede Eliminar un partido");
		                    // Lógica para eliminar equipo
		                    break;
		                case 4:
		                    System.out.println("Consultar partido");

		                    System.out.println("Ingrese la categoría: ");
		        	        int categoriaConsulta = scanner.nextInt();
		        	        
        					if (scanner.hasNextLine()) {
        						scanner.nextLine();
        					}
        					
        					if(!partidoServiceImpl.consultarPartidoPorCategoria(categoriaConsulta)) {
        						System.out.println("No existen cargados Partidos para la Categoria");
        						System.out.println("Debe cargar un partido en el punto de menu correspondiente");
        						break;
        					}else {
        						List<Partido> partidos = partidoServiceImpl.consultarPartidosPorCategoria(categoriaConsulta);
        						
        						if(partidos.isEmpty()) {
        							System.out.println("No existen partidos agendados para la categoria: " + categoriaConsulta);
        							break;
        						}
        						else {
        							// Imprimimos los resultados
        							for (Partido partido : partidos) {
        								System.out.println(partido);  // Esto usa el método toString() de la clase Partido
        							}		        	        	
        						}        						
        					}
        					
		                    break;
		                case 5:
		                    System.out.println("Volviendo al menú principal... \n");
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Categoria")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            CategoriaServiceimpl categoriaServiceImpl = crearCategoriaService();
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar Categoria");
		            		Categoria categoria = LogicaInputOutput.obtenerDatosCategoria();
		                    categoriaServiceImpl.agregar(categoria);
		                    System.out.println("La Categoria ha sido agregada al sistema");
		                    break;
		                case 2:
		                    System.out.println("No esta permitido Editar una Categoria");
		                    // Lógica para editar categoría
		                    break;
		                case 3:
		                    System.out.println("Eliminar Categoria");
		                    System.out.print("Ingrese el año de la categoría a Eliminar: ");
		        	        int anioCategoria = scanner.nextInt();
		        	        
		        	        if (scanner.hasNextLine()) {
		        	            scanner.nextLine();
		        	        }
	        		        
		        	        if(categoriaServiceImpl.eliminarPorCategoria(anioCategoria)) {
		        	        	System.out.println("La Categoria ha sido eliminado");
		        	        }else {
		        	        	System.out.println("No existe la Categoria en el sistema");
		        	        }
		                    break;
		                case 4:
		                    System.out.print("Ingrese el año de la categoría a buscar: ");
		        	        int anioCategoriaBuscar = scanner.nextInt();
		        	        
		        	        if (scanner.hasNextLine()) {
		        	            scanner.nextLine();
		        	        }
	        		        
		        	        if(categoriaServiceImpl.consultarExisteCategoria(anioCategoriaBuscar)) {
		        	        	System.out.println("Existe la Categoria");
		        	        	break;
		        	        }else {
		        	        	System.out.println("Debe crear la categoria " + anioCategoriaBuscar + " si desea agregarla al sistema");
		        	        }
		                    break;
		                case 5:
		                    System.out.println("Volviendo al menú principal... \n");
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Liga")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            LigaServiceImpl ligaServiceImpl = crearLigaService();
		            EquipoServiceImpl equipoServiceImpl = crearEquipoService();
		            switch (opcion) {
		                case 1:
		                    System.out.println("Agregar LIGA");
		            		Liga ligaNueva = LogicaInputOutput.obtenerDatosLiga();
		                    ligaServiceImpl.agregar(ligaNueva);
		                    System.out.println("La Liga ha sido agregado al Club");
		                    break;
		                case 2:		        			
		        			System.out.print("Ingrese la categoria: ");
        					int categoriaLiga = scanner.nextInt();
        					
        					if (scanner.hasNextLine()) {
		        	            scanner.nextLine();
		        	        }
		        			
		        			if(!ligaServiceImpl.consultarLiga(categoriaLiga)) {
		        				System.out.println("La Liga no existe en la base de datos del sistema");
		        				break;
		        			}else {

		        				
		        				List<Equipo> equipos = equipoServiceImpl.consultarEquipoPorCategoria(categoriaLiga);		        	        	

			                	if(equipos.isEmpty()) {
		        	        		System.out.println("No existen Equipos para la categoria: " + categoriaLiga);
		        	        		System.out.println("Primero Debe agregar Equipos (en el menu correspondiente) para luego poder continuar");

		        	        		break;
		        	        	}else {
		        	        		System.out.println("Los Equipos que pertenecen a la misma categoria (" + categoriaLiga + ") del jugador son los siguientes: ");
	        	        			
	        	        			// Imprimimos los resultados
	        	        			for (Equipo equipo : equipos) {
	        	        				System.out.println(equipo.getNombreEquipo());
	        	        			}	        	        			
	        	        			
	        	        			System.out.println("Ingrese el nombre del Equipo segun la lista brindada anteriormente: ");
	        	        			String nombreEquipoLiga = scanner.nextLine().toLowerCase();
       	        			
	        	        			System.out.print("Ingrese el Nro de Fecha: ");
	        	        			int nroFechaLiga = scanner.nextInt();
	        	        			
	        	        			if (scanner.hasNextLine()) {
	        	        				scanner.nextLine();
	        	        			}
	        	        			
	        	        			System.out.print("Ingrese la posicion del Equipo: ");
	        	        			int posicionLiga = scanner.nextInt(); 			
	        	        			
	        	        			if (scanner.hasNextLine()) {
	        	        				scanner.nextLine();
	        	        			}
	        	        			
	        	        			if(ligaServiceImpl.actualizarDatosLiga(posicionLiga,nroFechaLiga, categoriaLiga, nombreEquipoLiga)) {
	        	        				System.out.println("Se ha actualiado la Liga con los datos brindados");
	        	        				break;
	        	        			}else {
	        	        				System.out.println("Error");
	        	        			}
		        	        	}
		        		    }
		                    break;
		                case 3:
		                	System.out.print("Ingrese la categoria: ");
      					    int categoriaBorrar = scanner.nextInt();
      					    
        					if (scanner.hasNextLine()) {
        						scanner.nextLine();
        					}
	        		        
		        	        if(ligaServiceImpl.eliminarLiga(categoriaBorrar)) {
		        	        	System.out.println("La Liga ha sido eliminada");
		        	        }else {
		        	        	System.out.println("No existe la Liga en el sistema");
		        	        }
		                    break;
		                case 4:
		                    System.out.println("Consultar LIGA");
		        			
							System.out.print("Ingrese la categoria: ");
      					    int categoriaConsulta = scanner.nextInt();
      					    
        					if (scanner.hasNextLine()) {
        						scanner.nextLine();
        					}
							  
							if(!ligaServiceImpl.consultarLiga(categoriaConsulta)) {
		        				System.out.println("La Liga no existe en la base de datos del sistema");
		        				break;
		        			}else {
							  
							  Liga ligaConsulta = ligaServiceImpl.consultarFullLiga(categoriaConsulta);
							  
							  if (ligaConsulta != null) {
							        System.out.println("Liga encontrada: ");
							        System.out.println("Nombre Liga: " + ligaConsulta.getNombreLiga());
							        System.out.println("Nro Fecha Liga: " + ligaConsulta.getNroFechaLiga());
							        System.out.println("Categoria Liga: " + ligaConsulta.getCategoriaLiga());
							        System.out.println("Equipo: " + ligaConsulta.getEquipos());
							        System.out.println("Posicion Equipo: " + ligaConsulta.getPosicionEquipo());
							       
							    } else {
							        System.out.println("Liga no encontrada.");
							    }
							}
		                    break;
		                case 5:
		                    System.out.println("Volviendo al menú principal... \n");
		                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Fixture")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            FixtureServiceImpl fixtureServiceImpl = crearFixtutureService();
		            EquipoServiceImpl equipoServiceImple = crearEquipoService();
		            switch (opcion) {
			                case 1:
			                	
			        	        System.out.print("Ingrese la categoría: ");
			        	        int categoria = scanner.nextInt();
			        	        
			        	        if (scanner.hasNextLine()) {
		        		            scanner.nextLine();
		        		        }
			                	
			                	List<Equipo> equipos = equipoServiceImple.consultarEquipoPorCategoria(categoria);		        	        	

			                	if(equipos.isEmpty()) {
		        	        		System.out.println("No existen Equipos para la categoria: " + categoria);
		        	        		System.out.println("Primero Debe agregar Equipos (en el menu correspondiente) para luego poder continuar");

		        	        		break;
		        	        	}else {
		        	        		
		        	        		System.out.println("Los Equipos que pertenecen a la misma categoria (" + categoria + ") del jugador son los siguientes: ");
		        	        		
		        	        		// Imprimimos los resultados
		        	        		for (Equipo equipo : equipos) {
		        	        			System.out.println(equipo.getNombreEquipo());
		        	        		}	                	
		        	        		
		        	        		
		        	        		System.out.println("Ingrese el nombre del Equipo segun la lista brindada anteriormente: ");
		        	        		String nombreEquipo = scanner.nextLine().toLowerCase();
		        	        		
		        	        		System.out.println("Ingrese la cantidad de Puntos del Equipo: ");
		        	        		int cantidadPuntosEquipo = scanner.nextInt();
		        	        		
		        	        		if (scanner.hasNextLine()) {
		        	        			scanner.nextLine();
		        	        		}
		        	        		
		        	        		Fixture fixtureNuevo = new Fixture(nombreEquipo, cantidadPuntosEquipo);
		        	        		fixtureServiceImpl.agregar(fixtureNuevo);
		        	        		System.out.println("El Fixture ha sido agregado al Club");
		        	        	}
			                	
			                    break;
			                case 2:
			                    System.out.println("Editar Fixture");
			                    System.out.print("Ingrese la categoría: ");
			        	        int categoriaActualiza = scanner.nextInt();
			        	        
			        	        if (scanner.hasNextLine()) {
		        		            scanner.nextLine();
		        		        }
			                	
			                	List<Equipo> equiposList = equipoServiceImple.consultarEquipoPorCategoria(categoriaActualiza);		        	        	
		        	        	
			                	if(equiposList.isEmpty()) {
		        	        		System.out.println("No existen Equipos para la categoria: " + categoriaActualiza);
		        	        		System.out.println("Primero Debe agregar Equipos (en el menu correspondiente) para luego poder continuar");

		        	        		break;
		        	        	}else {
		        	        		
		        	        		System.out.println("Los Equipos que pertenecen a la misma categoria (" + categoriaActualiza + ") del jugador son los siguientes: ");
		        	        		
		        	        		// Imprimimos los resultados
		        	        		for (Equipo equipo : equiposList) {
		        	        			System.out.println(equipo.getNombreEquipo());
		        	        		}			                	
		        	        		
		        	        		System.out.println("Ingrese el nombre del Equipo a actualizar posicion segun la lista brindada anteriormente: ");
		        	        		String nombreEquipoActualizar = scanner.nextLine().toLowerCase();
		        	        		
		        	        		if(!fixtureServiceImpl.consultarEquipo(nombreEquipoActualizar)) {
		        	        			System.out.println("El Equipo no existe en la base de datos del sistema");
		        	        			break;
		        	        		}else {
		        	        			System.out.println("Ingrese la cantidad de Puntos del Equipo: ");
		        	        			int cantidadPuntosActualizarEquipo = scanner.nextInt();
		        	        			
					        	        if (scanner.hasNextLine()) {
				        		            scanner.nextLine();
				        		        }
		        	        			
		        	        			if(fixtureServiceImpl.actualizarCantidadPuntosPorEquipo(cantidadPuntosActualizarEquipo, nombreEquipoActualizar)) {
		        	        				System.out.println("El Equipo ha actualizado su cantidad de Puntos con los datos brindados");
		        	        			}	
		        	        		}
		        	        	}
			                	
			                    break;
			                case 3:
			                    System.out.println("No se puede Eliminar un Fixture");
			                    break;
			                case 4:
			                    System.out.println("Consultar Fixture");
			                    System.out.print("Ingrese la categoría: ");
			        	        int categoriaConsulta = scanner.nextInt();
			        	        
			        	        if (scanner.hasNextLine()) {
		        		            scanner.nextLine();
		        		        }
			                	
			                	List<Equipo> equiposListConsulta = equipoServiceImple.consultarEquipoPorCategoria(categoriaConsulta);		     
			                	
			                	if(equiposListConsulta.isEmpty()) {
		        	        		System.out.println("No existen Equipos para la categoria: " + categoriaConsulta);
		        	        		System.out.println("Primero Debe agregar Equipos (en el menu correspondiente) para luego poder continuar");

		        	        		break;
		        	        	}else {
		        	        		
		        	        		System.out.println("Los Equipos que pertenecen a la misma categoria (" + categoriaConsulta + ") del jugador son los siguientes: ");
		        	        		
		        	        		// Imprimimos los resultados
		        	        		for (Equipo equipo : equiposListConsulta) {
		        	        			System.out.println(equipo.getNombreEquipo());
		        	        		}			                	
      	        		
	        	        		
		        	        		System.out.println("Ingrese el nombre del Equipo segun la lista brindada anteriormente: ");
		        	        		String nombreEquipoConsulta = scanner.nextLine().toLowerCase();
		        	        		
		        	        		Fixture fixtureConsulta = fixtureServiceImpl.consultarFixture(nombreEquipoConsulta);
		        	        		
		        	        		if (fixtureConsulta != null) {
		        	        			System.out.println("Equipo encontrado: ");
		        	        			System.out.println("Nombre Equipo: " + nombreEquipoConsulta);
		        	        			System.out.println("Cantidad Puntos Equipo: " + fixtureConsulta.getCantidadPuntosEquipo());
		        	        			
		        	        		} else {
		        	        			System.out.println("Equipo no encontrada.");
		        	        		}
		        	        	}
		        	        	
			                    break;
			                case 5:
			                    System.out.println("Volviendo al menú principal... \n");
			                    break;
		                default:
		                    System.out.println("Opción inválida. Intente de nuevo.");
		            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Profesor")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            ProfesorServiceImpl profesorServiceImpl = crearProfesorService();
		            EquipoServiceImpl equipoServiceImpl = crearEquipoService();
		            switch (opcion) {
	                case 1:
	                	// Lógica para agregar profesor
	                    System.out.println("Agregar Profesor");
	            		Profesor profesor = LogicaInputOutput.obtenerDatosProfesor();
	                    profesorServiceImpl.agregar(profesor);
	                    System.out.println("El profesor " + profesor.getApellidoNombre()  + " ha sido agregado al Club");
	                    break;
	                case 2:
	        	        System.out.print("Ingrese el DNI del profesor para asignarle un Equipo: ");
	        	        int dni = scanner.nextInt();
	        	        
	        	        if (scanner.hasNextLine()) {
	        	            scanner.nextLine();
	        	        }
	        	        
	        	        if(!profesorServiceImpl.consultarProfesorPorDni(dni)) {
	        	        	System.out.println("El profesor no existe en la base de datos del sistema");
	        	        	break;
	        	        }else {
	        	        	int categoriaProfesor = profesorServiceImpl.consultarCategoriaProfesorPorDni(dni);
	        	        	
	        	        	List<Equipo> equipos = equipoServiceImpl.consultarEquipoPorCategoria(categoriaProfesor);		        	        	
	        	        	
	        	        	if(equipos.isEmpty()) {
	        	        		System.out.println("No existen Equipos para la categoria: " + categoriaProfesor);
	        	        		System.out.println("Primero Debe agregar Equipos (en el menu correspondiente) para luego poder continuar");

	        	        		break;
	        	        	}else {
	        	        		
	        	        		System.out.println("Los Equipos que pertenecen a la misma categoria (" + categoriaProfesor + ") del profesor son los siguientes: ");
	        	        		
	        	        		// Imprimimos los resultados
	        	        		for (Equipo equipo : equipos) {
	        	        			System.out.println(equipo.getNombreEquipo());
	        	        		}
	        	        		
	        	        		System.out.print("Ingrese el Equipo al cual asignar el Profesor: ");
	        	        		String equipoAsignado =scanner.nextLine().toLowerCase();
	        	        		
	        	        		if(profesorServiceImpl.editar(dni,equipoAsignado,categoriaProfesor)) {
	        	        			System.out.println("El profesor se ha asignado al Equipo con los datos brindados");
	        	        		}else {
	        	        			System.out.println("No se ha podido asignar al Profesor");
	        	        		}
	        	        	}
	        	        }        	        	
	                    
	                    break;
	                case 3:
	                    System.out.println("Eliminar Profesor");
	                    System.out.print("Ingrese el DNI del profesor para eliminar: ");
	        	        int dniEliminar = scanner.nextInt();
	        	        
	        	        if (scanner.hasNextLine()) {
	        	            scanner.nextLine();
	        	        }
	        	        
	        	        if(!profesorServiceImpl.consultarProfesorPorDni(dniEliminar)) {
	        	        	System.out.println("El Profesor no existe en la base de datos del sistema");
	        	        	break;
	        	        }else {
	        	        	
	        	        	if(profesorServiceImpl.eliminarPorDNI(dniEliminar)) {
	        	        		System.out.println("El profesor ha sido eliminado");
	        	        	}
	        	        }
        		        
	                    break;
	                case 4:
	                    System.out.println("Consultar Profesor");
						
						  System.out.print("Ingrese el DNI del profesor para consultar sus datos: "); 
						  int dniConsulta = scanner.nextInt();
						  
		        	        if (scanner.hasNextLine()) {
		        	            scanner.nextLine();
		        	        }
						  
						  if(!profesorServiceImpl.consultarProfesorPorDni(dniConsulta)) {
							  System.out.println("El profesor no existe en la base de datos del sistema");
							  break;
						  }else {
							  
							  Profesor profesorConsulta = profesorServiceImpl.consultarFullProfesor(dniConsulta);
							  
							  if (profesorConsulta != null) {
								  System.out.println("Profesor encontrado: ");
								  System.out.println("Nombre: " + profesorConsulta.getApellidoNombre());
								  System.out.println("Fecha de nacimiento: " + profesorConsulta.getFechaNacimiento());
								  System.out.println("Sexo: " + profesorConsulta.getSexo());
								  System.out.println("Edad: " + profesorConsulta.getEdad());
								  System.out.println("Dirección: " + profesorConsulta.getDomicilio());
								  System.out.println("Provincia: " + profesorConsulta.getProvincia());
								  System.out.println("Código Postal: " + profesorConsulta.getCodigoPostal());
								  System.out.println("Email: " + profesorConsulta.getEmail());
								  System.out.println("Teléfono: " + profesorConsulta.getTelefono());
								  System.out.println("Hincha del club: " + profesorConsulta.getHinchaClub());
								  System.out.println("Categoría del profesor: " + profesorConsulta.getCategoriaDirigida());
								  System.out.println("Equipo asignado: " + profesorConsulta.getEquipoAsignado());
								  System.out.println("DirectorTecnicoFavorito: " + profesorConsulta.getDirectorTecnicoFavorito());
							  } else {
								  System.out.println("Profesor no encontrado.");
							  }
						  }		                    
	                    break;
	                case 5:
	                    System.out.println("Volviendo al menú principal... \n \n");
	                    break;
	                default:
	                    System.out.println("Opción inválida. Intente de nuevo.");
	            }
		        } while(opcion != 5);
			}
	    	else if(opcionMenu.equals("Coordinador")) {
		        do {
		            opcion = mostrarSubMenu(scanner,opcionMenu);
		            CoordinadorServiceImpl coordinadorServiceImpl = crearCoordinadorService();
		            switch (opcion) {
	                case 1:
	                	// Lógica para agregar coordinador
	                    System.out.println("Agregar Coordinador");
	            		Coordinador coordinador = LogicaInputOutput.obtenerDatosCoordinador();
	                    coordinadorServiceImpl.agregar(coordinador);
	                    System.out.println("El coordinador " + coordinador.getApellidoNombre()  + " ha sido agregado al Club");
	                    break;
	                case 2:
	        	        System.out.print("Ingrese el DNI del coordinador para actualizar: ");
	        	        int dni = scanner.nextInt();
	        	        
	        	        if (scanner.hasNextLine()) {
	        	            scanner.nextLine();
	        	        }
	        	        
	        	        if(!coordinadorServiceImpl.consultarCoordinadorPorDni(dni)) {
	        	        	System.out.println("El coordinador no existe en la base de datos del sistema");
	        	        	break;
	        	        }else {
	        	        	
	        		        System.out.print("Ingrese la cantidad de Profesores a cargo del Coordinador: ");
	        		        int cantidadProfesores = scanner.nextInt();
	        		        
	        		        if (scanner.hasNextLine()) {
	        		        	scanner.nextLine();
	        		        }
	        		        
	        		        if(coordinadorServiceImpl.editar(dni,cantidadProfesores)) {
	        		        	System.out.println("Se ha actualizado al Coordinador con los datos brindados");
	        		        }		        		        
	        	        }        	        	
	                    
	                    break;
	                case 3:
	                    System.out.println("Eliminar Coordinador");
	                    System.out.print("Ingrese el DNI del coordinador para eliminar: ");
	        	        int dniEliminar = scanner.nextInt();
	        	        
	        	        if (scanner.hasNextLine()) {
	        	            scanner.nextLine();
	        	        }
	        	        
	        	        if(!coordinadorServiceImpl.consultarCoordinadorPorDni(dniEliminar)) {
	        	        	System.out.println("El Coordinador no existe en la base de datos del sistema");
	        	        	break;
	        	        }else {
	        	        	if(coordinadorServiceImpl.eliminarPorDNI(dniEliminar)) {
	        	        		System.out.println("El coordinador ha sido eliminado");
	        	        	}
	        	        	
	        	        }
	                    break;
	                case 4:
	                    System.out.println("Consultar Coordinador");
						
						  System.out.print("Ingrese el DNI del coordinador para consultar sus datos: "); 
						  int dniConsulta = scanner.nextInt();
						  
		        	        if (scanner.hasNextLine()) {
		        	            scanner.nextLine();
		        	        }
						  
						  if(!coordinadorServiceImpl.consultarCoordinadorPorDni(dniConsulta)) {
							  System.out.println("El coordinador no existe en la base de datos del sistema");
							  break;
						  }else {
							  
							  Coordinador coordinadorConsulta = coordinadorServiceImpl.consultarFullCoordinador(dniConsulta);
							  
							  if (coordinadorConsulta != null) {
								  System.out.println("Coordinador encontrado: ");
								  System.out.println("Nombre: " + coordinadorConsulta.getApellidoNombre());
								  System.out.println("Fecha de nacimiento: " + coordinadorConsulta.getFechaNacimiento());
								  System.out.println("Sexo: " + coordinadorConsulta.getSexo());
								  System.out.println("Edad: " + coordinadorConsulta.getEdad());
								  System.out.println("Dirección: " + coordinadorConsulta.getDomicilio());
								  System.out.println("Provincia: " + coordinadorConsulta.getProvincia());
								  System.out.println("Código Postal: " + coordinadorConsulta.getCodigoPostal());
								  System.out.println("Email: " + coordinadorConsulta.getEmail());
								  System.out.println("Teléfono: " + coordinadorConsulta.getTelefono());
								  System.out.println("Hincha del club: " + coordinadorConsulta.getHinchaClub());
								  System.out.println("Director Tecnico Favorito: " + coordinadorConsulta.getDirectorTecnicoFavorito());
								  System.out.println("Cantidad de Profesores A Cargo: " + coordinadorConsulta.getCantidadProfesoresACargo());
							  } else {
								  System.out.println("Coordinador no encontrado.");
							  }
						  }		                    
	                    break;
	                case 5:
	                    System.out.println("Volviendo al menú principal... \n \n");
	                    break;
	                default:
	                    System.out.println("Opción inválida. Intente de nuevo.");
	            }
		        } while(opcion != 5);
			}else {
				System.out.println("...");
			}
	    }
	}
