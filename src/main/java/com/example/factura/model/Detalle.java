package com.example.factura.model;

import java.io.Serializable;

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
@Table(name = "detalle")
public class Detalle implements Serializable{
	

	private static final long serialVersionUID = 1825655870528417460L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalle;
	
	@Id
	@ManyToOne
	@JoinColumn(name="id_factura", nullable=false, foreignKey = @ForeignKey(name = "FK_detalle_factura"))
	private Factura factura;

	@ManyToOne
	@JoinColumn(name="id_producto", nullable=false, foreignKey = @ForeignKey(name = "FK_detalle_producto"))
	private Producto producto;

	@Column(name="cantidad", nullable=false )
	private Integer cantidad;
	
	@Column(name="precio", nullable=false )
	private Integer precio;

	
	
	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
	
	
	
}
