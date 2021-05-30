package br.com.yngredhcruz.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yngredhcruz.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	
}
