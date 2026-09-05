package com.atech.CyberImplante.models;

public class Implante {
    private int idImplante;
    private String nome;
    private String categoria;
    private String parteDoCorpo;;

    NivelImplante[] values = NivelImplante.values();

    public Implante (int idImplante, String nome, String categoria, String parteDoCorpo) {
        this.idImplante = idImplante;
        this.nome = nome;
        this.categoria = categoria;
        this.parteDoCorpo = parteDoCorpo;
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

    public NivelImplante[] getValues() {
        return values;
    }

    public void setValues(NivelImplante[] values) {
        this.values = values;
    }
}
