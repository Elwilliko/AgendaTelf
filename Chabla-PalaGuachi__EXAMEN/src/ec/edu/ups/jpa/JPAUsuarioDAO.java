package ec.edu.ups.jpa;
import javax.persistence.Persistence;

import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.entidad.Usuario;



public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, String> implements UsuarioDAO{
	
	public JPAUsuarioDAO() {
		super(Usuario.class);
		this.em = Persistence.createEntityManagerFactory("examenjpa").createEntityManager();
	}
		
	
}
