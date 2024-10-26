
/**
 * 
 */
package com.superLiga.modelo.ServiceImpl;

import java.util.List;

import com.superLiga.modelo.Jugador;
import com.superLiga.modelo.Service.ServiceGenerico;
import com.superLiga.vista.LogicaInputOutput;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public class JugadorServiceImpl implements ServiceGenerico<Jugador>{
	
	@Override
	public void agregar(Jugador jugador) {
		Jugador nuevoJugador = LogicaInputOutput.obtenerDatosJugador();
		System.out.println("El jugador " + nuevoJugador.getApellidoNombre()  + "ha sido agregado al Club");
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

	@Override
	public List<Jugador> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
