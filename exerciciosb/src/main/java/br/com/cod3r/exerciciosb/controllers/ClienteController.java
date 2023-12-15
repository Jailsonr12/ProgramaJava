package br.com.cod3r.exerciciosb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciosb.model.entities.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@GetMapping("/qualquer")
	public Cliente obterClient() {
		return new Cliente(28,"Pedro","123.432.534-23");
	}
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente (id, "maria", "894.432.540-32");
	}
	
	@GetMapping()
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente (id, "Jailson", "123.123.123-32");
	}

}
