package com.example.factura.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.factura.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {

}
