package com.parcial2023.modelos;

import com.parcial2023.interfaces.IPrueba;
import com.parcial2023.interfaces.ITributo;

public class Inmueble implements ITributo,IPrueba{
    private String numCatastral;
    private float superficie;
    private String zona;

    public Inmueble(String numCatastral, float superficie, String zona) {
        this.numCatastral = numCatastral;
        this.superficie = superficie;
        this.zona = zona;
    }

    public String getNumCatastral() {
        return numCatastral;
    }

    public void setNumCatastral(String numCatastral) {
        this.numCatastral = numCatastral;
    }

    public float getSuperficie() {
        return superficie;
    }
    
    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Inmueble [numCatastral=" + numCatastral + ", superficie=" + superficie + ", zona=" + zona + "]";
    }

    @Override
    public float impuesto() {
        float impuesto = 0;
        if (zona.equals("urbana")){
            impuesto = superficie * 10;
        } else if (zona.equals("suburbana")){
            impuesto = superficie * 5;
        }
        return impuesto;
    }

    @Override
    public void pruebaInterface() {
        System.out.println("Prueba inmueble");
    }
}
