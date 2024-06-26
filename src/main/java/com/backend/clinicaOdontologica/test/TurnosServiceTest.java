package com.backend.clinicaOdontologica.test;

import com.backend.clinicaOdontologica.entity.Odontologo;
import com.backend.clinicaOdontologica.entity.Turno;
import com.backend.clinicaOdontologica.repository.impl.OdontologoDaoH2;
import com.backend.clinicaOdontologica.repository.impl.TurnoEnH2;
import com.backend.clinicaOdontologica.service.impl.OdontologoService;

import com.backend.clinicaOdontologica.entity.Domicilio;
import com.backend.clinicaOdontologica.entity.Paciente;
import com.backend.clinicaOdontologica.repository.impl.PacienteDaoH2;
import com.backend.clinicaOdontologica.service.impl.PacienteService;

import com.backend.clinicaOdontologica.service.impl.TurnoService;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class TurnosServiceTest {
    private TurnoService turnoService;

    @Test
    public void deberiaRegistrarseUnTurnoYObtenerelIdCorrespondiente(){

        turnoService = new TurnoService(new TurnoEnH2());

        Turno turno = new Turno(new Paciente("Sofia", "Barreto", 5548757, LocalDate.of(2022, 05, 02), new Domicilio("Calle", 13, "Localidad", "Provincia")), new Odontologo(544478, "Pomelo", "Rosa"), LocalDateTime.of(2024, 06, 30, 05,01,10));

        Turno turnoregistrado = turnoService.registrarTurno(turno);

        assertNotNull(turnoregistrado.getId());

    }

    @Test
    public void deberiaRetornarseUnaListaNoVaciaDeTurnosEnH2(){

        turnoService = new TurnoService(new TurnoEnH2());
        assertFalse(turnoService.listarTurnos().isEmpty());
    }


}
