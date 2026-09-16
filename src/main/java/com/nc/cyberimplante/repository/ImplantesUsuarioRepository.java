package com.nc.cyberimplante.repository;

import com.nc.cyberimplante.models.Implante;
import com.nc.cyberimplante.models.ImplantesUsuario;
import com.nc.cyberimplante.models.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImplantesUsuarioRepository extends JpaRepository<ImplantesUsuario, Long> {
    Optional<ImplantesUsuario> findByUsuarioAndImplante(Usuario usuario, Implante implante);
}

