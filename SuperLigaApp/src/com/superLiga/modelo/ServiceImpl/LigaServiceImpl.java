/**
 * 
 */
package com.superLiga.modelo.ServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.superLiga.modelo.Liga;
import com.superLiga.modelo.Service.ConexionBaseDatos;
import com.superLiga.modelo.Service.ServiceGenerico;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class LigaServiceImpl implements ServiceGenerico<Liga> {

	@Override
	public void agregar(Liga liga) {
		String query = " INSERT INTO Liga"
				+ "(nombreLiga,"
				+ "categoriaLiga)"
				+ "VALUES"
				+ "(?,"
				+ "?)";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			
					statement.setString(1, liga.getNombreLiga().toLowerCase());
					statement.setInt(2, liga.getCategoriaLiga());
					
					statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Error al agregar el registro a la Liga: " + e.getMessage());
		}
				
		
	}

	@Override
	public void editar(Liga liga) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 * @param categoriaLiga
	 * @param nombreEquipo
	 * @return Retorna verdadero si se actualizó algún registro
	 */
	public boolean actualizarDatosLiga (int posicionEquipo, int nroFechaLiga, int categoriaLiga, String nombreEquipo) {
		String query = "UPDATE Liga SET posicionEquipo = ?, nroFechaLiga = ?, equipo = ? WHERE categoriaLiga = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			
			statement.setInt(1, posicionEquipo);
			statement.setInt(2, nroFechaLiga);
			statement.setString(3, nombreEquipo);
			statement.setInt(4, categoriaLiga);
            return (statement.executeUpdate() > 0);
		} catch (SQLException e) {
			System.err.println("Error al actualizar los resultados de la Liga: " + e.getMessage());
			return false;
		}	
		
	}
	
	/**
	 * 
	 * @param categoriaLiga
	 * @return Retorna verdadero si existe la Liga buscada
	 */
	public boolean consultarLiga (int categoriaLiga) {
		String query = " SELECT * "
				+ " FROM liga "
				+ " WHERE liga.categoriaLiga = ? ";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, categoriaLiga);
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar la Liga: " + e.getMessage());
		}
		return false;
	}
	

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 * @param categoriaLiga
	 * @return Retorna verdadero si se elimino algún registro
	 */
	public boolean eliminarLiga (int categoriaLiga) {
		String query = "DELETE FROM Liga WHERE categoriaLiga = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, categoriaLiga);
            return statement.executeUpdate() > 0; 
		} catch (SQLException e) {
			System.err.println("Error al eliminar la Liga: " + e.getMessage());
			return false;
		}	
	}
	@Override
	public Liga consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Liga> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param nombreLigaConsulta
	 * @param categoriaConsulta
	 * @return
	 */
	public Liga consultarFullLiga(int categoriaConsulta) {
		String query = " SELECT * "
				+ " FROM liga "
				+ " WHERE liga.categoriaLiga = ? ";
		Liga liga = new Liga();
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, categoriaConsulta);	
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				
				liga.setNombreLiga(resultSet.getString("nombreLiga").toLowerCase());
				liga.setCategoriaLiga(categoriaConsulta);
				liga.setNroFechaLiga(resultSet.getInt("nroFechaLiga"));
				liga.setEquipos(resultSet.getString("equipo"));
				liga.setPosicionEquipo(resultSet.getInt("posicionEquipo"));

			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar la Liga: " + e.getMessage());
		}
		
	    return liga;
	}

}
