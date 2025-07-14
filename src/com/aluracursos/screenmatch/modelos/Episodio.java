package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private int numero;
    private String nombre;
    private Series serie;
    private int totalVisualizaciones;

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public  int getClasificacion(){
        if (totalVisualizaciones > 100){
            return 4;
        }else {
            return 2;
        }

    }
}
