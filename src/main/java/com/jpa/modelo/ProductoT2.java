package com.jpa.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.eclipse.persistence.internal.jpa.parsing.TemporalLiteralNode.TemporalType;

@Entity //ejemplo de JPA....
@Table(name="tbl_productot2") //ejemplo de JPA.....
public class ProductoT2 {

	//declaramos los atributos...
	@Id  //ejemplo de JPA....
	@GeneratedValue(strategy=GenerationType.IDENTITY) //ejemplo de JPA....
	private int idproductot2;
	private String nombret2;
	private double preciot2;
	private double cantidadt2;
	private String nrolotet2;
	private String descripciont2;
	private String estadot2;
	//@Temporal(TemporalType.DATE)
	private Date fechavencimt2;
	//@Temporal(TemporalType.DATE)
	private Date fechafabrit2;

	public int getIdproductot2() {
		return idproductot2;
	}
	public void setIdproductot2(int idproductot2) {
		this.idproductot2 = idproductot2;
	}
	public String getNombret2() {
		return nombret2;
	}
	public void setNombret2(String nombret2) {
		this.nombret2 = nombret2;
	}
	public double getPreciot2() {
		return preciot2;
	}
	public void setPreciot2(double preciot2) {
		this.preciot2 = preciot2;
	}
	public double getCantidadt2() {
		return cantidadt2;
	}
	public void setCantidadt2(double cantidadt2) {
		this.cantidadt2 = cantidadt2;
	}
	public String getNrolotet2() {
		return nrolotet2;
	}
	public void setNrolotet2(String nrolotet2) {
		this.nrolotet2 = nrolotet2;
	}
	public String getDescripciont2() {
		return descripciont2;
	}
	public void setDescripciont2(String descripciont2) {
		this.descripciont2 = descripciont2;
	}
	public String getEstadot2() {
		return estadot2;
	}
	public void setEstadot2(String estadot2) {
		this.estadot2 = estadot2;
	}
	public Date getFechavencimt2() {
		return fechavencimt2;
	}
	public void setFechavencimt2(Date fechavencimt2) {
		this.fechavencimt2 = fechavencimt2;
	}
	public Date getFechafabrit2() {
		return fechafabrit2;
	}
	public void setFechafabrit2(Date fechafabrit2) {
		this.fechafabrit2 = fechafabrit2;
	}

	//constructor con parámetros...
	public ProductoT2(int idproductot2, String nombret2, double preciot2, double cantidadt2, String nrolotet2,
			String descripciont2, String estadot2, Date fechavencimt2, Date fechafabrit2) {
		//super();
		this.idproductot2 = idproductot2;
		this.nombret2 = nombret2;
		this.preciot2 = preciot2;
		this.cantidadt2 = cantidadt2;
		this.nrolotet2 = nrolotet2;
		this.descripciont2 = descripciont2;
		this.estadot2 = estadot2;
		this.fechavencimt2 = fechavencimt2;
		this.fechafabrit2 = fechafabrit2;
	} //fin del constructor...

	//constructor vacío...
	public ProductoT2() {
		//super();
	} //fin del constructor....
	
} //fin de la clase....
