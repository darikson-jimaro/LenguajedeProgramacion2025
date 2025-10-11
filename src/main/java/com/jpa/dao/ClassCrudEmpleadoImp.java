package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.interfaces.IEmpleado;
import com.jpa.modelo.TblEmpleado;

<<<<<<< HEAD
public class ClassCrudEmpleadoImp  implements IEmpleado{

	@Override
	public void registrarEmpleado(TblEmpleado tblempleado) {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory  conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
	//menejador de entidades segun unidad de persistencia....
		EntityManager em=conex.createEntityManager();
		//************realizamos el proceso.....
		    //iniciar la transaccion...
		em.getTransaction().begin();
		    //registramos datos...
		     //si fuera JDBC seria insert into tbl_empleado values......
		em.persist(tblempleado);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
	
	
	} //fin del metodo registrar....

	@Override
	public void actualizarEmpleado(TblEmpleado tblempleado) {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory  conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
	//menejador de entidades segun unidad de persistencia....
		EntityManager em=conex.createEntityManager();
		//************realizamos el proceso.....
		    //iniciar la transaccion...
		em.getTransaction().begin();
		    //actualizar datos...
		     //si fuera JDBC seria update tbl_empleado values......
		em.merge(tblempleado);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	} //fin del metodo actualizar...

	@Override
	public void eliminarEmpleado(TblEmpleado tblempleado) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
		//manejador de entidades...
		EntityManager em=conex.createEntityManager();
		//realizamos el proceso...
		    //iniciar la transaccion....
		em.getTransaction().begin();
		//recuperar el codigo a eliminar
		TblEmpleado elim=em.merge(tblempleado);
		//eliminando el dato de la base de datos
		em.remove(elim);
		//imprimimos un mensaje por pantalla
		System.out.println("dato eliminado de la BD");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	} //fin del metodo eliminar....

	@Override
	public List<TblEmpleado> listadoEmpleado() {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
		//manejador de entidades...
		EntityManager em=conex.createEntityManager();
		//realizamos el proceso...
		    //iniciar la transaccion....
		em.getTransaction().begin();
		//aplicamos JPQL  se base en entidades....
		List<TblEmpleado> listado=em.createQuery("select e from TblEmpleado e",TblEmpleado.class).getResultList();
		//confirmamos...
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado...
		return listado;
	
	} //fin del metodo listar.....

	@Override
	public TblEmpleado buscarEmpleado(TblEmpleado tblempleado) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
		//manejador de entidades...
		EntityManager em=conex.createEntityManager();
		//realizamos el proceso...
		    //iniciar la transaccion....
		em.getTransaction().begin();
		//enviamos el codigo a buscar
		TblEmpleado buscar=em.find(TblEmpleado.class,tblempleado.getIdempleado());
=======
public class ClassCrudEmpleadoImp implements IEmpleado {

	@Override
	public void registrarEmpleado(TblEmpleado tblempleado) {
		//establecemos con la unidad de persistence.xml
		EntityManagerFactory conex= Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");	
		
		//manejador de entidades segun la unidad de persistencia
		EntityManager em= conex.createEntityManager();
		
		//iniciar la transaccion
		em.getTransaction().begin();
		//registramos datos
		em.persist(tblempleado);
>>>>>>> 7ce5f6c0191623ae3c29b58c3ef2caab412c32d9
		//confirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();
<<<<<<< HEAD
		//retornamos el valor buscado
		return buscar;
		
		
		
	} //fin del metodo buscar.....

} //fin de la clase....
=======
		

	} // Fin del metodo registrar

	@Override
	public void actualizarEmpleado(TblEmpleado tblempleado) {
		//establecemos con la unidad de persistence.xml
				EntityManagerFactory conex= Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");	
				
				//manejador de entidades segun la unidad de persistencia
				EntityManager em= conex.createEntityManager();
				
				//iniciar la transaccion
				em.getTransaction().begin();
				//registramos datos
				em.merge(tblempleado);
				//confirmamos 
				em.getTransaction().commit();
				//cerramos
				em.close();

	} // Fin del metodo actualizar

	@Override
	public void eliminarEmpleado(TblEmpleado tblempleado) {
		// TODO Auto-generated method stub

	} // Fin del metodo Eliminar

	@Override
	public List<TblEmpleado> listadoEmpleado() {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory conex= Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");	
		
		//manejador de entidades segun la unidad de persistencia
		EntityManager em= conex.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//Listar
		List<TblEmpleado> listado= em.createQuery("select e from TblEmpleado e",TblEmpleado.class).getResultList();
 		//confirmarmos
		em.getTransaction().commit();
		//cerramos
		em.close();
		return listado;
	} // Fin del metodo Listar

	@Override
	public TblEmpleado buscarEmpleado(TblEmpleado tblempleado) {
		// TODO Auto-generated method stub
		return null;
	}	//Fin del metodo Buscar

} // Fin de la clase....
>>>>>>> 7ce5f6c0191623ae3c29b58c3ef2caab412c32d9
