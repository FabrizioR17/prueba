package com.backend.repository.impl;

import com.backend.model.Odontologo;
import com.backend.repository.IDao;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoEnMemoria implements IDao<Odontologo> {
    private List<Odontologo> registroDeOdontologos= new ArrayList<>();

    private final Logger LOGGER = Logger.getLogger(OdontologoDaoEnMemoria.class);

    public OdontologoDaoEnMemoria(){
        Odontologo odontologo = new Odontologo(1L, 115, "Juan", "Carballo");
        Odontologo odontologo2 = new Odontologo(2L, 119, "Pasa", "Oliva");
        registroDeOdontologos.add(odontologo);
        registroDeOdontologos.add(odontologo2);
    }

    @Override
    public Odontologo registrarOdontologo(Odontologo odontologo) {
        Long id = Long.valueOf(registroDeOdontologos.size() + 1);
        Odontologo odontologoParaRegistrar = new Odontologo(id, odontologo.getNumero_matricula(), odontologo.getNombre(), odontologo.getApellido());
        LOGGER.info("Odontólogo registrado correctamente: " + odontologoParaRegistrar);
        return odontologoParaRegistrar;
    }

    @Override
    public List<Odontologo> listarOdontologo() {
        LOGGER.info("Lista de odontologos registrados actualmente: " + registroDeOdontologos);

        return registroDeOdontologos;
    }
}
