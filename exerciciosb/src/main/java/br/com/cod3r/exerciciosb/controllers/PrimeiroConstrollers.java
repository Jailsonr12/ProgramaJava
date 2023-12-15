package br.com.cod3r.exerciciosb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroConstrollers {

	@GetMapping(path = {"/ola", "/saudacao", "/"})
	public String ola() {
        return "Ola Spring Boot!";
    }	

}