package com.jpa.test;

import java.util.Date;
import java.util.List;

import java.text.SimpleDateFormat;

import com.jpa.dao.ClassCrudEmpleadoImp;
import com.jpa.modelo.TblEmpleado;

public class TestEmpleado {

	public static void main(String[] args) {
		//realizamos la respectiva instancia...
		ClassCrudEmpleadoImp crud=new ClassCrudEmpleadoImp();
		TblEmpleado emp=new TblEmpleado();
		  //insertamos datos....
		emp.setNombre("iban jorge");
		emp.setApellido("ramirez");
		emp.setDni("10356669");
		emp.setEmail("luis@gmail.com");
		emp.setSexo("m");
		emp.setTelf("35554689");
		 Date fecha=new Date();
		 Date fechasql=new Date(fecha.getTime());
		emp.setFechanac(fechasql); 
		
		// Empleado 2
        TblEmpleado emp2 = new TblEmpleado();
        emp2.setNombre("ana maria");
        emp2.setApellido("perez");
        emp2.setDni("20445588");
        emp2.setEmail("ana@gmail.com");
        emp2.setSexo("f");
        emp2.setTelf("99887766");
        Date fecha2 = new Date();
        emp2.setFechanac(new java.sql.Date(fecha2.getTime()));
        crud.registrarEmpleado(emp2);
        System.out.println("Empleado 2 registrado en BD ****");

        // Empleado 3
        TblEmpleado emp3 = new TblEmpleado();
        emp3.setNombre("carlos");
        emp3.setApellido("sanchez");
        emp3.setDni("30112233");
        emp3.setEmail("carlos@gmail.com");
        emp3.setSexo("m");
        emp3.setTelf("944556677");
        Date fecha3 = new Date();
        emp3.setFechanac(new java.sql.Date(fecha3.getTime()));
        crud.registrarEmpleado(emp3);
        System.out.println("Empleado 3 registrado en BD ****");

        // Empleado 4
        TblEmpleado emp4 = new TblEmpleado();
        emp4.setNombre("lucia");
        emp4.setApellido("torres");
        emp4.setDni("40998877");
        emp4.setEmail("lucia@gmail.com");
        emp4.setSexo("f");
        emp4.setTelf("933112244");
        Date fecha4 = new Date();
        emp4.setFechanac(new java.sql.Date(fecha4.getTime()));
        crud.registrarEmpleado(emp4);
        System.out.println("Empleado 4 registrado en BD ****");

        // Empleado 5
        TblEmpleado emp5 = new TblEmpleado();
        emp5.setNombre("pedro");
        emp5.setApellido("mendoza");
        emp5.setDni("51234567");
        emp5.setEmail("pedro@gmail.com");
        emp5.setSexo("m");
        emp5.setTelf("911223344");
        Date fecha5 = new Date();
        emp5.setFechanac(new java.sql.Date(fecha5.getTime()));
        crud.registrarEmpleado(emp);
      
		//invocamos el metodo registrar...
		crud.registrarEmpleado(emp);
		//enviamos mensaje por pantalla
		System.out.println("datos registrados en BD ****");
		
	
		
		// *********testeando el eliminar.....
	/*		emp.setIdempleado(1);
			//invocamos el metodo eliminar
			crud.eliminarEmpleado(emp);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// *********testeando el listado.....
		List<TblEmpleado> listaempleado=crud.listadoEmpleado();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 //aplicamos un bucle....
		for(TblEmpleado lista:listaempleado){
			//imprimimos por pantalla
			System.out.println("nombre "+lista.getNombre()+
					" apellido "+lista.getApellido()+" dni "+
					lista.getDni()+" email "+lista.getEmail()+
					" sexo "+lista.getSexo()
				+" telefono "+lista.getTelf()+
					" fechanaci "+sdf.format(lista.getFechanac()));
		} //fin del bucle for....

	} //fin del metodo principal.....

} //fin de la clase....
