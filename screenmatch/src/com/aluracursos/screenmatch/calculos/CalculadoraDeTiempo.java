package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Netflix;


public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Netflix titulo){

        this.tiempoTotal += titulo.getDuracionEnMinutos();


    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

}
