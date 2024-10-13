/**
 * 
 */
package com.superLiga.modelo.Service;

import java.util.List;

/**
 * @author Hugo Grimanis 
 * Legajo: VINF013133 
 * DNI: 32.703.963
 *
 */
public abstract interface ServiceGenerico<T> {

	public abstract void agregar(T entidad);
	
	public abstract void editar(T entidad);
	
	public abstract void eliminar(int id);
	
	public abstract T consultar (int id);
	
	public abstract List<T> listar();
}
