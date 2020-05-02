package com.example.factura.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.factura.model.Factura;

public interface IFacturaRepo extends JpaRepository<Factura, Integer>{

}
