package com.ejercicio2.ejercicio_2;
import com.ejercicio2.ejercicio_2.interfaces_java.IDeporte;
import com.ejercicio2.ejercicio_2.modelos.Deportista;
import com.ejercicio2.ejercicio_2.modelos.Equipo;

import ejercicio_3_excepciones.excepcionesDeportista;
import ejercicio_3_excepciones.excepcionesEquipo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Campeonato {
    public static final String SEPARADOR = ",";

    public static List<Deportista>leerArchivo(String nombreArchivo)throws excepcionesDeportista, IOException{
        BufferedReader bufferLectura = null;
        List<Deportista> datos = new ArrayList<>();
        try {
            bufferLectura = new BufferedReader(new FileReader(nombreArchivo));
            String linea;                  

            while ((linea=bufferLectura.readLine()) != null) {

                String[] campos = linea.split(SEPARADOR); 
                try {
                    Deportista d = new Deportista(campos[0], campos[1], 0);
                    datos.add(d);
                } catch (excepcionesDeportista e) {
                    System.out.println(e.getMessage());
                }     
                           
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


    // EQUIPOS DE FUTBOL
    /**
    * Crea los equipos con los datos pasados como parámetro
    * @param datos lista con todos los deportistas inscriptos
    * @param cantidadJugadores cantidad de jugadores que conforman un equipo
    * @return una lista de equipos
    */
    public static List<IDeporte> creaEquipos(List<Deportista> datos, int cantidadJugadores) throws excepcionesDeportista{
        List<IDeporte> equipos = new ArrayList<>();
        ArrayList<Deportista> equipoActual = new ArrayList<>();
        List<String> dniAsignados = new ArrayList<>();
    
        for (Deportista d : datos) {
            if (!dniAsignados.contains(d.getDni())) {
                equipoActual.add(d);
                dniAsignados.add(d.getDni());
                if (equipoActual.size() == cantidadJugadores) {
                    try{
                        Equipo e = new Equipo(equipoActual);
                        equipos.add(e);
                        equipoActual = new ArrayList<>();
                    }catch (excepcionesEquipo e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        return equipos;
    }


    //EQUIPOS DE PINGPONG
    /**
    Crea los equipos con los datos pasados como parámetro
     * @param datos es una lista con todos los deportitas inscriptos
     * @return una lista de Parejas formadas
    */
    public static List<IDeporte> creaParejas(List<Deportista> datos, int cantidadJugadores) throws excepcionesDeportista{
        List<IDeporte> parejas = new ArrayList<>();
        ArrayList<Deportista> parejaActual = new ArrayList<>();
        List<String> dniAsignados = new ArrayList<>();
    
        for (Deportista d : datos) {
            if (!dniAsignados.contains(d.getDni())) {
                parejaActual.add(d);
                dniAsignados.add(d.getDni());
                if (parejaActual.size() == cantidadJugadores) {
                    try{
                        Equipo e = new Equipo(parejaActual);
                        parejas.add(e);
                        parejaActual = new ArrayList<>();
                    } catch (excepcionesEquipo e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        return parejas;
    }



    /**
    * Numera cada integrante del equipo o de la pareja
     * @param datos 
    */
    public static void numerar(List<IDeporte> datos){
        int contador = 1;
        for (IDeporte d : datos) {
            System.out.println("Equipo " + contador + ":");
            d.numeroDeportista();
            System.out.println("------------------------");
            contador++;
        }
    }

    /**
    * Muestra los datos de cada equipo o de cada pareja
     * @param datos
    */
    public static void mostrar(List<IDeporte> datos){
        int contador = 1;
        for (IDeporte d : datos) {
            System.out.println("Equipo " + contador + ":");
            d.mostrar();
            System.out.println("------------------------");
            contador++;
        }
    }
     
}
