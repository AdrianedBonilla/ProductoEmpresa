package com.example.ProductoEmpresa.Services;

import com.example.ProductoEmpresa.Entities.MovimientoDinero;

public class ServicioMovimientoDinero {
    MovimientoDinero movimientoDinero1;
    //Constructor
    public ServicioMovimientoDinero(){
        this.movimientoDinero1 = new MovimientoDinero(
                100000,
                "Mouse");
    }

    //Método para visdualizatr el mobviemitn
    public MovimientoDinero getMovimientoDinero(){
        return this.movimientoDinero1;
    }
}
