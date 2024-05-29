/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ejercicio2.ejercicio_2;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.ejercicio2.ejercicio_2.interfaces_java.IDeporte;
import com.ejercicio2.ejercicio_2.modelos.Deportista;

/**
 *
 * @author balta
 */
public class Ejercicio_2 {

    //Parte del codigo para el metodo main() que debera estar definido en la clase principal.    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int cantidadJugadoresFutbol = 5;
        int cantidadJugadoresPinPon = 2;                  
    
        List<Deportista> datosFutbol = Campeonato.leerArchivo("C:\\Users\\balta\\Documents\\GitHub\\JAVA_FACULTAD\\Ejercicio_2\\src\\main\\java\\com\\ejercicio2\\ejercicio_2\\datos\\inscriptosFutbol.csv");
        List<IDeporte> ListaEquiposFutbol = Campeonato.creaEquipos(datosFutbol, cantidadJugadoresFutbol);
        List<Deportista> datosPinPon = Campeonato.leerArchivo("C:\\Users\\balta\\Documents\\GitHub\\JAVA_FACULTAD\\Ejercicio_2\\src\\main\\java\\com\\ejercicio2\\ejercicio_2\\datos\\inscriptosPinPon.csv");
        List<IDeporte> ListaEquiposPinPon = Campeonato.creaEquipos(datosPinPon, cantidadJugadoresPinPon);

        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            // Menu de opciones
            System.out.println("1. Crear Equipos de futbol");
            System.out.println("2. Crear Equipos de pin pon");
            System.out.println("3. Numerar Equipo de futbol");
            System.out.println("4. Numerar Equipo de pin pon");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            
            // Leer la opción ingresada por el usuario
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Equipos de futbol");
                    Campeonato.mostrar(ListaEquiposFutbol);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Equipos de pin pon");
                    Campeonato.mostrar(ListaEquiposPinPon);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Numeracion Equipos de futbol");
                    Campeonato.numerar(ListaEquiposFutbol);
                    break;
                case 4:
                    System.out.println("Numeracion Equipos de pin pon");
                    Campeonato.numerar(ListaEquiposPinPon);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 4);
    }
}
