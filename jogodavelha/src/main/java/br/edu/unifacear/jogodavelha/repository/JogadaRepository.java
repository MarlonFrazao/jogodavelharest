package br.edu.unifacear.jogodavelha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifacear.jogodavelha.entity.Jogada;

public interface JogadaRepository extends JpaRepository<Jogada, Integer>{
	
}
