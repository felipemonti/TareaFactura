package com.example.factura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@Size(min = 3, max = 50, message= "Nombre debe tener minimo 3 caracteres")
	@Column(name="nombre", nullable=false, unique = true, length = 50 )
	private String nombre;
	
	@Column(name="precio", nullable=false )
	private Integer precio;

	@Column(name="stock", nullable=false )
	private Integer stock;
	
	@ManyToOne
	@JoinColumn(name="id_categoria", nullable=false, foreignKey = @ForeignKey(name = "FK_producto_categoria"))
	private Categoria categoria;

	
	
	
	
	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

	
	
	
	
	
}
