package ejercicio_1.example;
import java.util.ArrayList;

import java.util.Iterator;
import ejercicio_1.example.modelos.ViajeroFrecuente;

public class Gestor {
    private int cantidad;
    private ArrayList<ViajeroFrecuente> viajeros;

    public Gestor(int cantidad) {
        this.cantidad = cantidad;
        this.viajeros = new ArrayList<ViajeroFrecuente>();
    }
    
    public void agregarViajero(ViajeroFrecuente viajero) {
        if (viajeros.size() < cantidad) {
            viajeros.add(viajero);
        }else{
            System.out.println("No se pueden agregar mas viajeros");
        }
    }

    public void mostrarViajero(int numViajero) {
        Iterator<ViajeroFrecuente> iterator = viajeros.iterator();
        while (iterator.hasNext()) {
            ViajeroFrecuente viajero = iterator.next();
            if (viajero.getNumero() == numViajero) {
                System.out.println(viajero);
            }
        }
    }

    public void consultarMillas(int dni) {
        Iterator<ViajeroFrecuente> iterator = viajeros.iterator();
        boolean bandera = false;
        while (iterator.hasNext()) {
            ViajeroFrecuente viajero = iterator.next();
            if (viajero.getDni() == dni && !bandera) {
                System.out.println(viajero.getMillas());
                bandera = true;
            }
        }
    }

    public void acumularMillas(int dni, int millas) {
        boolean bandera = false;
        Iterator<ViajeroFrecuente> iterator = viajeros.iterator();
        while (iterator.hasNext() && !bandera) {
            ViajeroFrecuente viajero = iterator.next();
            if (viajero.getDni() == dni) {
                viajero.acumularMillas(millas);
                bandera = true;
            }
        }
    }

    public void canjearMillas(int dni, int millas) {
        Iterator<ViajeroFrecuente> iterator = viajeros.iterator();
        boolean bandera = false;
        while (iterator.hasNext() && !bandera) {
            ViajeroFrecuente viajero = iterator.next();
            if (viajero.getDni() == dni) {
                viajero.canjearMillas(millas);
                bandera = true;
            }
        }
    }

    public void mejorViajero() {
        ViajeroFrecuente mejorViajero = null;
        int maxMillas = 0;
        Iterator<ViajeroFrecuente> iterator = viajeros.iterator();
        while (iterator.hasNext()) {
            ViajeroFrecuente viajero = iterator.next();
            if (viajero.getMillas() > maxMillas) {
                maxMillas = viajero.getMillas();
                mejorViajero = viajero;
            }
        }
        System.out.println(mejorViajero);
    }

}



