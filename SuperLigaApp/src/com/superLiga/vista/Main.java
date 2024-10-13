/**
 * 
 */
/*
 * package com.superLiga.vista;
 * 
 * import java.lang.reflect.Constructor; import
 * java.lang.reflect.InvocationTargetException; import java.util.Scanner;
 * 
 * 
 * 
 *//**
	 * @author Hugo Grimanis
	 *
	 *//*
		 * public class Main { static Scanner sc = new Scanner(System.in);
		 * 
		 * public static void main (String[]args){
		 * 
		 * String dato; boolean salir= false; do{ System.out.
		 * println("************************************************************************ \n"
		 * ); System.out.println("Super Liga App 2024-2025 \n"); System.out.
		 * println("************************************************************************ \n"
		 * ); System.out.
		 * println("************************************************************************ \n"
		 * ); System.out.println("Menu Principal de Opciones: \n"); System.out.
		 * println("************************************************************************ \n"
		 * ); System.out.println("1: Jugador\n"); System.out.println("2: Equipo\n");
		 * System.out.println("3: Categoria\n"); System.out.println("4: Liga\n");
		 * System.out.println("5: Fixture\n");
		 * System.out.println("6: Usuario - Profesor\n");
		 * System.out.println("7: Administrador - Coordinador\n");
		 * System.out.println("8: Salir\n"); System.out.
		 * println("************************************************************************ \n"
		 * ); System.out.println("Seleccione una de las opciones validas \n");
		 * dato=sc.nextLine(); switch (dato){ case "1": //
		 * ejecutar(SondeoTablaCuadratica.class); break; case "2": System.out.println(
		 * "Hash Table Lineal\n"); // ejecutar(SondeoLineal.class); break; case "3":
		 * System.out.println("Hashing Abierto\n"); //
		 * ejecutar(TablaHashingAbierto.class); break; case "4": // Prueba(); break;
		 * case "5": salir = true; break; default: System.out.
		 * println("Seleccion invalida, debe seleccionar alguna de las opciones validas (1 al 5)\n"
		 * ); break; } } while (!salir);
		 * 
		 * sc.close(); System.out.println(" Ha salido del programa"); }
		 * 
		 * public static int imprimirMenu(String tipoHash){ String dato;
		 * System.out.println("\n\033[1m" + "Opciones:" + "\033[0m\n" +
		 * "1: Agregar Dato\n" + "2: Buscar Dato\n" + "3: Eiminar Dato\n" +
		 * "4: Imprimir Hash Table\n" + "5: " + " Atras");
		 * 
		 * System.out.print("\033[1m" + "> " + "\033[0m"); dato = sc.nextLine(); return
		 * Integer.parseInt(dato); }
		 * 
		 * public static String capturarConLeyenda(String leyenda){
		 * System.out.println(leyenda); System.out.print("\033[1m" + "> " + "\033[0m");
		 * String valor = sc.nextLine(); return valor; }
		 * 
		 * 
		 * public static Hashable obtenerObjetoHasheableConLeyenda(String leyenda){
		 * String valor = capturarConLeyenda(leyenda); Hashable object = new
		 * Datos(Integer.parseInt(valor)); return object; }
		 * 
		 * 
		 * @SuppressWarnings("unchecked") public static void
		 * ejecutar(@SuppressWarnings("rawtypes") Class claseHash) throws
		 * InstantiationException, IllegalAccessException, NoSuchMethodException,
		 * InvocationTargetException {
		 * 
		 * int opcion; boolean otro; do { opcion = imprimirMenu(""); switch (opcion) {
		 * case 1: do { otro = false; //tabla.insertar(obtenerObjetoHasheableConLeyenda(
		 * "Ingrese el dato a agregar (numerico por favor):")); System.out.println(
		 * "Desea agregar uno nuevo? (s/N)" ); System.out.print("\033[1m" + "> " +
		 * "\033[0m"); if(sc.nextLine().toUpperCase().equals("S")){ otro = true; } }
		 * while (otro); break; case 2: do { otro = false;
		 * //tabla.buscar(obtenerObjetoHasheableConLeyenda( "Ingrese el dato a buscar"
		 * )); System.out.println( "Desea buscar otro dato? (s/N)" );
		 * System.out.print("\033[1m" + "> " + "\033[0m");
		 * if(sc.nextLine().toUpperCase().equals("S")){ otro = true; } } while (otro);
		 * break; case 3: do { otro = false;
		 * //tabla.eliminar(obtenerObjetoHasheableConLeyenda(
		 * "Ingrese el dato que desea borrar" )); System.out.println(
		 * "Desea borrar otro dato? (s/N)" ); System.out.print("\033[1m" + "> " +
		 * "\033[0m"); if(sc.nextLine().toUpperCase().equals("S")){ otro = true; } }
		 * while (otro); break; case 4: //tabla.imprimirTablaHash(); break; } }
		 * while(opcion != 5); } }
		 */