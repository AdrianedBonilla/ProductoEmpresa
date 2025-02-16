package com.example.ProductoEmpresa.Services;

import com.example.ProductoEmpresa.Entities.Empleado;
import com.example.ProductoEmpresa.Entities.MovimientoDinero;

public class ServicioEmpleado {
    ServicioMovimientoDinero sMovDinero1 = new
            ServicioMovimientoDinero() ;
    Empleado emp1;
    //Constructor
    public ServicioEmpleado(){
        MovimientoDinero movDinero1 =
                this.sMovDinero1.getMovimientoDinero();

//        this.emp1 = new Empleado("Jose",
//                "jose@udea",
//                "MoviTech",
//                "Vendedor",
//                movDinero1);
    }

    //Método para obtener el empleado
    public Empleado getEmpleado(){
        return this.emp1;
    }
}
