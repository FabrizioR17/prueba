package com.backend.clinicaOdontologica.service;

import com.backend.clinicaOdontologica.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {

    Odontologo registrarOdontologo(Odontologo odontologo);
    List<Odontologo> listarOdontologo();

}
