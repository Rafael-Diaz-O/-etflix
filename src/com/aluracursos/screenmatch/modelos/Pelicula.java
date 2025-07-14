package com.aluracursos.screenmatch.modelos;
import com.aluracursos.screenmatch.calculos.Clasificacion;

public class  Pelicula extends Netflix implements Clasificacion {

    private String director;

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public int getClasificacion(){
        return (int) (calculaMedia()/2); // se realiza un casteo pasa de tipo double a tipo de dato entero
    }

}
