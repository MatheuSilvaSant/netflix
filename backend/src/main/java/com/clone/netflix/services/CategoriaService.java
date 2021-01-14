package com.clone.netflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.netflix.domain.Categoria;
import com.clone.netflix.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {

	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Long id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
