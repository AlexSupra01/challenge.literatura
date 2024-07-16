package com.challenge.literatura.dtos;

public enum Genero {
    ACCION ("Accion"),
    ROMANCE ("Romance"),
    CRIMEN ("Crimen"),
    COMEDIA ("Comedia"),
    DRAMA ("Drama"),
    AVENTURA ("Adventura"),
    FICCION ("Ficcion"),
    DESCONOCIDO("Desconocido");

    private String genero;

    Genero(String generoGutendex) {
        this.genero = generoGutendex;
    }

    public static Genero fromString(String text){
        for (Genero generoEnum: Genero.values()){
            if (generoEnum.genero.equals(text)){
                return generoEnum;
            }
        }
        return Genero.DESCONOCIDO;
    }

}