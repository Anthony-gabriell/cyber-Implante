package com.atech.CyberImplante.models;

public class Usuario {
    private int idUsuario;
    private String nome;

    public Usuario (int idUsuario, String nome) {
        this.idUsuario = idUsuario;
        this.nome = nome;
    }

    NivelUsuario[] values = NivelUsuario.values();

    // JPA/spring para o banco de dados exige que  classe tenha um construtor vazio
    public Usuario(){}

    // getters coletores
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public NivelUsuario[] getValues() {
        return values;
    }

    // setters seletores
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValues(NivelUsuario[] values) {
        this.values = values;
    }
}
