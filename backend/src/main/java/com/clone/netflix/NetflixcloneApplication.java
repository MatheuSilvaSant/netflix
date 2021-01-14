package com.clone.netflix;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clone.netflix.domain.Categoria;
import com.clone.netflix.repositories.CategoriaRepository;

@SpringBootApplication
public class NetflixcloneApplication implements CommandLineRunner {

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NetflixcloneApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception {
		
		Categoria cat1 = new Categoria(null,"Terror");
		Categoria cat2 = new Categoria(null,"Ação");
		Categoria cat3 = new Categoria(null,"Ficção-Cientifica");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
	}

}
