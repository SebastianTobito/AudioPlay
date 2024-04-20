package com.sebas.audioplay.modelos;

public class Favoritos {
    public void adicionar(Audio audio){
        if(audio.getClasificacion()>= 8){
            System.out.println(audio.getTitulo()+ " es uno de los favoritos del momento");
        }else{
            System.out.println(audio.getTitulo()+ " es muy pedido por los oyentes");
        }
    }
}
