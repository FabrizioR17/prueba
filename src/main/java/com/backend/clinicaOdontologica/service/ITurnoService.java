package com.backend.clinicaOdontologica.service;

import com.backend.clinicaOdontologica.entity.Turno;

import java.util.List;

public interface ITurnoService {

    Turno registrarTurno(Turno turno);
    List<Turno> listarTurnos();

}
