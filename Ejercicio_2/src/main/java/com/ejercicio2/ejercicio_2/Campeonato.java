package com.ejercicio2.ejercicio_2;
import com.ejercicio2.ejercicio_2.interfaces_java.IDeporte;
import com.ejercicio2.ejercicio_2.modelos.Deportista;
import com.ejercicio2.ejercicio_2.modelos.Equipo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Campeonato {
    public static final String SEPARADOR = ",";
    private static Random rand = new Random();

    public static List<Deportista>leerArchivo(String nombreArchivo)throws IOException{
        BufferedReader bufferLectura = null;
        List<Deportista> datos = new ArrayList<>();
        try {
            bufferLectura = new BufferedReader(new FileReader(nombreArchivo));
            String linea;                  

            while ((linea=bufferLectura.readLine()) != null) {
                // Sepapar la linea leída con el separador definido previamente
                String[] campos = linea.split(SEPARADOR); 
                int numeroAleatorio = rand.nextInt(100);
                Deportista d = new Deportista(campos[0],campos[1],numeroAleatorio);
                datos.add(d);           
            }
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
         // Cierro el buffer de lectura
         if (bufferLectura != null) {
             bufferLectura.close();
         }
        }
        return datos;
    }
    /**
    * Crea los equipos con los datos pasados como parámetro
    * @param datos lista con todos los deportistas inscriptos
    * @param cantidadJugadores cantidad de jugadores que conforman un equipo
    * @return una lista de equipos
    */
    public static List<IDeporte> creaEquipos(List<Deportista> datos, int cantidadJugadores){
        List<IDeporte> equipos = new ArrayList<>();
        ArrayList<Deportista> equipoActual = new ArrayList<>();
        for (Deportista d : datos) {
            equipoActual.add(d);
            if (equipoActual.size() == cantidadJugadores) {
                Equipo e = new Equipo(equipoActual);
                equipos.add(e);
                equipoActual = new ArrayList<>();
            }
        }
        return equipos;
    }
    /**
    Crea los equipos con los datos pasados como parámetro
     * @param datos es una lista con todos los deportitas inscriptos
     * @return una lista de Parejas formadas
    */
    public static List<IDeporte> creaParejas(List<Deportista> datos){
        List<IDeporte> parejas = new ArrayList<>();
        ArrayList<Deportista> parejaActual = new ArrayList<>();
        for (Deportista d : datos) {
            parejaActual.add(d);
            if (parejaActual.size() == 2) {
                Equipo e = new Equipo(parejaActual);
                parejas.add(e);
                parejaActual = new ArrayList<>();
            }
        }
        return parejas;
    }
    /**
    * Numera cada integrante del equipo o de la pareja
     * @param datos 
    */
    public static void numerar(List<IDeporte> datos){
        for (IDeporte d : datos) {
            d.numeroDeportista();
        }
    }
    /**
    * Muestra los datos de cada equipo o de cada pareja
     * @param datos
    */
    public static void mostrar(List<IDeporte> datos){
        for (IDeporte d : datos) {
            d.mostrar();
        }
    }
     
}
