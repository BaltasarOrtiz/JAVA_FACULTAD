package com.parcial2023;
import com.parcial2023.interfaces.IPrueba;
import com.parcial2023.interfaces.ITributo;
import com.parcial2023.modelos.Automotor;
import com.parcial2023.modelos.Inmueble;
import java.util.ArrayList;

public class Finanzas {
    //private ArrayList<Inmueble> inmuebles;
    //private ArrayList<Automotor> automotores;
    private ArrayList<ITributo> tributos;

    public Finanzas() {
        //this.inmuebles = new ArrayList<>();
        //this.automotores = new ArrayList<>();
        this.tributos = new ArrayList<>();
    }

    public void insertarTributos(ITributo tributo){
        tributos.add(tributo);
        /*
        if (tributo instanceof Inmueble){
            inmuebles.add((Inmueble) tributo);
        } else if (tributo instanceof Automotor){
            automotores.add((Automotor) tributo);
        }
        */
    }


    /* 
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
    */

    public void exceptuados2(){
        for (ITributo tributo : tributos){
            if (tributo instanceof Inmueble){
                System.out.println(((Inmueble) tributo).getNumCatastral());
            } else if (tributo instanceof Automotor){
                System.out.println(((Automotor) tributo).getPatente());
            }
        }
    }

    // Con streams
    public void exceptuados3(){
        tributos.stream()
                .filter(tributo -> tributo instanceof Inmueble)
                .forEach(inmueble -> System.out.println(((Inmueble) inmueble).getNumCatastral()));

        tributos.stream()
                .filter(tributo -> tributo instanceof Automotor)
                .forEach(automotor -> System.out.println(((Automotor) automotor).getPatente()));
    }
    
    /* 
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
    */

    public void totalAutomotores2(){
        int cantAutos2023 = 0;
        for (ITributo tributo : tributos){
            if (tributo instanceof Automotor){
                Automotor automotor = (Automotor) tributo;
                if (automotor.getModelo() == 2023){
                    cantAutos2023++;
                }
            }
        }
        System.out.println("Cantidad de automotores modelo 2023: " + cantAutos2023);
    }
    
    /* 
    // 3. Codificar megaInmuebles()
    public void megaInmuebles(){
        for (Inmueble inmueble : inmuebles){
            if (inmueble.impuesto() > 100000){
                System.out.println(inmueble.getNumCatastral());
            }
        }
    }
    */

    public void megaInmuebles2(){
        for (ITributo tributo : tributos){
            if (tributo instanceof Inmueble){
                Inmueble inmueble = (Inmueble) tributo;
                if (inmueble.impuesto() > 100000){
                    System.out.println(inmueble.getNumCatastral());
                }
            }
        }
    }

    public void pruebas(){
        for (ITributo tributo : tributos){
            // System.out.println(tributo.getNumCatastral()); 
            /*
             Si la lista es del tipo ITributo, no se puede acceder a los metodos de las clases Inmueble y Automotor, solamente a los
             metodos de la interface, cuyo caso se quiera usar los metodos de las clases Inmueble y Automotor, se debe hacer un cast.
             */
            if (tributo instanceof Inmueble){
               ((Inmueble) tributo).pruebaInterface();
               ((IPrueba) tributo).pruebaInterface();
            } else if (tributo instanceof Automotor){
                ((Automotor) tributo).pruebaInterface();
                ((IPrueba) tributo).pruebaInterface();
            }
        }
    }

}
