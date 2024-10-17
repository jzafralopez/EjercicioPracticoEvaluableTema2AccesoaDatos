import dao.JdbcUtil;
import dao.PeliculaDAO;
import models.Pelicula;

import java.sql.Connection;

/**
 * Clase Main que contiene el método main y se encarga de realizar las pruebas de los métodos del ejercicio.
 **/
public class Main {
    public static void main(String[] args) {
        Connection connection = JdbcUtil.getConnection();

        PeliculaDAO peliculaDAO = new PeliculaDAO(connection);

        /**
         * Creación de dos películas
         **/
        Pelicula diarios = new Pelicula("Diarios de motocicleta", "Drama", 2004);
        Pelicula django = new Pelicula("Django Desencadenado", "Acción", 2012);

        /**
         * Prueba del método meter peli en la BBDD
         **/
        peliculaDAO.meterPelicula(diarios);
        peliculaDAO.meterPelicula(django);

        /**
         * Prueba del método contar pelis en la BBDD
         **/
        peliculaDAO.contarPeliculas();

        /**
         * Prueba del método filtrar pelis en la BBDD
         **/
        peliculaDAO.filtrarPeliculas("ciencia ficción");
        peliculaDAO.filtrarPeliculas("drama");
        peliculaDAO.filtrarPeliculas("acción");


    }
}
