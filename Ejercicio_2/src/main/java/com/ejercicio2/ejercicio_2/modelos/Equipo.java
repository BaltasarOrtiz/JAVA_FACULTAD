/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio2.ejercicio_2.modelos;
import com.ejercicio2.ejercicio_2.interfaces_java.IDeporte;
import ejercicio_3_excepciones.excepcionesEquipo;

import java.util.ArrayList;

/**
 *
 * @author balta
 */
public class Equipo implements IDeporte{
    private ArrayList<Deportista> equipoActual;


    public Equipo(ArrayList<Deportista> equipoActual) throws excepcionesEquipo{ 
        if (equipoActual.size() < CANTIDAD_MINIMA) {
            throw new excepcionesEquipo("El tamaño del equipo debe ser al menos 5");
        }
        this.equipoActual = equipoActual;
        asignarNumerosAJugadores();
    }

    private void asignarNumerosAJugadores(){
        int numeroJugador = 1;
        for (Deportista d : equipoActual) {
            d.setNumeroJugador(numeroJugador);
            numeroJugador++;
        }
    }

    @Override
    public boolean conformar(ArrayList<Deportista> integrantes) {
        if (integrantes == null || integrantes.size() < CANTIDAD_MINIMA) {
            return false;
        }
        
        this.equipoActual = integrantes;
        return true;
    }
    
    @Override
    public void mostrar() {
        for (Deportista d : equipoActual) {
            System.out.println(d);
        }
    }

    @Override
    public void numeroDeportista() {
        for (Deportista d : equipoActual) {
            System.out.println(d.getNumeroJugador());
        }
    }

}
