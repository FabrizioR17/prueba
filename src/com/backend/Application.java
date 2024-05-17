package com.backend;

import com.backend.model.Odontologo;
import com.backend.repository.dbconnection.H2Connection;
import com.backend.repository.impl.OdontologoDaoEnMemoria;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        H2Connection.ejecutarScriptInicial();
    }
}
