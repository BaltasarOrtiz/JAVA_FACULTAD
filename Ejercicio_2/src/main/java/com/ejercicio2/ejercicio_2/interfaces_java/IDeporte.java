/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicio2.ejercicio_2.interfaces_java;
import com.ejercicio2.ejercicio_2.modelos.Deportista;

import java.util.ArrayList;

/**
 *
 * @author balta
 */
public interface IDeporte {
    int CANTIDAD_MINIMA=2;
    
    public boolean conformar(ArrayList<Deportista> integrantes);
    public void mostrar();
    public void numeroDeportista();
    
}
