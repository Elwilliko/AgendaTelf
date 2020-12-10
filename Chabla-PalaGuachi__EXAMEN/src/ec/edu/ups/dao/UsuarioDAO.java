package ec.edu.ups.dao;


import java.util.List;

import ec.edu.ups.entidad.Telefono;
import ec.edu.ups.entidad.Usuario;


public interface UsuarioDAO extends GenericDAO<Usuario, String> {

	Usuario buscar(String correo, String clave);

	List<Telefono> buscarCedula(String cedula);
	
}
