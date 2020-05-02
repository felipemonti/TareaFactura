package com.example.factura.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.factura.model.Categoria;

public interface ICategoriaRepo extends JpaRepository<Categoria, Integer>{

}
