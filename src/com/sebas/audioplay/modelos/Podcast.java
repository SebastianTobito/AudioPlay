package com.sebas.audioplay.modelos;

public class Podcast extends Audio{

    private String tema;
    private String presentador;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if(getTotalDeReproduciones()>=200){
            return 9;
        }else{
            return 3;
        }
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
