package com.backend.repository.impl;

import com.backend.model.Odontologo;
import com.backend.repository.IDao;

import java.util.List;

public class OdontologoDaoEnMemoria implements IDao<Odontologo> {
    private List<Odontologo> odontologoRepositorio;

    public OdontologoDaoEnMemoria(List<Odontologo> odontologoRepositorio){
        this.odontologoRepositorio = odontologoRepositorio;
    }

    @Override
    public Odontologo registrarOdontologo(Odontologo odontologo) {
        odontologoRepositorio.add(odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarOdontologo() {
        return odontologoRepositorio;
    }
}
