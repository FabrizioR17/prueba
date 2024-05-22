package com.backend.clinicaOdontologica.service;

import com.backend.clinicaOdontologica.entity.Paciente;

import java.util.List;

public interface IPacienteService {

    Paciente registrarPaciente(Paciente paciente);
    List<Paciente> listarPacientes();
}
