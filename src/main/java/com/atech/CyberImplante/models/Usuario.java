package com.atech.CyberImplante.models;

public class Usuario {
    private int idUsuario;
    private String nome;
    private int nivel;

    public Usuario (int idUsuario, String nome, int nivel) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.nivel = nivel;
    }

    // JPA/spring para o banco de dados exige que  classe tenha um construtor vazio
    public Usuario(){}

    // getters coletores
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }
    // setters seletores
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
