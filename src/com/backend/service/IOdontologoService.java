package com.backend.service;

import com.backend.model.Odontologo;

import java.util.List;

public interface IOdontologoService {

    Odontologo registrarOdontologo(Odontologo odontologo);
    List<Odontologo> listarOdontologo();

}
