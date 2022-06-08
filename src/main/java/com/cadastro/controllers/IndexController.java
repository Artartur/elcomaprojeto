package com.cadastro.controllers;

import com.cadastro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//mostra ao spring que vai ser um controller
@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	//redireciona a pagina index
	@GetMapping("/")
	public String index (){
		return "index";
	}
}
