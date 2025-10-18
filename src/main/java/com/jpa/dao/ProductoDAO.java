package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.interfaces.IProductoT2;
import com.jpa.modelo.ProductoT2;

public class ProductoDAO implements IProductoT2 {

	
	public void registrarProducto(ProductoT2 producto) {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("LPII_T2_JIMENEZAROTINCODARIKSON");
		//manejador de entidades segun unidad de persistencia....
		EntityManager em = conex.createEntityManager();
		//************realizamos el proceso.....
		    //iniciar la transaccion...
		em.getTransaction().begin();
		    //registramos datos...
		    //si fuera JDBC seria insert into TBL_PRODUCTOT2 values......
		em.persist(producto);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
	
	} //fin del metodo registrar....

	
	public void actualizarProducto(ProductoT2 producto) {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("LPII_T2_JIMENEZAROTINCODARIKSON");
		//manejador de entidades segun unidad de persistencia....
		EntityManager em = conex.createEntityManager();
		//************realizamos el proceso.....
		    //iniciar la transaccion...
		em.getTransaction().begin();
		    //actualizar datos...
		    //si fuera JDBC seria update TBL_PRODUCTOT2 set ...
		em.merge(producto);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	} //fin del metodo actualizar...

	
	public void eliminarProducto(ProductoT2 producto) {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("LPII_T2_JIMENEZAROTINCODARIKSON");
		//manejador de entidades segun unidad de persistencia....
		EntityManager em = conex.createEntityManager();
		//************realizamos el proceso.....
		    //iniciar la transaccion...
		em.getTransaction().begin();
		//recuperar el codigo a eliminar...
		ProductoT2 elim = em.merge(producto);
		//eliminando el dato de la BD.
		em.remove(elim);
		//imprimimos un mensaje por pantalla
		System.out.println("dato eliminado de la BD");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	} //fin del metodo eliminar....

	
	public List<ProductoT2> listadoProducto() {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("LPII_T2_JIMENEZAROTINCODARIKSON");
		//manejador de entidades...
		EntityManager em = conex.createEntityManager();
		//realizamos el proceso...
		    //iniciar la transaccion....
		em.getTransaction().begin();
		//aplicamos JPQL se base en entidades....
		List<ProductoT2> listado = em.createQuery("select p from ProductoT2 p", ProductoT2.class).getResultList();
		//confirmamos...
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado...
		return listado;
	
	} //fin del metodo listar.....

	
	public ProductoT2 buscarProducto(ProductoT2 producto) {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("LPII_T2_JIMENEZAROTINCODARIKSON");
		//manejador de entidades...
		EntityManager em = conex.createEntityManager();
		//realizamos el proceso...
		    //iniciar la transaccion....
		em.getTransaction().begin();
		//enviamos el codigo a buscar
		ProductoT2 buscar = em.find(ProductoT2.class, producto.getIdproductot2());
        //confirmamos
		em.getTransaction().commit();	
		//cerramos
		em.close();
		//retornamos el valor buscado				
		return buscar;
	} //fin del metodo buscar.....

} //fin de la clase....
