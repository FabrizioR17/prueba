package com.backend.clinicaOdontologica.service.impl;

import com.backend.clinicaOdontologica.entity.Paciente;
import com.backend.clinicaOdontologica.repository.IDao;
import com.backend.clinicaOdontologica.service.IPacienteService;

import java.util.List;

public class PacienteService implements IPacienteService {

    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    @Override
    public Paciente registrarPaciente(Paciente paciente) {
        return pacienteIDao.registrar(paciente);
    }

    @Override
    public List<Paciente> listarPacientes() {
        return pacienteIDao.listarTodos();
    }
}
