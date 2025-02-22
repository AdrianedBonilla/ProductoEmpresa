package com.example.productoempresa.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productoempresa.entities.MovimientoDinero;
import com.example.productoempresa.repositories.RepositoryMovimientoDinero;

@Service
public class ServicioMovimientoDinero {


    private RepositoryMovimientoDinero repositoryMovimientoDinero;

    public ServicioMovimientoDinero(RepositoryMovimientoDinero repositoryMovimientoDinero){
        this.repositoryMovimientoDinero = repositoryMovimientoDinero;
    }

    public List<MovimientoDinero> getRepository(){
        return this.repositoryMovimientoDinero.findAll();
    }

    public MovimientoDinero crearRegistro(MovimientoDinero mov){
        return this.repositoryMovimientoDinero.save(mov);
    }
    }

