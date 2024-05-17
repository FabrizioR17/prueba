package com.backend.repository;

public interface IDao {
    T nombreMetodoRegistrarPorEjemplo(T t);

    T MetodoParaBuscarAlgoEnBDPuedeSerId(Long id);
}
