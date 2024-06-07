/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio5.ejercicio_5;
import com.ejercicio5.ejercicio_5.modelos.Palabra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Baltasar
 */
public class ConjuntoPalabras {
    List<Palabra> palabras;

    public ConjuntoPalabras() {
        palabras = new ArrayList<>();
    }

    //syncronized
    public void agregarPalabra(Palabra p){
        palabras.add(p);
    }
    
    public Palabra buscarPalabra(String PalabraBuscada){
        for (Palabra palabra : palabras) {
            if (palabra.getPalabra().equals(PalabraBuscada)) {
                return palabra;
            }
        }
        return null;
    }

    public void mostrar() {
        System.out.println("-------------------------------");
        System.out.println("Lista de palabras y frecuencias");
        System.out.println("-------------------------------");
        for (Palabra palabra : palabras) {
            System.out.printf("Palabra: %-20s Frecuencia: %d%n", palabra.getPalabra(), palabra.getCantidadVeces());
        }
        System.out.println("-------------------------------");
    }
    
    public void incrementar(Palabra p){
        for (Palabra palabra : palabras) {
            if (palabra.getPalabra().equals(p.getPalabra())) {
                palabra.setCantidadVeces(palabra.getCantidadVeces() + 1);
            }
        }
    }
}
