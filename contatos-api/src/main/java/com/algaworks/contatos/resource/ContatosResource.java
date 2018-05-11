package com.algaworks.contatos.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.contatos.model.Contato;
import com.algaworks.contatos.repository.Contatos;

@RestController
@RequestMapping("/contatos")
@CrossOrigin("*")
public class ContatosResource {
	
	@Autowired
	private Contatos contatos;
	
	@GetMapping
	public List<Contato> listar() {
		return contatos.findAll();
	}

	@PostMapping
	public Contato criar(@Valid @RequestBody Contato contato) {
		return contatos.save(contato);
	}
}
