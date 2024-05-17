package com.backend.service.impl;

import com.backend.model.Odontologo;
import com.backend.repository.IDao;
import com.backend.service.IOdontologoService;

import java.util.List;

public class OdontologoService implements IOdontologoService {
    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    @Override
    public Odontologo registrarOdontologo(Odontologo odontologo) {
        return odontologoIDao.registrarOdontologo(odontologo);
    }

    @Override
    public List<Odontologo> listarOdontologo() {
        return odontologoIDao.listarOdontologo();
    }
}
