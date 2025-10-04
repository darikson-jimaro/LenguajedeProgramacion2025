package com.jpa.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.jpa.dao.ClassCrudEmpleadoImp;
import com.jpa.modelo.TblEmpleado;

public class TestEmpleado {

	public static void main(String[] args) {
		//realizamos la respectiva instancia
		ClassCrudEmpleadoImp crud= new ClassCrudEmpleadoImp();
		TblEmpleado tbl= new TblEmpleado();
		//tbl.setNombre("Brahim");
		//tbl.setApellido("Palmer");
		//tbl.setDni("108477");
		//tbl.setEmail("brahim_palmer9@gmail.com");
		//tbl.setSexo("m");
		//tbl.setTelf("911111455");
		 //Date fecha= new Date();
		 //Date fechasql= new Date(fecha.getYear());
		
		//tbl.setFechanac(fechasql);
		
		//crud.registrarEmpleado(tbl);
		//enviar mensaje por pantalla
		//System.out.println("Datos registrados en BD correctamente");
	
		//---Test Listado empleado--
		List<TblEmpleado> listaempleado= crud.listadoEmpleado();
		SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd");
		//aplicamos un bucle
		for(TblEmpleado lista: listaempleado){
			String fechaformateda= data.format(lista.getFechanac());
			//imprimimos por pantalla
			System.out.println("nombre : "+ lista.getNombre()+" // apellido: " + lista.getApellido()+  "//  dni :"+
					lista.getDni() +  " //sexo : "+ lista.getSexo()+ " //email: "  + lista.getEmail() + " // telefono : " + lista.getTelf()
					+ " //fecha de nacimiento : " + fechaformateda);
		} //fin del bucle for
		
		
	}	//Fin del metodo Main

}	//Fin de la clase..
