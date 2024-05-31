/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ejercicio4.ejercicio_4;
import java.util.Scanner;


import com.ejercicio4.ejercicio_4.modelos.ViajeroFrecuente;

/**
 *
 * @author balta
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        // Menu
        Gestor gestor = new Gestor(5);
        gestor.agregarViajero(new ViajeroFrecuente(1, 12345678, 100, "Juan", "Perez"));
        gestor.agregarViajero(new ViajeroFrecuente(2, 23456789, 300, "Maria", "Gomez"));
        gestor.agregarViajero(new ViajeroFrecuente(3, 34567890, 150, "Carlos", "Lopez"));
        gestor.agregarViajero(new ViajeroFrecuente(4, 45678901, 250, "Ana", "Martinez"));
        gestor.agregarViajero(new ViajeroFrecuente(5, 56789012, 200, "Lucia", "Rodriguez"));
        
        
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Mostrar todos los viajeros ordenados por cantidad de millas");
            System.out.println("2. Mostrar viajeros con mas de 200 millas");
            System.out.println("3. Mostrar mejor viajero");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    gestor.mostrarViajerosOrdenadosPorMillas();
                    break;
                case 2:
                    gestor.mostrarViajerosConMasDe200Millas();
                    break;
                case 3:
                    gestor.mejorViajero();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    in.close();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 4);
    }
}
