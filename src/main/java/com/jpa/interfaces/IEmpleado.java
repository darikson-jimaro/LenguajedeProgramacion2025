package com.jpa.interfaces;

import java.util.List;

import com.jpa.modelo.TblEmpleado;

public interface IEmpleado {
//declaramos los respectivos metodos...
	void registrarEmpleado(TblEmpleado tblempleado);
	void actualizarEmpleado(TblEmpleado tblempleado);
	void eliminarEmpleado(TblEmpleado tblempleado);
	List<TblEmpleado> listadoEmpleado();
	TblEmpleado buscarEmpleado(TblEmpleado tblempleado);
} //fin de la interface.....
