package com.backend.repository;

import java.util.List;

public interface IDao<T> {

    public T registrarOdontologo(T t);
    public List<T> listarOdontogo();

}
