package com.example.factura.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.factura.model.ModoPago;
import com.example.factura.repo.IModoPagoRepo;
import com.example.factura.service.IModoPagoService;

public class ModoPagoServiceImpl implements IModoPagoService{


	@Autowired
	private IModoPagoRepo repo;

	@Override
	public ModoPago registrar(ModoPago obj) {
		return repo.save(obj);
	}

	@Override
	public ModoPago modificar(ModoPago obj) {
		return repo.save(obj);
	}

	@Override
	public List<ModoPago> listar() {
		return repo.findAll();
	}

	@Override
	public ModoPago leerPorId(Integer id) {
		Optional<ModoPago> op = repo.findById(id);
		return op.isPresent() ? op.get() : new ModoPago();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	} 
	
	
	
}
