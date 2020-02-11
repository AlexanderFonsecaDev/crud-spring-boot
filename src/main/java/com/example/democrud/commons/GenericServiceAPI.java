package com.example.democrud.commons;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceAPI<T,ID extends Serializable> {

    /*
    Metodo guardar
     */
    T save(T entity);

    /*
    Metodo borrar
     */
    void delete(ID id);

    /*
    Obtener uno solo
     */
    T get(ID id);

    /*
    Obtiene todos los objetos y me los regresa en una lista
     */
    List<T> getAll();





}
