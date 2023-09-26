package com.example.Murilo.Antunes.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Murilo.Antunes.entities.Cliente;
import com.example.Murilo.Antunes.repositories.repository;

@Service
public class service {
	
	private final repository Repository;
	
	@Autowired
	public service( repository repository) {
		this.Repository = repository;
	}
	
	public Cliente saveCliente (Cliente Cliente) {
		return Repository.save(Cliente);
	}
	
	public Cliente getCliente (Long id) {
		return Repository.findById(id).orElse(null);
	}
	
	public List<Cliente> getAllCliente(){
		return Repository.findAll();
	}
	
	public void deleteCliente (Long id) {
		Repository.deleteById(id);
	}

}

