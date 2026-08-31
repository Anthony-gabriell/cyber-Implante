package com.atech.CyberImplante.models;

public class Implante {
    private int idImplante;
    private String nome;
    private String categoria;
    private String parteDoCorpo;
    private int risco;

    public Implante (int idImplante, String nome, String categoria, String parteDoCorpo, int risco) {
        this.idImplante = idImplante;
        this.nome = nome;
        this.categoria = categoria;
        this.parteDoCorpo = parteDoCorpo;
        this.risco = risco;
    }
    // JPA/spring para o banco de dados exige que  classe tenha um construtor vazio
    public Implante(){}

    // getters coletores setters seletores
    public int getIdImplante() {
        return idImplante;
    }

    public void setIdImplante(int idImplante) {
        this.idImplante = idImplante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getParteDoCorpo() {
        return parteDoCorpo;
    }

    public void setParteDoCorpo(String parteDoCorpo) {
        this.parteDoCorpo = parteDoCorpo;
    }

    public int getRisco() {
        return risco;
    }

    public void setRisco(int risco) {
        this.risco = risco;
    }
}
