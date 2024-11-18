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

import com.superLiga.modelo.Coordinador;
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
public class CoordinadorServiceImpl implements ServiceGenerico<Coordinador> {

	@Override
	public void agregar(Coordinador coordinador) {
		String query = " INSERT INTO Coordinador"
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
				+ "directorTecnicoFavorito,"
				+ "cantidadProfesoresACargo)"
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
				+ "?)";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setString(1, coordinador.getApellidoNombre());
			
			/**
			 * Para poder insertar la fecha en la tabla correspondiente necesito crear un objeto del tipo java.sql.Date.
			 * Por ello, realizo la conversion de java.util.date a java.sql.Date a traves de .getTime()
			 */
			Date fechaSql = new Date(coordinador.getFechaNacimiento().getTime());
			statement.setDate(2, fechaSql);
			statement.setInt(3, coordinador.getDni());
			statement.setString(4, String.valueOf(coordinador.getSexo()));
			statement.setInt(5, coordinador.getEdad());
			statement.setString(6, coordinador.getDomicilio()) ;
			statement.setString(7, coordinador.getProvincia().toString());
			statement.setString(8, coordinador.getCodigoPostal()); 
			statement.setString(9, coordinador.getEmail());
			statement.setLong(10, coordinador.getTelefono()) ;
			statement.setString(11, coordinador.getHinchaClub());
			statement.setString(12, coordinador.getDirectorTecnicoFavorito());
			statement.setInt(13, coordinador.getCantidadProfesoresACargo());
			
			statement.executeUpdate();
		} catch (Exception e) {
			System.err.println("Error al agregar el Coordinador: " + e.getMessage());
		}
		
	}

	@Override
	public void editar(Coordinador coordinador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Coordinador consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Coordinador> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @param dni
	 * @return Retorna verdadero si existe el Coordinador buscado
	 */
	public boolean consultarCoordinadorPorDni(int dni) {

		String query = " SELECT * "
				+ " FROM coordinador "
				+ " WHERE coordinador.dni = ? ";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, dni);	
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Coordinador: " + e.getMessage());
		}
		return false;
	}
	
	/**
	 * @param dni
	 * @param cantidadProfesoresACargo
	 * @return Retorna verdadero si se actualizó algún registro
	 */
	public boolean editar(int dni, int cantidadProfesoresACargo) {
		String query = "UPDATE Coordinador SET cantidadProfesoresACargo = ? WHERE dni = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1,cantidadProfesoresACargo);
			statement.setInt(2, dni);
            return (statement.executeUpdate() > 0);
		} catch (SQLException e) {
			System.err.println("Error al editar el Coordinador: " + e.getMessage());
			return false;
		}		
	}

	/**
	 * @param dni
	 * @return Retorna verdadero si se elimino el Coordinador
	 */
	public boolean eliminarPorDNI(int dni) {
		String query = "DELETE FROM Coordinador WHERE dni = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, dni);
            return statement.executeUpdate() > 0; 
		} catch (SQLException e) {
			System.err.println("Error al eliminar el Coordinador: " + e.getMessage());
			return false;
		}	
	}

	/**
	 * @param dniConsulta
	 * @return
	 */
	public Coordinador consultarFullCoordinador(int dniConsulta) {
		String query = " SELECT * "
				+ " FROM coordinador "
				+ " WHERE coordinador.dni = ? ";
		Coordinador coordinador = new Coordinador();
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, dniConsulta);	
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				coordinador.setApellidoNombre(resultSet.getString("apellidoNombre"));
				
				// Obtener la fecha de nacimiento como java.sql.Date
	            Date sqlDate = resultSet.getDate("fechaNacimiento");
	            
	        	// Convertir de java.sql.Date a java.util.Date
	            if (sqlDate != null) {
	            	coordinador.setFechaNacimiento(new java.util.Date(sqlDate.getTime())); // Convertir a java.util.Date
	            }
				
	           
	            coordinador.setDni(resultSet.getInt("dni"));
	            coordinador.setSexo(resultSet.getString("sexo").charAt(0));
	            coordinador.setEdad(resultSet.getInt("edad"));
	            coordinador.setDomicilio(resultSet.getString("direccion"));
	            
	            Provincia provincia = LogicaInputOutput.obtenerProvinciaPorDescripcion(resultSet.getString("provincia"));
		        if (provincia != null) {
		        	coordinador.setProvincia(provincia);
		        }
	            
		        coordinador.setCodigoPostal(resultSet.getString("codigoPostal"));
		        coordinador.setEmail(resultSet.getString("email"));
		        coordinador.setTelefono(resultSet.getLong("telefono"));
		        coordinador.setHinchaClub(resultSet.getString("hinchaClub"));		        
	            coordinador.setDirectorTecnicoFavorito(resultSet.getString("directorTecnicoFavorito"));;
	            coordinador.setCantidadProfesoresACargo(resultSet.getInt("cantidadProfesoresACargo"));
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar el Coordinador: " + e.getMessage());
		}
		
	    return coordinador;
	}

}
