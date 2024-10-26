/**
 * 
 */
package com.superLiga.modelo.ServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.superLiga.modelo.Categoria;
import com.superLiga.modelo.Service.ConexionBaseDatos;
import com.superLiga.modelo.Service.ServiceGenerico;
import com.superLiga.vista.LogicaInputOutput;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class CategoriaServiceimpl implements ServiceGenerico<Categoria> {

	@Override
	public void agregar(Categoria categoria) {
		
		Categoria nuevaCategoria = LogicaInputOutput.obtenerDatosCategoria();
		String query = "INSERT INTO categoria"
				+ "(anioCategoria)"
				+ "VALUES"
				+ "(?)";
		try (Connection conexion = ConexionBaseDatos.obtenerConexion();
				PreparedStatement statement = conexion.prepareStatement(query)){
			statement.setInt(1, nuevaCategoria.getAnioCategoria());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
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
