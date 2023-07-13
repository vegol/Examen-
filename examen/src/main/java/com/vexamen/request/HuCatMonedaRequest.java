package com.vexamen.request;

public class HuCatMonedaRequest {

	private int numCia;
	private String claveMoneda;
	private String descripcion;
	private String simbolo;
	private String abreviacion;
	private String monedaCorriente;
	private String status;

	public HuCatMonedaRequest() {

	}

	public HuCatMonedaRequest(int numCia, String claveMoneda, String descripcion, String simbolo, String abreviacion,
			String monedaCorriente, String status) {
		super();
		this.numCia = numCia;
		this.claveMoneda = claveMoneda;
		this.descripcion = descripcion;
		this.simbolo = simbolo;
		this.abreviacion = abreviacion;
		this.monedaCorriente = monedaCorriente;
		this.status = status;
	}

	public int getNumCia() {
		return numCia;
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

}
