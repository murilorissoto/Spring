package com.example.Murilo.Antunes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Murilo.Antunes.entities.Cliente;
import com.example.Murilo.Antunes.servicies.service;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	private final service Service;

	@Autowired
	public ClienteController(service Service) {
		this.Service = Service;
	}
	
	@PostMapping
	public Cliente createCliente (@RequestBody Cliente cliente) {
		return Service.saveCliente(cliente);
	}
	
	@GetMapping("/{id}")
	public Cliente getCliente(@PathVariable Long idcCliente) {
		return Service.getCliente(idcCliente);
	}
	
	@GetMapping 
	public List<Cliente> getAllCliente() {
		return Service.getAllCliente();
	}

	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long idcCliente) {
		Service.deleteCliente(idcCliente);
	}
}
