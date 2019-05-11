package br.edu.unifacear.jogodavelha.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifacear.jogodavelha.entity.Jogada;
import br.edu.unifacear.jogodavelha.repository.JogadaRepository;

@RestController
public class JogadaController {
	
	private final JogadaRepository jogadaRep;
	
	JogadaController(JogadaRepository jogadaRep) {
		this.jogadaRep = jogadaRep;
	}
	
	@PostMapping("/jogada")
	public void salvar(@RequestBody Jogada j) {
		this.jogadaRep.save(j);
	}
	
	@GetMapping("/jogada")
	public List<Jogada> listar() {
		return this.jogadaRep.findAll();
	}
	
	@GetMapping("/jogada/obter")
	public Optional<Jogada> obter(Integer id) {
		return this.jogadaRep.findById(id);
	}
	
	@PostMapping("/jogada/delete")
	public void excluir(Jogada j) {
		this.jogadaRep.deleteById(j.getId());
	}
}
