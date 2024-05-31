package com.ejercicio4.ejercicio_4;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import com.ejercicio4.ejercicio_4.modelos.ViajeroFrecuente;

public class Gestor {
    private int cantidad;
    private List<ViajeroFrecuente> viajeros; 

    public Gestor(int cantidad) {
        this.cantidad = cantidad;
        //List es una interfaz y ArrayList es una clase que implementa esa interfaz por eso se debe instanciar con ArrayList
        this.viajeros = new ArrayList<ViajeroFrecuente>(); 
    }
    
    //Metodos con Streams
    // a) Agregar viajeros al gestor.
    public void agregarViajero(ViajeroFrecuente viajero) {
        long count = viajeros.stream().count();
        if (count < cantidad) {
            viajeros.add(viajero);
        } else {
            System.out.println("No se pueden agregar mas viajeros");
        }
    }

    // b) Mostrar los datos de los viajeros ordenados por la cantidad de millas.
    public void mostrarViajerosOrdenadosPorMillas() {
        viajeros.stream()
            .sorted(Comparator.comparing(ViajeroFrecuente::getMillas))
            .forEach(System.out::println);
    }

    // c) Mostrar los nombres de los viajeros que tienen más de 200 millas.
    public void mostrarViajerosConMasDe200Millas() {
        viajeros.stream()
            .filter(viajero -> viajero.getMillas() > 200)
            .map(ViajeroFrecuente::getNombre)
            .forEach(System.out::println);
    }

    // d) Obtener el viajero que tiene más millas.
    public void mejorViajero() {
        ViajeroFrecuente mejorViajero = viajeros.stream()
            .max(Comparator.comparing(ViajeroFrecuente::getMillas))
            .orElse(null);
    
        System.out.println(mejorViajero);
    }

    // Mostrar los datos de un viajero en particular.
    public void mostrarViajero(int numViajero) {
        viajeros.stream()
            .filter(viajero -> viajero.getNumero() == numViajero)
            .sorted(Comparator.comparing(ViajeroFrecuente::getMillas))
            .forEach(System.out::println);
    }

    // Metodos sin streams
    public void consultarMillas(int dni) {
        Iterator<ViajeroFrecuente> iterator = viajeros.iterator();
        boolean bandera = false;
        while (iterator.hasNext()) {
            ViajeroFrecuente viajero = iterator.next();
            if (viajero.getDni() == dni && !bandera) {
                System.out.println(viajero.getMillas());
                bandera = true;
            }
        }
    }

    public void acumularMillas(int dni, int millas) {
        boolean bandera = false;
        Iterator<ViajeroFrecuente> iterator = viajeros.iterator();
        while (iterator.hasNext() && !bandera) {
            ViajeroFrecuente viajero = iterator.next();
            if (viajero.getDni() == dni) {
                viajero.acumularMillas(millas);
                bandera = true;
            }
        }
    }

    public void canjearMillas(int dni, int millas) {
        Iterator<ViajeroFrecuente> iterator = viajeros.iterator();
        boolean bandera = false;
        while (iterator.hasNext() && !bandera) {
            ViajeroFrecuente viajero = iterator.next();
            if (viajero.getDni() == dni) {
                viajero.canjearMillas(millas);
                bandera = true;
            }
        }
    }

}