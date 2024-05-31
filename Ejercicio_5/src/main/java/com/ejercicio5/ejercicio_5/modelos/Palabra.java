/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio5.ejercicio_5.modelos;

/**
 *
 * @author Baltasar
 */
public class Palabra {
    private String palabra;
    private int cantidadVeces;

    public Palabra(String palabra, int cantidadVeces) {
        this.palabra = palabra;
        this.cantidadVeces = cantidadVeces;
    }

    public String getPalabra() {
        return palabra;
    }

    public int getCantidadVeces() {
        return cantidadVeces;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setCantidadVeces(int cantidadVeces) {
        this.cantidadVeces = cantidadVeces;
    }
    
}
