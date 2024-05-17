package com.backend.test;

import com.backend.model.Odontologo;
import com.backend.repository.impl.OdontologoDaoEnMemoria;

import com.backend.repository.impl.OdontologoDaoH2;
import com.backend.service.impl.OdontologoService;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

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

        Odontologo odontologo = new Odontologo(12345, "Juan", "Perez");

        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);

        assertNotNull(odontologoRegistrado.getId());
    }

    @Test
    void deberiaRestirnarseUnaListaNoVaciaDeOdontologoEnMemoria(){
        odontologoService = new OdontologoService(new OdontologoDaoEnMemoria(new ArrayList<Odontologo>()));
        assertFalse(odontologoService.listarOdontologo().isEmpty());
    }



}
