package com.parcial2023;
import com.parcial2023.modelos.Automotor;
import com.parcial2023.modelos.Inmueble;

public class Main {
    public static void main(String[] args) {
        Automotor auto1 = new Automotor("ABC123", 2023);
        Automotor auto2 = new Automotor("DEF456", 2022);
        Automotor auto3 = new Automotor("GHI789", 2023);

        // numero catastral, superficie, zona
        Inmueble inmueble1 = new Inmueble("123", 100, "urbana");
        Inmueble inmueble2 = new Inmueble("456", 200, "suburbana");
        Inmueble inmueble3 = new Inmueble("789", 300, "urbana");

        Finanzas f = new Finanzas();
        f.insertarTributos(auto1);
        f.insertarTributos(auto2);
        f.insertarTributos(auto3);
        f.insertarTributos(inmueble1);
        f.insertarTributos(inmueble2);
        f.insertarTributos(inmueble3);

        System.out.println("Exceptuados: ");
        f.exceptuados3();
        System.out.println();
        System.out.println("Total automotores 2023: ");
        f.totalAutomotores2();
        System.out.println();
        System.out.println("Total inmuebles: ");
        f.megaInmuebles2();
        System.out.println();
        System.out.println();
        System.out.println();
        f.pruebas();
    }
}