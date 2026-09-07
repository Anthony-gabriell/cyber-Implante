package com.atech.CyberImplante.repository;

import com.atech.CyberImplante.models.ImplantesUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImplantesUsuarioRepository extends JpaRepository<ImplantesUsuario, Long> {
}
