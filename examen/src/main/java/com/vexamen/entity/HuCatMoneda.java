package com.vexamen.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HU_CAT_MONEDA")
public class HuCatMoneda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLAVE_MONEDA", columnDefinition = "NVARCHAR2(3)")
    private String claveMoneda;

	@Column(name = "NUM_CIA", columnDefinition = "NUMBER(4)")
	private int numCia;

	@Column(name = "DESCRIPCION", columnDefinition = "NVARCHAR2(30)")
	private String descripcion;

	@Column(name = "SIMBOLO", columnDefinition = "NVARCHAR2(5)")
	private String simbolo;

	@Column(name = "ABREVIACION", columnDefinition = "NVARCHAR2(5)")
	private String abreviacion;

	@Column(name = "MONEDA_CORRIENTE", columnDefinition = "NVARCHAR2(1)")
	private String monedaCorriente;

	@Column(name = "STATUS", columnDefinition = "NVARCHAR2(1)")
	private String status;

	public int getNumCia() {
		return numCia;
	}

	public HuCatMoneda(String claveMoneda) {
		super();
		this.claveMoneda = claveMoneda;
	}

	public HuCatMoneda() {
		// TODO Auto-generated constructor stub
	}

	public void setNumCia(int numCia) {
		this.numCia = numCia;
	}

	public String getClaveMoneda() {
		return claveMoneda;
	}

	public void setClaveMoneda(String claveMoneda) {
		this.claveMoneda = claveMoneda;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getAbreviacion() {
		return abreviacion;
	}

	public void setAbreviacion(String abreviacion) {
		this.abreviacion = abreviacion;
	}

	public String getMonedaCorriente() {
		return monedaCorriente;
	}

	public void setMonedaCorriente(String monedaCorriente) {
		this.monedaCorriente = monedaCorriente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


		
	}


