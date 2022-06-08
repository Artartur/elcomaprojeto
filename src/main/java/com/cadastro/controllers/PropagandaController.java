package com.cadastro.controllers;

import com.cadastro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/propaganda")
public class PropagandaController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    //redireciona a pagina
    @GetMapping("")
    public String propaganda (){
        return "propaganda";
    }

}
