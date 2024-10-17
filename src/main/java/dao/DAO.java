package dao;

import java.util.List;
/**
 * Interfaz DAO que contiene los métodos estándar para realizar operaciones CRUD sobre una base de datos.
 * **/
public interface DAO<T> {
    public List<T> findAll();
    public T findById(Integer id);
    public void save(T t);
    public void update(T t);
    public void delete(T t);
}
