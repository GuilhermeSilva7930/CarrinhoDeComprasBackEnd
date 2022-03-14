package com.carrinho.compras.gui.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrinho.compras.gui.domain.Produto;
import com.carrinho.compras.gui.services.ProdutoService;

@RestController
@RequestMapping("produtos")
@CrossOrigin(origins = "http://localhost:3000/")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Produto> save(@RequestBody Produto produto) {
		return ResponseEntity.ok().body(service.save(produto));
	}
}
