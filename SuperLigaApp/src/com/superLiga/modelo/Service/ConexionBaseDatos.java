/**
 * 
 */
package com.superLiga.modelo.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class ConexionBaseDatos {

	private static final String URL = "jdbc:mysql://localhost:3306/new_sliga_db";
	private static final String USER = "root";
	private static final String PASSWORD = "Cecivar01#";
	
	public static Connection obtenerConexion() {
		
		Connection connectionMySql = null;
		try {
			connectionMySql = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connectionMySql;
	}
}
