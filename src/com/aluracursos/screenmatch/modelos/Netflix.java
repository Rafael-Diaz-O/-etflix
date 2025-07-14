package com.aluracursos.screenmatch.modelos;

public class Netflix {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluacion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setSumaDeLasEvaluaciones(double sumaDeLasEvaluaciones) {
        this.sumaDeLasEvaluaciones = sumaDeLasEvaluaciones;
    }

    public void setTotalDeLasEvaluacion(int totalDeLasEvaluacion) {
        this.totalDeLasEvaluacion = totalDeLasEvaluacion;
    }

    public int getTotalDeLasEvaluacion(){
        return totalDeLasEvaluacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }


    public void muestreFichaTecnica(){
        System.out.println("El nombre de la pelicula es:"+ nombre);
        System.out.println("Su fecha de lanzamiento es:" + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    }

    public void evalua (double nota){
        sumaDeLasEvaluaciones  += nota;
        totalDeLasEvaluacion ++ ;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluacion;
    }
}
