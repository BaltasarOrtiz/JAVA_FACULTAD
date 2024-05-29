/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio2.ejercicio_2.modelos;
import com.ejercicio2.ejercicio_2.interfaces_java.IDeporte;
import java.util.ArrayList;

/**
 *
 * @author balta
 */
public class Pareja implements IDeporte{
    private Deportista deportista1;
    private Deportista deportista2;

    public Pareja(Deportista deportista1, Deportista deportista2) {
        this.deportista1 = deportista1;
        this.deportista2 = deportista2;
    }

    @Override
    public boolean conformar(ArrayList<Deportista> integrantes) {
        if (integrantes == null || integrantes.size() < CANTIDAD_MINIMA) {
            return false;
        }
        this.deportista1 = integrantes.get(0);
        this.deportista2 = integrantes.get(1);
        return true;
    }
    
    @Override
    public void mostrar() {
        System.out.println("Deportista 1: " + deportista1);
        System.out.println("Deportista 2: " + deportista2);
    }

    @Override
    public void numeroDeportista() {
        System.out.println("Número deportista 1: " + deportista1.getNumeroJugador());
        System.out.println("Número deportista 2: " + deportista2.getNumeroJugador());
    }
}
