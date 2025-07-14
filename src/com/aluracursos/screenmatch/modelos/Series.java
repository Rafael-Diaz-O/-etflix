package com.aluracursos.screenmatch.modelos;

public class Series extends Netflix  {

    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    @Override // estoy sobre escribiendo un metodo de la clase Netflix aplico polimorfismo
   public int getDuracionEnMinutos(){
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
   }
}
