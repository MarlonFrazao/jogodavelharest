package br.edu.unifacear.jogodavelha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Jogada {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer posicao;
	private Boolean jogada;
	
	public Jogada() {}
	
	
	public Jogada(Integer id, Integer posicao, Boolean jogada) {
		super();
		this.id = id;
		this.posicao = posicao;
		this.jogada = jogada;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPosicao() {
		return posicao;
	}
	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}
	public Boolean getJogada() {
		return jogada;
	}
	public void setJogada(Boolean jogada) {
		this.jogada = jogada;
	}
}
