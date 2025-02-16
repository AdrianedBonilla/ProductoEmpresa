package com.example.ProductoEmpresa.Controllers;

import com.example.ProductoEmpresa.Entities.Empleado;
import com.example.ProductoEmpresa.Services.ServicioEmpleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpleado {
    ServicioEmpleado sEmp1 = new ServicioEmpleado();
    Empleado emp1;

    //Constructor
    public ControlEmpleado(){
        this.emp1 = this.sEmp1.getEmpleado();
    }

    //http://localhost:8080/empleado
    @GetMapping("/empleado")
    public Empleado empleado(){
        return this.emp1;
    }
}
