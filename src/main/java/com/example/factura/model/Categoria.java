package com.example.factura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="categoria")
public class Categoria {

	@Id
	private Integer idCategoria;

	@Size(min = 3, max = 50, message= "Nombre debe tener minimo 3 caracteres")
	@Column(name="nombre", nullable=false, unique = true, length = 50 )
	private String nombre;
	
	@Size(min = 3, max = 200, message= "Descripción debe tener minimo 3 caracteres")
	@Column(name="descripcion", nullable=false, unique = true, length = 200 )
	private String descripcion;

	
	
	
	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
