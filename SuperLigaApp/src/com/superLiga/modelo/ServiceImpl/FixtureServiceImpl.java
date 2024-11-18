/**
 * 
 */
package com.superLiga.modelo.ServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.superLiga.modelo.Fixture;
import com.superLiga.modelo.Service.ConexionBaseDatos;
import com.superLiga.modelo.Service.ServiceGenerico;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class FixtureServiceImpl implements ServiceGenerico<Fixture> {

	@Override
	public void agregar(Fixture fixture) {
		String query = " INSERT INTO fixture"
				+ "(nombreEquipo,"
				+ "cantidadPuntosEquipo)"
				+ "VALUES"
				+ "(?,"
				+ "?)";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, fixture.getNombreEquipo().toLowerCase());
			statement.setInt(2, fixture.getCantidadPuntosEquipo());
			
			statement.executeUpdate();
		} catch (Exception e) {
			System.err.println("Error al agregar el Fixture: " + e.getMessage());
		}
		
	}
	
	/**
	 * 
	 * @param nombreEquipo
	 * @return Retorna verdadero si existe el Equipo buscado
	 */
	public boolean consultarEquipo(String nombreEquipo) {

		String query = " SELECT * "
				+ " FROM fixture "
				+ " WHERE fixture.nombreEquipo = ? ";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, nombreEquipo.toLowerCase());	
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Equipo: " + e.getMessage());
		}
		return false;
	}

	/**
	 * 
	 * @param cantidadPuntos
	 * @param nombreEquipo
	 * @return Retorna verdadero si se actualizó algún registro
	 */
	public boolean actualizarCantidadPuntosPorEquipo(int cantidadPuntos, String nombreEquipo) {
		String query = "UPDATE fixture SET cantidadPuntosEquipo = ? WHERE nombreEquipo = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, cantidadPuntos);
			statement.setString(2, nombreEquipo.toLowerCase());
            return (statement.executeUpdate() > 0);
		} catch (SQLException e) {
			System.err.println("Error al actualizar los resultados del Equipo: " + e.getMessage());
			return false;
		}		
	}

	public Fixture consultarFixture(String nombreEquipo) {

		String query = " SELECT * "
				+ " FROM fixture "
				+ " WHERE fixture.nombreEquipo = ? ";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, nombreEquipo);	
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				
				Fixture fixture = new Fixture(resultSet.getString("nombreEquipo"), resultSet.getInt("cantidadPuntosEquipo"));
				return fixture;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Equipo: " + e.getMessage());
		}
		return null;
	}

	@Override
	public void editar(Fixture fixture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fixture consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fixture> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
