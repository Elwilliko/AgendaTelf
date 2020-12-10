package ec.edu.ups.dao;


import java.util.List;

import ec.edu.ups.entidad.Telefono;


public interface TelefonoDAO  extends GenericDAO<Telefono, String> {

	List<Telefono> buscarCedula(String cedula);
		
}
