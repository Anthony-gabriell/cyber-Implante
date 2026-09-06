package com.atech.CyberImplante.service;

import com.atech.CyberImplante.models.Implante;
import com.atech.CyberImplante.models.Usuario;
import com.atech.CyberImplante.repository.ImplanteRepository;
import com.atech.CyberImplante.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // registra esta classe como um componente de serviço do Spring
public class ImplanteService {

    // final para garantir que a depedencia nao mude apos ser injetada
    private final ImplanteRepository implanteRepository;
    private final UsuarioRepository usuarioRepository;

    // injeção de dependencia via construtor (alterantiva @Autowired)
    public ImplanteService(ImplanteRepository implanteRepository, UsuarioRepository usuarioRepository){
        this.implanteRepository = implanteRepository;
        this.usuarioRepository = usuarioRepository;
    }
    // metodo para instalar os implantes
    public Implante instalarImplante(Long idImplante, Long idUsuario){

        Implante implante = implanteRepository.findById(idImplante) // busca o implante no banco. retorna um optional um objeto que pode ou não ter valor.
                .orElseThrow(() -> new RuntimeException("Implante não encontrado")); // se vazio lanca exceção em vez de retornar null

        Usuario usuario = usuarioRepository.findById(idUsuario) // busca o usuaruo no banco retorna um optional um objeto que pode ou não ter valor.
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado")); // se nao encontrou, lança exceção, se encontrou retorna o usuario

      boolean temAcesso = usuario.validarNivel(implante.getNivel()); // delega a validação ao próprio usuario
        if (!temAcesso){
            throw new RuntimeException("Usuário não tem nível suficiente"); // persiste no banco e retorna o implante salvo com ID gerado
        }

        return implanteRepository.save(implante);

    }

    // metodo para listar implante
    public List<Implante> listarImplante(){
        // usamos findall() que vai no banco e busca tudo
        List<Implante> todosImplantes = implanteRepository.findAll();

        return todosImplantes;

    }

    // metodo para remover implantes
    public void removerImplante(Long idImplante, Long idUsuario){
        // precisamos validar s eo id exsite no banco
        if (!implanteRepository.existsById(idImplante) || !usuarioRepository.existsById(idUsuario)){
            throw new RuntimeException("Opção invalida!");
        }
        implanteRepository.deleteById(idImplante);
    }




}
