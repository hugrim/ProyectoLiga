/**
 * 
 */
package com.superLiga.modelo.ServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.superLiga.modelo.Categoria;
import com.superLiga.modelo.Service.ConexionBaseDatos;
import com.superLiga.modelo.Service.ServiceGenerico;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class CategoriaServiceimpl implements ServiceGenerico<Categoria> {

	@Override
	public void agregar(Categoria categoria) {
		String query = "INSERT INTO categoria"
				+ "(anioCategoria)"
				+ "VALUES"
				+ "(?)";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, categoria.getAnioCategoria());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Error al agregar la Categoria: " + e.getMessage());
		}		
	}
	
	public boolean consultarExisteCategoria (int categoria) {
		String query = " SELECT * "
				+ " FROM categoria "
				+ " WHERE categoria.anioCategoria = ? ";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, categoria);	
			ResultSet resultSet = statement.executeQuery();			
			if(resultSet.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			System.err.println("Error al buscar la Categoria: " + e.getMessage());
		}
		return false;
	}
	
	public boolean eliminarPorCategoria(int categoria) {
		String query = "DELETE FROM categoria WHERE anioCategoria = ?";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, categoria);
            return statement.executeUpdate() > 0; 
		} catch (SQLException e) {
			System.err.println("Error al eliminar la Categoria : " + e.getMessage());
			return false;
		}	
	}

	@Override
	public void editar(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categoria consultar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
