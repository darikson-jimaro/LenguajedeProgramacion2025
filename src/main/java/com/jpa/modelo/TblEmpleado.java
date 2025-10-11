package com.jpa.modelo;

<<<<<<< HEAD
=======


>>>>>>> 7ce5f6c0191623ae3c29b58c3ef2caab412c32d9
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.eclipse.persistence.internal.jpa.parsing.TemporalLiteralNode.TemporalType;

<<<<<<< HEAD
@Entity //ejemplo de JPA....
@Table(name="tbl_empleado") //ejemplo de JPA.....
public class TblEmpleado {

	//declaramos los atributos...
	@Id  //ejemplo de  JPA....
	@GeneratedValue(strategy=GenerationType.IDENTITY) //ejemplo de JPA....
=======
@Entity
@Table(name="tbl_empleado") //ejemplo de JPA.....
public class TblEmpleado {
	
	//declaramos los atributos
	@Id //Ejemplo de JPA
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Ejemplo de JPA
>>>>>>> 7ce5f6c0191623ae3c29b58c3ef2caab412c32d9
	private int idempleado;
	private String nombre;
	private String apellido;
	private String dni;
	private String email;
	private String sexo;
	private String telf;
<<<<<<< HEAD
	//anotacion para fecha....
	//@Temporal(TemporalType.DATE)
	private Date fechanac;
=======
	//Anotacion para fecha...
	//@Temporal(TemporalType.DATE)
	private Date fechanac;
	
	
	
>>>>>>> 7ce5f6c0191623ae3c29b58c3ef2caab412c32d9
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTelf() {
		return telf;
	}
	public void setTelf(String telf) {
		this.telf = telf;
	}
	public Date getFechanac() {
		return fechanac;
	}
	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}
<<<<<<< HEAD
=======
	
	
>>>>>>> 7ce5f6c0191623ae3c29b58c3ef2caab412c32d9
	public TblEmpleado(int idempleado, String nombre, String apellido, String dni, String email, String sexo,
			String telf, Date fechanac) {
		//super();
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.sexo = sexo;
		this.telf = telf;
		this.fechanac = fechanac;
<<<<<<< HEAD
	} //fin del constructor...
	public TblEmpleado() {
		//super();
	} //fin del constructor....
	
	
	
	
	
	
} //fin de la clase....
=======
		
	} //fin del constructor
	
	//Constructor vacio
	
	public TblEmpleado() {
		//super();
	}
	
	
} // fin de la clase...
>>>>>>> 7ce5f6c0191623ae3c29b58c3ef2caab412c32d9
