import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Series;

public class Principal {


    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto") ; // s epuede alamcenar info en las variables de la clase con la que cree mi objecto
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.muestreFichaTecnica();
        miPelicula.evalua(5.0);
        miPelicula.evalua(4.0); // cuando el metodo no retorna solo se ejecuta



        System.out.println(miPelicula.getTotalDeLasEvaluacion());
        System.out.println(miPelicula.calculaMedia()); // cuando se crea un metodo con retorno

        System.out.println("Calificiacion de la pelicula: " + miPelicula.getTotalDeLasEvaluacion() );

        System.out.println("\n ------------------------------------------------ \n");

        Series  casaDragon = new Series();
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println(casaDragon.getDuracionEnMinutos());
        System.out.println("Cantidad de temporadas: " + casaDragon.getTemporadas());
        casaDragon.muestreFichaTecnica();

        Pelicula otraPelicua = new com.aluracursos.screenmatch.modelos.Pelicula();
        otraPelicua.setNombre("matrix");
        otraPelicua.setFechaDeLanzamiento(1998);
        otraPelicua.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(otraPelicua); // no da error por que esas clases heredan de netflix lo que las hace en parte ser de tipo netflix

        calculadora.incluye(casaDragon);

        System.out.println("tiempo necesario para ver estas peliculas es de " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setNombre("La casa de Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);


        filtroRecomendacion.filtra(episodio);





    }
}
