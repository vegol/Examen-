package com.vexamen.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HU_EMPLS")
public class HuEmpls implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "NUM_EMP", columnDefinition = "NUMBER")
	private int empleado;
	@Column(name = "NUM_CIA", columnDefinition = "NUMBER")
	private int cia;
	@Column(name = "FECHA_INGRESO", columnDefinition = "DATE")
	private LocalDate fechaInicio;
	@Column(name = "FECHA_BAJA", columnDefinition = "DATE")
	private LocalDate fechaTermino;

	public int getEmpleado() {
		return empleado;
	}

	public void setEmpleado(int empleado) {
		this.empleado = empleado;
	}

	public int getCia() {
		return cia;
	}

	public void setCia(int cia) {
		this.cia = cia;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(LocalDate fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

}
