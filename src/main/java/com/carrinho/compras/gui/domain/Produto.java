package com.carrinho.compras.gui.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String prato;
	private String foto;
	private String descricao;
	private Double preco;
	
	public Produto() {
	}

	public Produto(Long id, String prato, String foto, String descricao, Double preco) {
		super();
		this.id = id;
		this.prato = prato;
		this.foto = foto;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrato() {
		return prato;
	}

	public void setPrato(String prato) {
		this.prato = prato;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
