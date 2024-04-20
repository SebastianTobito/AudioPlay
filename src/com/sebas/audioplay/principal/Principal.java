package com.sebas.audioplay.principal;

import com.sebas.audioplay.modelos.Cancion;
import com.sebas.audioplay.modelos.Favoritos;
import com.sebas.audioplay.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion primeraCancion = new Cancion();
        primeraCancion.setTitulo("Angeles fuimos");
        primeraCancion.setCantante("Adrian Barba");

        Podcast primerPodcast = new Podcast();
        primerPodcast.setPresentador("Lola Tobito");
        primerPodcast.setTitulo("Cómo lavar tus patitas");

        for (int i = 0; i < 100; i++) {
            primeraCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            primeraCancion.reproducir();
        }

        for (int i = 0; i < 500; i++) {
            primerPodcast.meGusta();
        }
        for (int i = 0; i < 4000; i++) {
            primerPodcast.reproducir();
        }
        System.out.println("Total de reproducciones de Angeles fuimos: " + primeraCancion.getTotalDeReproduciones());
        System.out.println("Total de me gusta de Angeles fuimos: " + primeraCancion.getCantidadMeGusta());

        Favoritos favoritos = new Favoritos();
        favoritos.adicionar(primerPodcast);
        favoritos.adicionar(primeraCancion);
    }
}