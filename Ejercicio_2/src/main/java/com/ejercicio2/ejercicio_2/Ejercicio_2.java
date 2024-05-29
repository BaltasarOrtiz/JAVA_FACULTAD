/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ejercicio2.ejercicio_2;
import java.io.IOException;
import java.util.List;
import com.ejercicio2.ejercicio_2.modelos.Deportista;
import com.ejercicio2.ejercicio_2.Campeonato;

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
        int cantidadJugadoresFutbol= 5;                  
    
        List<Deportista> datosFutbol= leerArchivo("./src/datos/inscriptosFutbol.csv");
        List<Deportista> datosPinPon= leerArchivo(".src/datos/inscriptosPinPon.csv");
    }       
}
