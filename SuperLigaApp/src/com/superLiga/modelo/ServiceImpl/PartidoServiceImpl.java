/**
 * 
 */
package com.superLiga.modelo.ServiceImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.superLiga.modelo.Partido;
import com.superLiga.modelo.Service.ConexionBaseDatos;
import com.superLiga.modelo.Service.ServiceGenerico;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class PartidoServiceImpl implements ServiceGenerico<Partido> {

	@Override
	public void agregar(Partido partido) {
		String query = " INSERT INTO partido"
				+ "(equipoLocal,"
				+ "equipoVisitante)"
				+ "VALUES"
				+ "(?,"
				+ "?)";
		
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, partido.getEquipoLocal().toLowerCase());
			statement.setString(2, partido.getEquipoVisitante().toLowerCase());
			statement.setInt(3, partido.getCategoria());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Error al agregar el Jugador: " + e.getMessage());
		}
		
	}

	@Override
	public void editar(Partido partido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Partido consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Partido> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * 
	 * @param nombreEquipo
	 * @return Retorna verdadero si existe el Partido buscado
	 */
	public boolean consultarPartidoPorCategoria(int categoriaPartido) {

		String query = " SELECT * "
				+ " FROM partido "
				+ " WHERE partido.categoria = ? ";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, categoriaPartido);
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Partido: " + e.getMessage());
		}
		return false;
	}
	
	/**
	 * 
	 * @param nombreEquipo
	 * @return Retorna verdadero si existe el Partido buscado
	 */
	public boolean consultarPartidoPorCategoriaFechaHora(int categoriaPartido, java.util.Date fechaPartido, int horaPartido) {

		String query = " SELECT * "
				+ " FROM partido "
				+ " WHERE partido.categoria = ? "
				+ " AND partido.fechaPartido = ? "
				+ " AND horaPartido = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, categoriaPartido);
			Date fechaSql = new Date(fechaPartido.getTime());
			statement.setDate(2, fechaSql);
			statement.setInt(3, horaPartido);
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Partido: " + e.getMessage());
		}
		return false;
	}
	
	
	public List<Partido> consultarPartidosPorFecha(java.util.Date fechaPartido) {
		String query = " SELECT * "
				+ " FROM partido "
				+ " WHERE partido.fechaPartido = ? ";
		List<Partido> partidos = new ArrayList<Partido>();
		
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			Date fechaSql = new Date(fechaPartido.getTime());
			statement.setDate(1, fechaSql);
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				
				Partido partido = new Partido();
				
				partido.setEquipoLocal(resultSet.getString("equipoLocal"));
				partido.setEquipoVisitante(resultSet.getString("equipoVisitante"));
				partido.setCategoria(resultSet.getInt("categoria"));
				partido.setFechaPartido(fechaPartido);
				partido.setHoraPartido(resultSet.getInt("horaPartido"));
				partido.setCantidadGolesEquipoVisitante(resultSet.getInt("cantidadGolesEquipoVisitante"));
				partido.setCantidadGolesEquipoLocal(resultSet.getInt("cantidadGolesEquipoLocal"));
				partido.setEquipoGanadorPartido(resultSet.getString("equipoGanadorPartido"));
				
				partidos.add(partido);
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Partido: " + e.getMessage());
		}
		return partidos;
	}
	
	public List<Partido> consultarPartidosPorCategoria(int categoria) {
		String query = " SELECT * "
				+ " FROM partido "
				+ " WHERE partido.categoria = ? ";
		List<Partido> partidos = new ArrayList<Partido>();
		
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, categoria);
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				
				Partido partido = new Partido();
				
				partido.setEquipoLocal(resultSet.getString("equipoLocal"));
				partido.setEquipoVisitante(resultSet.getString("equipoVisitante"));
				partido.setCategoria(resultSet.getInt("categoria"));
				
				
				// Obtener la fecha de nacimiento como java.sql.Date
	            Date sqlDate = resultSet.getDate("fechaPartido");
	            
	        	// Convertir de java.sql.Date a java.util.Date
	            if (sqlDate != null) {
	            	partido.setFechaPartido(new java.util.Date(sqlDate.getTime())); // Convertir a java.util.Date
	            }
	            
				partido.setHoraPartido(resultSet.getInt("horaPartido"));
				partido.setCantidadGolesEquipoVisitante(resultSet.getInt("cantidadGolesEquipoVisitante"));
				partido.setCantidadGolesEquipoLocal(resultSet.getInt("cantidadGolesEquipoLocal"));
				partido.setEquipoGanadorPartido(resultSet.getString("equipoGanadorPartido"));
				
				partidos.add(partido);
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Partido: " + e.getMessage());
		}
		return partidos;
	}
	
	/**
	 * 
	 * @param cantidadGolesAnotadosEquipoLocal
	 * @param cantidadGolesAnotadosEquipoVisitante
	 * @param categoriaPartido
	 * @param fechaPartido
	 * @param horaPartido
	 * @return Retorna verdadero si se actualizó algún registro
	 */
	public boolean actualizarResultadoPartido(int cantidadGolesAnotadosEquipoLocal, int cantidadGolesAnotadosEquipoVisitante,  String equipoGanadorPartido,
				int categoriaPartido, java.util.Date fechaPartido, int horaPartido) {
		String query = "UPDATE partido SET fechaPartido = ? , horaPartido = ?, cantidadGolesEquipoLocal = ?, cantidadGolesEquipoVisitante = ?,  equipoGanadorPartido = ? "
				+ " WHERE categoria = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			Date fechaSql = new Date(fechaPartido.getTime());
			statement.setDate(1, fechaSql);
			statement.setInt(2, horaPartido);
			statement.setInt(3, cantidadGolesAnotadosEquipoLocal);
			statement.setInt(4,cantidadGolesAnotadosEquipoVisitante);
			statement.setString(5, equipoGanadorPartido.toLowerCase());
			statement.setInt(6, categoriaPartido);
			
            return (statement.executeUpdate() > 0);
		} catch (SQLException e) {
			System.err.println("Error al Actualizar el Partido: " + e.getMessage());
			return false;
		}
	}
}
