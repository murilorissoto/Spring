package com.example.Murilo.Antunes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Murilo.Antunes.entities.Cliente;

public interface repository extends JpaRepository<Cliente, Long> {
	
}
