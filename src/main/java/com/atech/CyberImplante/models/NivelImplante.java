package com.atech.CyberImplante.models;

public enum NivelImplante {
    S("S"),
    A("A"),
    B("B");

    private final String nivelImplante;

    NivelImplante(String nivelImplante) {
        this.nivelImplante = nivelImplante;
    }

    public String getNivelImplante(){
        return this.nivelImplante;
    }
}

