
/**
 * 
 */
package com.superLiga.modelo.ServiceImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.superLiga.modelo.Jugador;
import com.superLiga.modelo.Service.ConexionBaseDatos;
import com.superLiga.modelo.Service.ServiceGenerico;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class JugadorServiceImpl implements ServiceGenerico<Jugador>{
	
	@Override
	public void agregar(Jugador jugador) {
		String query = 
				" INSERT INTO new_sliga_db.jugador"
						+ "(apellidoNombre,"
						+ "fechaNacimiento,"
						+ "dni,"
						+ "sexo,"
						+ "edad,"
						+ "direccion,"
						+ "provincia,"
						+ "codigoPostal,"
						+ "email,"
						+ "telefono,"
						+ "hinchaClub,"
						+ "categoriaJugador,"
						+ "equipoAsignado,"
						+ "nroCamisetaJugador)"
						+ "VALUES"
						+ "(?,"
						+ "?,"
						+ "?,"
						+ "?,"
						+ "?,"
						+ "?,"
						+ "?,"
						+ "?,"
						+ "?,"
						+ "?,"
						+ "?,"
						+ "?,"
						+ "?,"
						+ "?)";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, jugador.getApellidoNombre());
			
			/**
			 * Para poder insertar la fecha en la tabla correspondiente necesito crear un objeto del tipo java.sql.Date.
			 * Por ello, realizo la conversion de java.util.date a java.sql.Date a traves de .getTime()
			 */
			Date fechaSql = new Date(jugador.getFechaNacimiento().getTime());
			statement.setDate(2, fechaSql);
			statement.setInt(3, jugador.getDni());
			statement.setString(4, String.valueOf(jugador.getSexo()));
			statement.setInt(5, jugador.getEdad());
			statement.setString(6, jugador.getDomicilio()) ;
			statement.setString(7, jugador.getProvincia().toString());
			statement.setString(8, jugador.getCodigoPostal()); 
			statement.setString(9, jugador.getEmail());
			statement.setLong(10, jugador.getTelefono()) ;
			statement.setString(11, jugador.getHinchaClub());
			statement.setInt(12, jugador.getCategoria()) ;
			statement.setString(13, jugador.getEquipoAsignado());			
			statement.setInt(14, jugador.getNroCamiseta());
			
			statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Error al agregar el Jugador: " + e.getMessage());
		}
	}

	@Override
	public void editar(Jugador jugador) {
		// TODO Auto-generated method stub
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub		
	}

	@Override
	public Jugador consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Jugador consultarFullJugador(int dni) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean consultarJugadorPorDni(int dni) {

		String query = " SELECT * "
				+ " FROM jugador "
				+ " WHERE jugador.dni = ? ";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, dni);	
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Jugador: " + e.getMessage());
		}
		return false;
	}

	@Override
	public List<Jugador> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param dni
	 * @param equipoAsignado
	 * @param nroCamiseta
	 * @return Retorna verdadero si se actualizó algún registro
	 */
	public boolean editar(int dni, String equipoAsignado, int nroCamiseta) {
		String query = "UPDATE Jugador SET equipoAsignado = ?, nroCamisetaJugador = ? WHERE dni = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, equipoAsignado);
			statement.setInt(2,nroCamiseta);
			statement.setInt(3, dni);
            return (statement.executeUpdate() > 0);
		} catch (SQLException e) {
			System.err.println("Error al buscar el Jugador: " + e.getMessage());
			return false;
		}		
	}

	/**
	 * @param dni
	 * @return Retorna verdadero si se elimino el jugador
	 */
	public boolean eliminarPorDNI(int dni) {
		String query = "DELETE FROM Jugador WHERE dni = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, dni);
            return statement.executeUpdate() > 0; 
		} catch (SQLException e) {
			System.err.println("Error al eliminar el Jugador: " + e.getMessage());
			return false;
		}	
	}

}
