package com.atech.CyberImplante.models;
import jakarta.persistence.*;


@Entity
public class ImplantesUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// o banco gera o ID automaticament
    private Long idImplantesUsuarios;
    @ManyToOne // jpa entende o relacionamento e gera a FK automaticamente
    private Usuario usuario;
    @ManyToOne
    private Implante implante;

    public ImplantesUsuario(Long idImplantesUsuarios, Usuario usuario, Implante implante){
        this.idImplantesUsuarios = idImplantesUsuarios;
        this.usuario = usuario;
        this.implante = implante;
    }

    public ImplantesUsuario(){};

    public Implante getImplante() {
        return implante;
    }

    public void setImplante(Implante implante) {
        this.implante = implante;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getIdImplantesUsuarios() {
        return idImplantesUsuarios;
    }

    public void setIdImplantesUsuarios(Long idImplantesUsuarios) {
        this.idImplantesUsuarios = idImplantesUsuarios;
    }
}
