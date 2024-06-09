package com.parcial2023.modelos;
import com.parcial2023.interfaces.IPrueba;
import com.parcial2023.interfaces.ITributo;

public class Automotor implements ITributo,IPrueba{
    private String patente;
    private int modelo;

    public Automotor(String patente, int modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public String setPatente(String patente) {
        return this.patente = patente;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automotor [marca=" + modelo + ", patente=" + patente + "]";
    }

    @Override
    public float impuesto() {
        float impuesto = 0;
        if (modelo == 2023){
            impuesto = 1000;
        } else if (modelo == 2022){
            impuesto = 500;
        }
        return impuesto;
    }

    @Override
    public void pruebaInterface() {
        System.out.println("Prueba automotor");
    }
}
