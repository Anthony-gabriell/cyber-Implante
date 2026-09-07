package com.atech.CyberImplante.controller;

import com.atech.CyberImplante.models.Usuario;
import com.atech.CyberImplante.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController // define que esta classe é um controlador API REST
@RequestMapping("/usuario") // define a rota base e a comuicação com o mundo
public class UsuarioController {

    // injetamos o service para usar a loigca de neocio
    private final UsuarioService usuarioService;

    // chamaos o construtor para injecao de dependecia
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @PostMapping
    public ResponseEntity<Usuario> adicionarUsuario(@RequestBody Usuario usuario) {
        Usuario adicionado = usuarioService.adicionarUsuario(usuario);
        return ResponseEntity.status(201).body(adicionado);
    }
}


