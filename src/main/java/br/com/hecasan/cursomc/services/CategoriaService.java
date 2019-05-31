package br.com.hecasan.cursomc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.hecasan.cursomc.domain.Categoria;
import br.com.hecasan.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}

}
