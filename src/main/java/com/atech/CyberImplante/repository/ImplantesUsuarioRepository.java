package com.atech.CyberImplante.repository;

import com.atech.CyberImplante.models.Implante;
import com.atech.CyberImplante.models.ImplantesUsuario;
import com.atech.CyberImplante.models.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImplantesUsuarioRepository extends JpaRepository<ImplantesUsuario, Long> {
    Optional<ImplantesUsuario> findByUsuarioAndImplante(Usuario usuario, Implante implante);
}

