package com.atech.CyberImplante.models;

public enum NivelUsuario {
    S("S"),
    A("A"),
    B("B");

    public final String nivelUsuario;

    NivelUsuario(String nivelUsuario){
        this.nivelUsuario = nivelUsuario;
    }

    public String getNivelUsuario() {
        return this.nivelUsuario;
    }
}
