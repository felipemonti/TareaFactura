package com.example.factura.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numFactura;
	
	@Column(name="fecha", nullable=false )
	private LocalDateTime fecha;

	@ManyToOne
	@JoinColumn(name="num_pago", nullable=false, foreignKey = @ForeignKey(name = "FK_factura_modo_pago"))
	private ModoPago modoPago;

	@ManyToOne
	@JoinColumn(name="id_cliente", nullable=false, foreignKey = @ForeignKey(name = "FK_factura_cliente"))
	private Cliente cliente;

	
	
	
	
	public Integer getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(Integer numFactura) {
		this.numFactura = numFactura;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public ModoPago getModoPago() {
		return modoPago;
	}

	public void setModoPago(ModoPago modoPago) {
		this.modoPago = modoPago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
}
