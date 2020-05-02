package com.example.factura.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.factura.model.ModoPago;

public interface IModoPagoRepo extends JpaRepository<ModoPago, Integer> {

}
