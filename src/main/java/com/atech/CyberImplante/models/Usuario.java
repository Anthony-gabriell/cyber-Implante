package com.atech.CyberImplante.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // define que esta classe será uma tabela no banco de dados
public class Usuario {

    @Id // define a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // o banco gera o ID automaticament
    private Long idUsuario;
    private String nome;
    private NivelUsuario nivel; // enum fica como se fosse um tipo (string ou int)

    public Usuario(Long idUsuario, String nome, NivelUsuario nivel) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.nivel = nivel; // atribuimos o enum diretamente
    }

    // JPA/spring para o banco de dados exige que  classe tenha um construtor vazio
    public Usuario() {
    }

    // getters coletores
    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public NivelUsuario getNivel() {
        return nivel;
    }

    // setters seletores
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(NivelUsuario nivel) {
        this.nivel = nivel;
    }

    // retornar um boolean
    public boolean validarNome(String nome) {
        if (nome.isEmpty()) return false; // nome nao pode ficar vazio
        if (nome.length() < 4) return false; // nome nao pode menos que 4 caracteres
        if (nome.matches("\\d+")) return false; // nome nao pode ser somente numertos
        return true;
    }

    // recebe o nivel do implante, valida com o nivel do usuario
    public boolean validarNivel(NivelImplante nivelImplante) {
        switch (this.nivel) {
            case S:
                return true; // nivel S pode acessar qualquer coisa
            case A:
                return nivelImplante != NivelImplante.S; // nivel A acessa tudo menos S
            case B:
                return nivelImplante == NivelImplante.B;// nivel B acessa so B
            default:
                return false;
        }
    }
}
