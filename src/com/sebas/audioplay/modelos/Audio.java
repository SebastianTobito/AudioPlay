package com.sebas.audioplay.modelos;

public class Audio {

       private String titulo;
       private int duracion;
       private int cantidadMeGusta;
       private int clasificacion;
       private int totalDeReproduciones;


    public void meGusta(){
        this.cantidadMeGusta++;
    }

    public void reproducir(){
        this.totalDeReproduciones++;
    }



    public int getTotalDeReproduciones() {
        return totalDeReproduciones;
    }

    public void setTotalDeReproduciones(int totalDeReproduciones) {
        this.totalDeReproduciones = totalDeReproduciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public void setCantidadMeGusta(int cantidadMeGusta) {
        this.cantidadMeGusta = cantidadMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }


}
