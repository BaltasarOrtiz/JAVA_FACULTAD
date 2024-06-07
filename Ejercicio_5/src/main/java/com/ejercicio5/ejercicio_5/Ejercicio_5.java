/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.ejercicio5.ejercicio_5;

 import com.ejercicio5.ejercicio_5.hilos.MiHilo;
 
 /**
  *
  * @author Baltasar
  */
 public class Ejercicio_5 {
 
     public static void main(String[] args) {
         ConjuntoPalabras datos = new ConjuntoPalabras();
 
         long inicio = System.currentTimeMillis();
         Thread h1 = new MiHilo("uno","C:\\Users\\Baltasar\\Documents\\GitHub\\JAVA_FACULTAD\\Ejercicio_5\\src\\main\\java\\com\\ejercicio5\\ejercicio_5\\datos\\texto1.txt",datos);
         Thread h2 = new MiHilo("dos","C:\\Users\\Baltasar\\Documents\\GitHub\\JAVA_FACULTAD\\Ejercicio_5\\src\\main\\java\\com\\ejercicio5\\ejercicio_5\\datos\\texto2.txt",datos);
         h1.start();
         h2.start();
         try {
             h1.join();
             h2.join();
         } catch (InterruptedException e) {
             System.out.println("Hilo principal interrumpido");
         }
         // Muestro cada palabra y la cantidad de veces que aparece
         long fin = System.currentTimeMillis();
         System.out.println();
         datos.mostrar();
         System.out.println();
         System.out.println("Tiempo de ejecucion: " + (fin - inicio) + " milisegundos");
     }
 }
 