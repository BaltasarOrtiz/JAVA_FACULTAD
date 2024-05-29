/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio2.ejercicio_2.modelos;
import com.ejercicio2.ejercicio_2.interfaces_java.IDeporte;
import java.util.List;

/**
 *
 * @author balta
 */
public class Equipo implements IDeporte{
    private String nombre;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean conformar(List<Deportista> integrantes) {
        
    }

    @Override
    public void mostrar() {
        
    }

    @Override
    public void numeroDeportista() {
        
    }

   
   
    
}
