package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.interfaces.IEmpleado;
import com.jpa.modelo.TblEmpleado;

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
		//confirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();
		

	} // Fin del metodo registrar

	@Override
	public void actualizarEmpleado(TblEmpleado tblempleado) {
		// TODO Auto-generated method stub

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
