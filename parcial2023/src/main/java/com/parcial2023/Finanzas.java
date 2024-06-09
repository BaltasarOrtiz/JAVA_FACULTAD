package com.parcial2023;
import com.parcial2023.modelos.Automotor;
import com.parcial2023.modelos.Inmueble;
import java.util.ArrayList;

public class Finanzas {
    private ArrayList<Inmueble> inmuebles;
    private ArrayList<Automotor> automotores;

    public Finanzas() {
        this.inmuebles = new ArrayList<>();
        this.automotores = new ArrayList<>();
    }

    // 1. Implementar el metodo exceptuados()

    public void exceptuados(){
        System.out.println("Inmuebles exceptuados: ");
        for (Inmueble inmueble : inmuebles){
            System.out.println(inmueble.getNumCatastral());
        }

        System.out.println("Automotores exceptuados: ");
        for (Automotor automotor : automotores){
            System.out.println(automotor.getPatente());
        }
    }

    // 2. Codificar totalAutomotores()
    public void totalAutomotores(){
        int cantAutos2023 = 0;
        for (Automotor automotor : automotores){
            if (automotor.getModelo() == 2023){
                cantAutos2023++;
            }
        }
        System.out.println("Cantidad de automotores modelo 2023: " + cantAutos2023);
    }

    // 3. Codificar megaInmuebles()
    public void megaInmuebles(){
        for (Inmueble inmueble : inmuebles){
            if (inmueble.impuesto() > 100000){
                System.out.println(inmueble.getNumCatastral());
            }
        }
    }

}
