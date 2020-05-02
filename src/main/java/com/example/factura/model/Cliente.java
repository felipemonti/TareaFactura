package com.example.factura.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;

	@Size(min = 3, max = 50, message= "Nombre debe tener minimo 3 caracteres")
	@Column(name="nombre", nullable=false,  length = 50 )
	private String nombre;

	@Size(min = 3, max = 50, message= "Apellido debe tener minimo 3 caracteres")
	@Column(name="apellido", nullable=false,  length = 150 )
	private String apellido;
	
	@Size(max = 50, message= "Dirección debe tener maximo 200 caracteres")
	@Column(name="direccion", nullable=true,  length = 200 )
	private String direccion;
	
	@Column(name="fecha_nacimiento", nullable=false )
	private LocalDateTime fechaNacimiento;
	
	@Size(min = 9, max = 12, message= "Telefono debe tener minimo 9 caracteres y maximo 12 caracteres")
	@Column(name="telefono", nullable=false,  length = 12 )
	private String telefono;
	
	@Email (message = "Debe ingrear un email valido")
	@Column(name="email", nullable=true, length=55)
	private String email;

	
	
	
	
	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
}
