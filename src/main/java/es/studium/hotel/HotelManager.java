package es.studium.hotel;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;


public class HotelManager {

	private static Session getSession() {   
		SessionFactory sessionFactory = new Configuration().addAnnotatedClass(Cliente.class).configure().buildSessionFactory();   
		Session session = sessionFactory.openSession();   
		return session; 
		} 
	
	public static void crear(Cliente c) {   
		Session sessionObj = getSession();   
		Transaction tx = sessionObj.beginTransaction();   
		sessionObj.persist(c);    
		tx.commit();    
		sessionObj.close();    
		System.out.println("Cliente con ID: " + c.getIdCliente() + " - Nombre: " + c.getNombre() + 
				" - se ha insertado correctamente en la tabla 'clientes' de la base de datos 'hotel'.");
	}
	
	public static void leer() {   
		String consulta = "FROM " + Cliente.class.getName();    
		Session sessionObj = getSession();     
		List<Cliente> listaResultado = sessionObj.createQuery(consulta, Cliente.class).list();  
		Iterator<Cliente> iteradorResultado = listaResultado.iterator();   
		while (iteradorResultado.hasNext()) {    
			Cliente c = iteradorResultado.next();    
			System.out.println("Cliente ID:" + c.getIdCliente() + " - Nombre: " + c.getNombre() + " " + c.getApellidos() +
					" - Email: " + c.getEmail() + " - DNI: " + c.getDni() + " - Clave: " + c.getClave() + "."); 
		}   
		sessionObj.close();
	} 
	
	public static void actualizar(Cliente c) {   
		Session sessionObj = getSession();   
		Transaction transObj = sessionObj.beginTransaction();    
		sessionObj.merge(c);    
		transObj.commit();   
		sessionObj.close();   
		System.out.println("Actualizado correctamente el cliente de id: " + c.getIdCliente()); 
	} 
	
	public static void eliminar(Cliente c) {  
		Session sessionObj = getSession();  
		Transaction transObj = sessionObj.beginTransaction();  
		sessionObj.remove(c);  transObj.commit(); 
	}
}

