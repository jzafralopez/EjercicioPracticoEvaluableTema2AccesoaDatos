package dao;

import models.Pelicula;

import java.sql.Connection;
import java.util.List;

/**
 * Clase PeliculaDAO que implementa la interfaz DAO y se encarga de realizar operaciones CRUD sobre la tabla pelicula de la base de datos.
 * Además, contiene las consultas SQL necesarias para realizar las operaciones y los métodos principales que se
 * requieren en el ejercicio.
 * **/

public class PeliculaDAO implements DAO<Pelicula> {

    public static final String INSERT_INTO_PELICULA = "INSERT INTO pelicula (titulo, genero, año) VALUES (?,?,?)";
    public static final String CONTAR_PELICULAS = "SELECT COUNT(*) FROM pelicula";
    public static final String FILTRAR_PELICULAS_GENERO = "SELECT * FROM pelicula WHERE genero = ?";

    private static Connection connection = null;

    public PeliculaDAO(Connection c){
        connection = c;
    }

    /**
     * Método meter películas que recibe una película y la inserta en la base de datos.
     * **/
    public void meterPelicula(Pelicula p){
        String query = INSERT_INTO_PELICULA;
        try {
            var ps = connection.prepareStatement(query);
            ps.setString(1, p.getTitulo());
            ps.setString(2, p.getGenero());
            ps.setInt(3, p.getAnho());
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Método contar películas que muestra por pantalla el número de películas que hay en la base de datos.
     * **/
    public void contarPeliculas(){
        String query = CONTAR_PELICULAS;
        try {
            var st = connection.createStatement();
            var rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println("Número de películas: " + rs.getInt(1));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Método filtrar peliculas que recibe un género y muestra por pantalla las películas que pertenecen a ese género.
     * **/
    public void filtrarPeliculas(String genero){
        String query = FILTRAR_PELICULAS_GENERO;
        try {
            var ps = connection.prepareStatement(query);
            ps.setString(1, genero);
            var rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Título: " + rs.getString("titulo") + " Género: " + rs.getString("genero") + " Año: " + rs.getInt("año"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Pelicula> findAll() {
        return null;
    }

    @Override
    public Pelicula findById(Integer id) {
        return null;
    }

    @Override
    public void save(Pelicula pelicula) {

    }

    @Override
    public void update(Pelicula pelicula) {

    }

    @Override
    public void delete(Pelicula pelicula) {

    }
}
