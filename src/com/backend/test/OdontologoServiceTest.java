package com.backend.test;

import com.backend.model.Odontologo;
import com.backend.repository.impl.OdontologoDaoEnMemoria;

import com.backend.repository.impl.OdontologoDaoH2;
import com.backend.service.impl.OdontologoService;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OdontologoServiceTest {

    private OdontologoService odontologoService;
    @Test
    void deberiaRetornarseUnaListaNoVaciaDeOdontologosEnH2() {
        odontologoService = new OdontologoService(new OdontologoDaoH2());
        assertFalse(odontologoService.listarOdontologo().isEmpty());
    }


    @Test
    void deberiaRegistrarseUnOdontologoYObtenerElIdCorrespondiente() {
        odontologoService = new OdontologoService(new OdontologoDaoH2());

        Odontologo odontologoRegistrado = new Odontologo(12345, "Juan", "Perez");

        Odontologo odontoloRegistrado = odontologoService.registrarOdontologo(odontologoRegistrado);

        assertNotNull(odontoloRegistrado.getId());
    }

    @Test
    void deberiaregistrarUnodontologoYDevolverElID() {
        odontologoService = new OdontologoService(new OdontologoDaoEnMemoria());
        Odontologo odontologoARegistrar = new Odontologo(1001, "Moon", "Amstrong");

        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologoARegistrar);
        assertNotNull(odontologoRegistrado.getId());
    }

    @Test
    void deberiaRetornarUnaListaNoVaciaDeMemoria() {
        odontologoService = new OdontologoService(new OdontologoDaoEnMemoria());
        assertFalse(odontologoService.listarOdontologo().isEmpty());
    }

}
