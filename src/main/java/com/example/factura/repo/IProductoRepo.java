package com.example.factura.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.factura.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer> {

}
