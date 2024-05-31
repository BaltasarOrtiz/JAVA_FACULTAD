/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio5.ejercicio_5.hilos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import com.ejercicio5.ejercicio_5.ConjuntoPalabras;
import com.ejercicio5.ejercicio_5.modelos.Palabra;

/**
 *
 * @author Baltasar
 */
public class MiHilo extends Thread {
    private String numeroHilo;
    private String rutaArchivo;
    private ConjuntoPalabras datos;

    public MiHilo(String numeroHilo, String rutaArchivo, ConjuntoPalabras datos) {
        this.numeroHilo = numeroHilo;
        this.rutaArchivo = rutaArchivo;
        this.datos = datos;
    }


    public String limpiarSignos(String texto){
        texto = texto.replaceAll("[^a-zA-Z0-9]", " ");
        return texto;
    }

    
    public String limpiarStopWords(String[] texto){ 
        String[] stopWords = {"a", "el", "la", "los", "las", "y", "o", "u", "de", "del", "al", "en", "con", "por", "para", "si", "no", "ni", "pero", "aunque", "sin", "sobre", "tras", "durante", "mientras", "cuando", "donde", "quien", "cual", "cuyo", "cuya", "cuyos", "cuyas", "que", "cual", "cuyas", "cuyos", "cuya", "cuyas", "cuyo", "cuyos"};
        Set<String> stopWordsSet = Arrays.stream(stopWords).collect(Collectors.toSet());

        String textoLimpio = Arrays.stream(texto)
            .filter(word -> !stopWordsSet.contains(word))
            .collect(Collectors.joining(" "));

        return textoLimpio;
    }

    // Metodo para leer el archivo
    @Override
    public void run() {
        String texto = "";
        try {
            texto = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(rutaArchivo)));
        } catch (java.io.IOException e) {
            System.out.println("Error al leer el archivo");
        }
        texto = limpiarSignos(texto);
        String[] palabras = texto.split(" ");
        palabras = limpiarStopWords(palabras).split(" ");

        // Crear un HashMap para almacenar cada palabra y su frecuencia
        HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();
        for (String palabra : palabras) {
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }

        // Crear un objeto Palabra para cada palabra y su frecuencia
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            System.out.println("Hilo " + numeroHilo + ": " + entrada.getKey() + " - " + entrada.getValue());
            Palabra nuevaPalabra = new Palabra(entrada.getKey(), entrada.getValue());
            datos.agregarPalabra(nuevaPalabra);
        }
    }

}


/* Explicacion HashMap

El código seleccionado está utilizando una estructura de datos llamada `HashMap` para almacenar cada palabra y 
su frecuencia. 

Un `HashMap` en Java es una parte de la Java Collections Framework y en su núcleo, una tabla hash que se utiliza para 
el almacenamiento y la recuperación eficiente de datos. Permite almacenar pares clave-valor, donde cada clave es única.

Aquí está cómo funciona el código:

1. `HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();` - Esta línea está creando un nuevo `HashMap` 
vacío llamado `frecuenciaPalabras`. 
Las claves son de tipo `String` (las palabras) y los valores son de tipo `Integer` (las frecuencias).

2. `for (String palabra : palabras) { ... }` - Este es un bucle `for-each` que recorre cada palabra en la lista `palabras`.

3. `frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);` 
- Esta línea está incrementando la frecuencia de la palabra actual. Si la palabra ya está en el `HashMap` (es decir, ya hemos visto esta palabra antes), obtenemos su frecuencia actual con `frecuenciaPalabras.getOrDefault(palabra, 0)`, le sumamos 1 y luego almacenamos la nueva frecuencia en el `HashMap` con `frecuenciaPalabras.put(palabra, nuevaFrecuencia)`. Si la palabra no está en el `HashMap` (es decir, es la primera vez que vemos esta palabra), `frecuenciaPalabras.getOrDefault(palabra, 0)` devolverá 0, por lo que almacenamos la palabra en el `HashMap` con una frecuencia de 1.

Al final de este código, `frecuenciaPalabras` será un `HashMap` donde cada clave es una palabra única 
en la lista `palabras` y cada valor es la frecuencia de esa palabra.
 
*/