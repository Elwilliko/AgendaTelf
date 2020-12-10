package ec.edu.ups.test;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.entidad.Telefono;
import ec.edu.ups.entidad.Usuario;

public class testUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioDAO user = DAOFactory.getFactory().getUsuarioDAO();
		
		Usuario u1 = new Usuario("0302306915", "William", "Chabla", "will@gmail.com", "1234");
		Usuario u2 = new Usuario("0302306914", "Eduardo", "Chabla", "edu@gmail.com", "1234");
		
		user.create(u1);
		user.create(u2);
		System.out.println("Usuarios Creados");
		
		//Comprobar que funciona funcion login
		System.out.println(user.buscar("will@gmail.com", "1234"));
		
		TelefonoDAO telf = DAOFactory.getFactory().getTelefonoDAO();
		
		System.out.println(user.findAll());
		System.out.println(user.read("0302306915"));
		Telefono t1 = new Telefono("0984389617", "Movil", "Claro", u1);
		Telefono t2 = new Telefono("0722486", "Casa", "Claro", u1);
		Telefono t3 = new Telefono("0999241232", "Movil", "Movistar", u2);
		Telefono t4 = new Telefono("042588752", "Casa", "TvCable", u2);
		
		telf.create(t1);
		telf.create(t2);
		telf.create(t3);
		telf.create(t4);
		System.out.println("Telef creado");
		
		System.out.println(telf.buscarCedula("0302306915"));
		System.out.println(telf.findAll());
		System.out.println(user.read("0302306914"));
		//System.out.println(telf.buscarCorreo("pedrorellana1998@gmail.com"));
	}
}
