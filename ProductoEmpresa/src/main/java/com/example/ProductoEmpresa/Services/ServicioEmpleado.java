package com.example.productoempresa.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productoempresa.entities.Empleado;
import com.example.productoempresa.repositories.RepositoryEmpleado;

@Service
public class ServicioEmpleado {

    private RepositoryEmpleado repositoryEmpleado;

    public ServicioEmpleado(RepositoryEmpleado repositoryEmpleado){
        this.repositoryEmpleado = repositoryEmpleado;
    }

    public List<Empleado> getRepository(){
        return this.repositoryEmpleado.findAll();
    }

    public Empleado crearRegistro(Empleado empleado){
        return this.repositoryEmpleado.save(empleado);
    }

}
