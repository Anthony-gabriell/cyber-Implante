package com.atech.CyberImplante.models;
import jakarta.persistence.*;


@Entity // define que esta classe será uma tabela no banco de dados
public class Implante {

    @Id // define a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)// o banco gera o ID automaticament
    private Long idImplante;
    private String nome;
    private String categoria;
    private String parteDoCorpo;
    @Enumerated(EnumType.STRING)
    private NivelImplante nivel;

    public Implante(Long idImplante, String nome, String categoria, String parteDoCorpo, NivelImplante nivel) {
        this.idImplante = idImplante;
        this.nome = nome;
        this.categoria = categoria;
        this.parteDoCorpo = parteDoCorpo;
        this.nivel = nivel;
    }


    // JPA/spring para o banco de dados exige que  classe tenha um construtor vazio
    public Implante() {
    }

    // getters coletores setters seletores
    public Long getIdImplante() {
        return idImplante;
    }

    public void setIdImplante(Long idImplante) {
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

    public NivelImplante getNivel() {
        return nivel;
    }

    public void setNivel(NivelImplante nivel) {
        this.nivel = nivel;
    }

}


