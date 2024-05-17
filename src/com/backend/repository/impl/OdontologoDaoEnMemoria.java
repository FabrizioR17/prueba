package com.backend.repository.impl;

import com.backend.model.Odontologo;
import com.backend.repository.IDao;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoEnMemoria implements IDao<Odontologo> {
    private List<Odontologo> odontologoRepositorio;
    private final Logger LOGGER = Logger.getLogger(OdontologoDaoEnMemoria.class);

    public OdontologoDaoEnMemoria(List<Odontologo> odontologoRepositorio){
        this.odontologoRepositorio = odontologoRepositorio;
    }

    @Override
    public Odontologo registrarOdontologo(Odontologo odontologo) {

        try{

        }catch(Exception e){

        }finally{

        };
        odontologoRepositorio.add(odontologo);
        LOGGER.info("Odontólogo registrado correctamente: " + odontologoRepositorio);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarOdontologo() {
        LOGGER.info("Lista de odontologos registrados actualmente: " + odontologoRepositorio);

        return odontologoRepositorio;
    }
}
