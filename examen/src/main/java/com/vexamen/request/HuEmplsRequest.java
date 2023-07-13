package com.vexamen.request;

public class HuEmplsRequest {

	private int numCia;
	private int numEmpleado;
	
	
	public HuEmplsRequest(int numCia, int numEmpleado) {
		super();
		this.numCia = numCia;
		this.numEmpleado = numEmpleado;
	}
	public int getNumCia() {
		return numCia;
	}
	public void setNumCia(int numCia) {
		this.numCia = numCia;
	}
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	
}
