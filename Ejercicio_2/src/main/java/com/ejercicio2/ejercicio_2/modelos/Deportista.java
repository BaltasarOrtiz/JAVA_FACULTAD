/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio2.ejercicio_2.modelos;

import ejercicio_3_excepciones.excepcionesDeportista;

/**
 *
 * @author balta
 */
public class Deportista {
    private String nombre;
    private String dni;
    private int numeroJugador;

    public Deportista(String nombre, String dni, int numeroJugador) throws excepcionesDeportista{
        if(dni.isEmpty() || dni.isBlank()){
            throw new excepcionesDeportista("El DNI no puede estar vacio");
        }else{
            this.dni = dni;
        }
        if (nombre.isEmpty() || nombre.isBlank()){
            throw new excepcionesDeportista("El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
        this.numeroJugador = numeroJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    @Override
    public String toString() {
        return "Deportista: {" + "nombre=" + nombre + ", dni=" + dni + ", numeroJugador=" + numeroJugador + '}';
    }
    
}
