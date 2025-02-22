package com.example.productoempresa.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productoempresa.entities.Empleado;
import com.example.productoempresa.services.ServicioEmpleado;

@RestController
public class ControlEmpleado {


    ServicioEmpleado sEmp1;
    public ControlEmpleado(ServicioEmpleado sEmp1){
        this.sEmp1 = sEmp1;
    }
        
    //http://localhost:8080/empleado
    @GetMapping("/empleado")
    public List<Empleado> empl(){
        return this.sEmp1.getRepository();
    }
}
