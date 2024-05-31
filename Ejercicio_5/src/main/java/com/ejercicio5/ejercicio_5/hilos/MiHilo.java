/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio5.ejercicio_5.hilos;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import com.ejercicio5.ejercicio_5.ConjuntoPalabras;

/**
 *
 * @author Baltasar
 */
public class MiHilo extends Thread {
    private String numeroHilo;
    private String rutaArchivo;
    private ConjuntoPalabras datos;

    public MiHilo(String rutaArchivo, String numeroHilo, ConjuntoPalabras datos) {
        this.numeroHilo = numeroHilo;
        this.rutaArchivo = rutaArchivo;
        this.datos = datos;
    }


    public String limpiarSignos(String texto){
        texto = texto.replaceAll("[^a-zA-Z0-9]", " ");
        return texto;
    }

    
    public String limpiarStopWords(String[] texto){ 
        String[] stopWords = {"a", "el", "la", "los", "las", "y", "o", "u", "de", "del", "al", "en", "con", "por", "para", "si", "no", "ni", "pero", "aunque", "sin", "sobre", "tras", "durante", "mientras", "cuando", "donde", "quien", "cual", "cuyo", "cuya", "cuyos", "cuyas", "que", "cual", "cuyas", "cuyos", "cuya", "cuyas", "cuyo", "cuyos"};
        Set<String> stopWordsSet = Arrays.stream(stopWords).collect(Collectors.toSet());

        String textoLimpio = Arrays.stream(texto)
            .filter(word -> !stopWordsSet.contains(word))
            .collect(Collectors.joining(" "));

        return textoLimpio;
    }

}
