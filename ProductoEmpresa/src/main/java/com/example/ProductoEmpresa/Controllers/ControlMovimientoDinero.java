package com.example.productoempresa.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productoempresa.entities.MovimientoDinero;
import com.example.productoempresa.services.ServicioMovimientoDinero;

@RestController
public class ControlMovimientoDinero {

    ServicioMovimientoDinero sMovDinero;
          
    public ControlMovimientoDinero(ServicioMovimientoDinero sMovDinero){
        this.sMovDinero = sMovDinero;
    }

    //http://localhost:8080/movimiento
    @GetMapping("/movimiento")
    public List<MovimientoDinero> mov(){
        return this.sMovDinero.getRepository();
    }
            
}
