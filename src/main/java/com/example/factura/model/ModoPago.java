package com.example.factura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "modo_pago")
public class ModoPago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numPago;
	
	@Size(min = 3, max = 50, message= "Nombre debe tener minimo 3 caracteres")
	@Column(name="nombre", nullable=false,  length = 50 )
	private String nombre;

	@Column(name="otros_detalles", nullable=true,  length = 200 )
	private String otrosDetalles;

	
	
	
	public Integer getNumPago() {
		return numPago;
	}

	public void setNumPago(Integer numPago) {
		this.numPago = numPago;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOtrosDetalles() {
		return otrosDetalles;
	}

	public void setOtrosDetalles(String otrosDetalles) {
		this.otrosDetalles = otrosDetalles;
	}

	
	
	

}
