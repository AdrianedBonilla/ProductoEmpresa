package com.example.ProductoEmpresa.Controllers;

import com.example.ProductoEmpresa.Entities.MovimientoDinero;
import com.example.ProductoEmpresa.Services.ServicioMovimientoDinero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlMovimientoDinero {

    ServicioMovimientoDinero sMovDinero = new
            ServicioMovimientoDinero();
    MovimientoDinero movDinero1;

    public ControlMovimientoDinero(){
        this.movDinero1 = this.sMovDinero.getMovimientoDinero();
    }

    //http://localhost:8080/movimiento
    @GetMapping("/movimiento")
    public MovimientoDinero movimiento(){
        return this.movDinero1;
    }
}
