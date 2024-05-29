/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3_excepciones;

/**
 *
 * @author balta
 */

public class excepcionesDeportista extends Exception{
    public excepcionesDeportista(String message) {
        super(message);
    }

    public excepcionesDeportista(String message, Throwable cause) {
        super(message, cause);
    }

    public excepcionesDeportista(Throwable cause) {
        super(cause);
    }

}

