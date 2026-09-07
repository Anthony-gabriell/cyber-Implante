package com.atech.CyberImplante.controller;

import com.atech.CyberImplante.models.Implante;
import com.atech.CyberImplante.service.ImplanteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // define que esta classe é um controlador API REST
@RequestMapping("/implantes") // define a rota base e a comuicação com o mundo
public class ImplanteController {

    // injetamos o service para usar a loigca de neocio
    private final ImplanteService implanteService;

    // chamaos o construtor para injecao de dependecia
    public ImplanteController(ImplanteService implanteService){
        this.implanteService = implanteService;
    }

    @PostMapping("/{idImplante}/usuario/{idUsuario}/instalar")// post para criar um implante e id
    public ResponseEntity<Implante> instalarImplante(@PathVariable Long idImplante, @PathVariable Long idUsuario){ // pathvariable extrai o id da URL
        Implante instalado = implanteService.instalarImplante(idImplante, idUsuario);
        return ResponseEntity.status(201).body(instalado);
    }

    @GetMapping
    public ResponseEntity<List<Implante>> listarImplante(){
        List<Implante> lista = implanteService.listarImplante();
        return ResponseEntity.ok(lista);
    }

    @DeleteMapping("/{idImplante}/usuario/{idUsuario}/deletar")
    public ResponseEntity<Void> removerImplante(@PathVariable Long idImplante, @PathVariable Long idUsuario){
        implanteService.removerImplante(idImplante, idUsuario);
        return ResponseEntity.status(204).build();
    }








}


// for-each para cada tarefa dentro da lista
//for (Implante implante : todosImplantes){
//System.out.println(implante.getIdImplante() + " - " + implante.getNome() + " - " + implante.getCategoria() + " - " + implante.getParteDoCorpo());


