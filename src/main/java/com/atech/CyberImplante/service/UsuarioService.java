package com.atech.CyberImplante.service;

import com.atech.CyberImplante.models.Usuario;
import com.atech.CyberImplante.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    // final para garantir que a depedencia nao mude apos ser injetada
    private final UsuarioRepository usuarioRepository;

    // injeção de dependencia via construtor (alterantiva @Autowired)
    public UsuarioService (UsuarioRepository usuarioRepository){
    this.usuarioRepository = usuarioRepository;
    }

    public Usuario adicionarUsuario( Usuario usuario){
        boolean valnome = usuario.validarNome(usuario.getNome()); // delega a validação ao próprio usuario
        if (!valnome){
            throw new RuntimeException("Nome invalido!");
        }
        return usuarioRepository.save(usuario);
    }








}

