package com.jpa.test;

import java.util.Date;
import java.util.List;

import com.jpa.dao.ProductoDAO;
import com.jpa.modelo.ProductoT2;

public class TestProductoT2 {

	public static void main(String[] args) {

		//instanciamos la clase del CRUD...
		ProductoDAO crud = new ProductoDAO();

		//REGISTRAR
		System.out.println(" REGISTRAR PRODUCTO");
		ProductoT2 p1 = new ProductoT2();
		p1.setNombret2("Paracetamol 500mg");
		p1.setPreciot2(2.5);
		p1.setCantidadt2(100);
		p1.setNrolotet2("L001A");
		p1.setDescripciont2("Tabletas para el dolor y fiebre");
		p1.setEstadot2("Activo");
		p1.setFechafabrit2(new Date());
		p1.setFechavencimt2(new Date());
		crud.registrarProducto(p1);
		System.out.println("Producto registrado correctamente\n");

		/*//LISTAR 
		System.out.println(" LISTAR PRODUCTOS ");
		List<ProductoT2> lista = crud.listadoProducto();
		for (ProductoT2 prod : lista) {
			System.out.println(prod.getIdproductot2() + " | " + prod.getNombret2() + " | " + prod.getPreciot2());
		}
		System.out.println();

		// BUSCAR 
		System.out.println(" BUSCAR PRODUCTO");
		if (!lista.isEmpty()) {
			ProductoT2 buscado = new ProductoT2();
			buscado.setIdproductot2(lista.get(0).getIdproductot2()); //toma el primero de la lista
			ProductoT2 encontrado = crud.buscarProducto(buscado);
			if (encontrado != null) {
				System.out.println("Encontrado: " + encontrado.getNombret2() + " - Precio: " + encontrado.getPreciot2());
			}
		}
		System.out.println();

		//ACTUALIZAR 
		System.out.println(" ACTUALIZAR PRODUCTO");
		if (!lista.isEmpty()) {
			ProductoT2 actualizar = lista.get(0);
			actualizar.setPreciot2(3.0);
			crud.actualizarProducto(actualizar);
			System.out.println("Producto actualizado correctamente\n");
		}

		//ELIMINAR
		System.out.println("ELIMINAR PRODUCTO");
		if (!lista.isEmpty()) {
			ProductoT2 eliminar = lista.get(0);
			crud.eliminarProducto(eliminar);
			System.out.println("Producto eliminado correctamente\n");
		}*/

		
	}
}
