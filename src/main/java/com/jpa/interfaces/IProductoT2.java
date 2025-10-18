package com.jpa.interfaces;

import java.util.List;

import com.jpa.modelo.ProductoT2;

public interface IProductoT2 {
	//declaramos los respectivos metodos...
	void registrarProducto(ProductoT2 producto);
	void actualizarProducto(ProductoT2 producto);
	void eliminarProducto(ProductoT2 producto);
	List<ProductoT2> listadoProducto();
	ProductoT2 buscarProducto(ProductoT2 producto);
} //fin de la interface.....
