/**
 * 
 */
package com.superLiga.modelo.ServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.superLiga.modelo.Equipo;
import com.superLiga.modelo.Service.ConexionBaseDatos;
import com.superLiga.modelo.Service.ServiceGenerico;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class EquipoServiceImpl implements ServiceGenerico<Equipo> {

	@Override
	public void agregar(Equipo equipo) {
		String query = 
				" INSERT INTO Equipo"
						+ "(nombreEquipo,"
						+ "categoriaEquipo,"
						+ "apellidoNombreJugador,"
						+ "nroCamisetaJugador,"
						+ "cantidadPartidosGanados,"
						+ "cantidadPartidosEmpatados,"
						+ "cantidadPartidosPerdidos,"
						+ "cantidadGolesAFavor,"
						+ "cantidadGolesenContra,"
						+ "diferenciadeGol,"
						+ "apellidoNombreProfesor)"
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
						+ "?)";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, equipo.getNombreEquipo().toLowerCase());
			statement.setInt(2, equipo.getCategoriaEquipo());
			statement.setString(3, "");
			statement.setInt(4, equipo.getNroCamisetaJugador());
			statement.setInt(5, equipo.getCantidadPartidosGanados());
			statement.setInt(6, equipo.getCantidadPartidosEmpatados());
			statement.setInt(7, equipo.getCantidadPartidosPerdidos());
			statement.setInt(8, equipo.getCantidadGolesAFavor());
			statement.setInt(9, equipo.getCantidadGolesenContra());
			statement.setInt(10, equipo.getDiferenciaGol());
			statement.setString(11, "");
			
			statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Error al agregar el Equipo: " + e.getMessage());
		}
		
	}

	@Override
	public void editar(Equipo equipo) {
		// TODO
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Equipo consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 * @param nombreEquipo
	 * @return Retorna verdadero si existe el Equipo buscado
	 */
	public boolean consultarEquipoPorNombre(String nombreEquipo) {

		String query = " SELECT * "
				+ " FROM equipo "
				+ " WHERE equipo.nombreEquipo = ? ";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, nombreEquipo);	
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
	 * @param nombreEquipo
	 * @return Retorna verdadero si existe el Equipo buscado
	 */
	public List<Equipo> consultarEquipoPorCategoria(int categoria) {

		String query = " SELECT * "
				+ " FROM equipo "
				+ " WHERE equipo.categoriaEquipo = ? ";
		List<Equipo> equipos = new ArrayList<Equipo>();
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, categoria);	
			ResultSet resultSet = statement.executeQuery();			
			while(resultSet.next()) {

	            String nombreEquipo = resultSet.getString("nombreEquipo");
                int categoriaEquipo = resultSet.getInt("categoriaEquipo");
                String apellidoNombreJugador = resultSet.getString("apellidoNombreJugador");
                int nroCamisetaJugador = resultSet.getInt("nroCamisetaJugador");
                int cantidadPartidosGanados = resultSet.getInt("cantidadPartidosGanados");
                int cantidadPartidosEmpatados = resultSet.getInt("cantidadPartidosEmpatados");
                int cantidadPartidosPerdidos = resultSet.getInt("cantidadPartidosPerdidos");
                int cantidadGolesAFavor = resultSet.getInt("cantidadGolesAFavor");
                int cantidadGolesEnContra = resultSet.getInt("cantidadGolesEnContra");
                int diferenciaDeGol = resultSet.getInt("diferenciadeGol");
                String apellidoNombreProfesor = resultSet.getString("apellidoNombreProfesor");
                
                // Crear el objeto Equipo y agregarlo a la lista
                
                Equipo equipo = new Equipo(nombreEquipo, categoriaEquipo, apellidoNombreJugador, nroCamisetaJugador, cantidadPartidosGanados, 
                							cantidadPartidosEmpatados, cantidadPartidosPerdidos, cantidadGolesAFavor, cantidadGolesEnContra, diferenciaDeGol, apellidoNombreProfesor);
				equipos.add(equipo);
			}
			
		} catch (SQLException e) {
			System.err.println("Error al consultar equipos por categoría: " + e.getMessage());
		}
		return equipos;
	}
	
	/**
	 * 
	 * @param cantidadPartidosGanados
	 * @param cantidadPartidosEmpatados
	 * @param cantidadPartidosPerdidos
	 * @param cantidadGolesAFavor
	 * @param cantidadGolesenContra
	 * @param diferenciadeGol
	 * @param nombreEquipo
	 * @return Retorna verdadero si se actualizó algún registro
	 */
	public boolean actualizarResultadosEquipo(int cantidadPartidosGanados, int cantidadPartidosEmpatados, int cantidadPartidosPerdidos, int cantidadGolesAFavor, int cantidadGolesenContra, int diferenciadeGol, String nombreEquipo) {
		String query = "UPDATE Equipo SET cantidadPartidosGanados = ?, cantidadPartidosEmpatados = ?, cantidadPartidosPerdidos = ?, cantidadGolesAFavor = ?, cantidadGolesenContra = ?, diferenciadeGol = ? WHERE nombreEquipo = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, cantidadPartidosGanados);
			statement.setInt(2,cantidadPartidosEmpatados);
			statement.setInt(3, cantidadPartidosPerdidos);
			statement.setInt(4, cantidadGolesAFavor);
			statement.setInt(5, cantidadGolesenContra);
			statement.setInt(6, diferenciadeGol);
			statement.setString(7, nombreEquipo.toLowerCase());
            return (statement.executeUpdate() > 0);
		} catch (SQLException e) {
			System.err.println("Error al actualizar los resultados del Equipo: " + e.getMessage());
			return false;
		}		
	}
	
	/**
	 * 
	 * @param nombreEquipo
	 * @return Retorna verdadero si se elimino algún registro
	 */
	public boolean eliminarEquipoPorNombre (String nombreEquipo) {
		String query = "DELETE FROM Equipo WHERE nombreEquipo = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, nombreEquipo.toLowerCase());
            return statement.executeUpdate() > 0; 
		} catch (SQLException e) {
			System.err.println("Error al eliminar el Equipo: " + e.getMessage());
			return false;
		}	
	}
	
	public Equipo consultarFulEquipo(String nombreEquipoBuscar) {
		String query = " SELECT * "
				+ " FROM equipo "
				+ " WHERE equipo.nombreEquipo = ? ";
		Equipo equipo = null;
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, nombreEquipoBuscar);	
			ResultSet resultSet = statement.executeQuery();			
			while(resultSet.next()) {

	            String nombreEquipo = resultSet.getString("nombreEquipo");
                int categoriaEquipo = resultSet.getInt("categoriaEquipo");
                String apellidoNombreJugador = resultSet.getString("apellidoNombreJugador");
                int nroCamisetaJugador = resultSet.getInt("nroCamisetaJugador");
                int cantidadPartidosGanados = resultSet.getInt("cantidadPartidosGanados");
                int cantidadPartidosEmpatados = resultSet.getInt("cantidadPartidosEmpatados");
                int cantidadPartidosPerdidos = resultSet.getInt("cantidadPartidosPerdidos");
                int cantidadGolesAFavor = resultSet.getInt("cantidadGolesAFavor");
                int cantidadGolesEnContra = resultSet.getInt("cantidadGolesEnContra");
                int diferenciaDeGol = resultSet.getInt("diferenciadeGol");
                String apellidoNombreProfesor = resultSet.getString("apellidoNombreProfesor");
                
                // Crear el objeto Equipo y retornarlo
                
                equipo = new Equipo(nombreEquipo, categoriaEquipo, apellidoNombreJugador, nroCamisetaJugador, cantidadPartidosGanados, 
                							cantidadPartidosEmpatados, cantidadPartidosPerdidos, cantidadGolesAFavor, cantidadGolesEnContra, diferenciaDeGol, apellidoNombreProfesor);
                return equipo;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al consultar el Equipo: " + e.getMessage());
		}
		return equipo;
	}

	@Override
	public List<Equipo> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
