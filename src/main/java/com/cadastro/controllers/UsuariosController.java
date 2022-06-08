package com.cadastro.controllers;

import com.cadastro.models.Usuario;
import com.cadastro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuariosController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("")
	public String form(Usuario usuario) {
		return "cadastro/formUsuario";
	}

	@PostMapping("/salvar")
	public String cadastrar(@ModelAttribute("usuario") Usuario usuario) {
		usuarioRepository.save(usuario);
		return "propaganda";
	}
}
