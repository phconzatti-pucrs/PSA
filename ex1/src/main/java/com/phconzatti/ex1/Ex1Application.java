package com.phconzatti.ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phconzatti.ex1.Entidades.Produto;
import com.phconzatti.ex1.Entidades.Usuario;
import com.phconzatti.ex1.Servico.VendaValor;

@SpringBootApplication
public class Ex1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex1Application.class, args);	
		Produto p = new Produto (1, "a", 1, 30, "alcoolica");
		Usuario u = new Usuario (2, "Pedro", 24, 0);
		VendaValor vv = new VendaValor();

		vv.valorCompra(u, p);
	}

}
