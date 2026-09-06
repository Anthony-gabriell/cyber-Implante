package com.atech.CyberImplante.repository;

// Abaixo eu tengo os Imports as anotações do banco de dados
import com.atech.CyberImplante.models.Implante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que esta interface é responsável pelo acesso aos dados
public interface ImplanteRepository extends JpaRepository<Implante, Long> {
}

// JpaRepository<Implante, Long> significa:
// "Vou gerenciar a entidade Implante e a chave primária (ID) dela é do tipo Long"
// Não precisamos escrever metodos, ne referencias aqui, eles já nascem ao extender a interface.
