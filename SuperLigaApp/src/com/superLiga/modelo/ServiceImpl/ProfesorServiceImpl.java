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

import com.superLiga.modelo.Profesor;
import com.superLiga.modelo.Provincia;
import com.superLiga.modelo.Service.ConexionBaseDatos;
import com.superLiga.modelo.Service.ServiceGenerico;
import com.superLiga.vista.LogicaInputOutput;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class ProfesorServiceImpl implements ServiceGenerico<Profesor> {

	@Override
	public void agregar(Profesor profesor) {

		String query = 
				" INSERT INTO Profesor"
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
						+ "categoriaDirigida,"
						+ "directorTecnicoFavorito,"
						+ "equipoAsignado)"
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
			statement.setString(1, profesor.getApellidoNombre());
			
			/**
			 * Para poder insertar la fecha en la tabla correspondiente necesito crear un objeto del tipo java.sql.Date.
			 * Por ello, realizo la conversion de java.util.date a java.sql.Date a traves de .getTime()
			 */
			Date fechaSql = new Date(profesor.getFechaNacimiento().getTime());
			statement.setDate(2, fechaSql);
			statement.setInt(3, profesor.getDni());
			statement.setString(4, String.valueOf(profesor.getSexo()));
			statement.setInt(5, profesor.getEdad());
			statement.setString(6, profesor.getDomicilio()) ;
			statement.setString(7, profesor.getProvincia().toString());
			statement.setString(8, profesor.getCodigoPostal()); 
			statement.setString(9, profesor.getEmail());
			statement.setLong(10, profesor.getTelefono());
			statement.setString(11, profesor.getHinchaClub());
			statement.setInt(12, profesor.getCategoriaDirigida());
			statement.setString(13, profesor.getDirectorTecnicoFavorito());
			statement.setString(14, "");
			
			statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Error al agregar el Profesor: " + e.getMessage());
		}
		
	}

	@Override
	public void editar(Profesor profesor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Profesor consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @param dni
	 * @return Retorna verdadero si existe el Profesor buscado
	 */
	public boolean consultarProfesorPorDni(int dni) {

		String query = " SELECT * "
				+ " FROM profesor "
				+ " WHERE profesor.dni = ? ";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, dni);	
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Profesor: " + e.getMessage());
		}
		return false;
	}
	
	/**
	 * @param dni
	 * @param equipoAsignado
	 * @param categoriaDirigida
	 * @param 
	 * @return Retorna verdadero si se actualizó algún registro
	 */
	public boolean editar(int dni,  String equipoAsignado, int categoriaDirigida) {
		String query = "UPDATE Profesor SET equipoAsignado = ?, categoriaDirigida = ? WHERE dni = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, equipoAsignado);
			statement.setInt(2,categoriaDirigida);
			statement.setInt(3, dni);
            return (statement.executeUpdate() > 0);
		} catch (SQLException e) {
			System.err.println("Error al editar el Profesor: " + e.getMessage());
			return false;
		}		
	}

	/**
	 * @param dni
	 * @return Retorna verdadero si se elimino el Profesor
	 */
	public boolean eliminarPorDNI(int dni) {
		String query = "DELETE FROM Profesor WHERE dni = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, dni);
            return statement.executeUpdate() > 0; 
		} catch (SQLException e) {
			System.err.println("Error al eliminar el Profesor: " + e.getMessage());
			return false;
		}	
	}

	/**
	 * @param dni
	 * @return
	 */
	public int consultarCategoriaProfesorPorDni(int dni) {
		String query = " SELECT profesor.categoriaDirigida "
				+ " FROM profesor "
				+ " WHERE profesor.dni = ? ";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, dni);	
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				
				int categoriaDirigida = resultSet.getInt("categoriaDirigida");
				return categoriaDirigida;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Profesor: " + e.getMessage());
		}
		return -1;
	}

	/**
	 * @param dniConsulta
	 * @return
	 */
	public Profesor consultarFullProfesor(int dniConsulta) {
		String query = " SELECT * "
				+ " FROM profesor "
				+ " WHERE profesor.dni = ? ";
		Profesor profesor = new Profesor();
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, dniConsulta);	
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				profesor.setApellidoNombre(resultSet.getString("apellidoNombre"));
				
				// Obtener la fecha de nacimiento como java.sql.Date
	            Date sqlDate = resultSet.getDate("fechaNacimiento");
	            
	        	// Convertir de java.sql.Date a java.util.Date
	            if (sqlDate != null) {
	            	profesor.setFechaNacimiento(new java.util.Date(sqlDate.getTime())); // Convertir a java.util.Date
	            }
				
	           
	            profesor.setDni(resultSet.getInt("dni"));
	            profesor.setSexo(resultSet.getString("sexo").charAt(0));
	            profesor.setEdad(resultSet.getInt("edad"));
	            profesor.setDomicilio(resultSet.getString("direccion"));
	            
	            Provincia provincia = LogicaInputOutput.obtenerProvinciaPorDescripcion(resultSet.getString("provincia"));
		        if (provincia != null) {
		        	profesor.setProvincia(provincia);
		        }
	            
		        profesor.setCodigoPostal(resultSet.getString("codigoPostal"));
		        profesor.setEmail(resultSet.getString("email"));
		        profesor.setTelefono(resultSet.getLong("telefono"));
		        profesor.setHinchaClub(resultSet.getString("hinchaClub"));		        
	            profesor.setCategoriaDirigida(resultSet.getInt("categoriaDirigida"));
	            profesor.setEquipoAsignado(resultSet.getString("equipoAsignado"));
	            profesor.setDirectorTecnicoFavorito(resultSet.getString("directorTecnicoFavorito"));
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Profesor: " + e.getMessage());
		}
		
	    return profesor;
	}

}
