package br.com.yngredhcruz.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yngredhcruz.myinvest.domain.Categoria;
import br.com.yngredhcruz.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
	
	
}
