package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.interfaces.IEmpleado;
import com.jpa.modelo.TblEmpleado;

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
		//confirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el valor buscado
		return buscar;
		
		
		
	} //fin del metodo buscar.....

} //fin de la clase....
