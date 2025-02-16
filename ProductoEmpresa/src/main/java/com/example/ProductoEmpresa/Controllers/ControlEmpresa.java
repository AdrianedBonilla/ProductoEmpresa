package com.example.ProductoEmpresa.Controllers;

import com.example.ProductoEmpresa.Entities.Empresa;
import com.example.ProductoEmpresa.Services.ServicioEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpresa {
    ServicioEmpresa sFac1 = new ServicioEmpresa();
    Empresa fac1;
    //Constructor
    public ControlEmpresa(){
        this.fac1 = this.sFac1.getEmpresa();
    }

    //metodo para visualizar la empresa
    //http://localhost:8080/empresa
    @GetMapping("/empresa")
    public Empresa empresa(){
        return this.fac1;
    }


}
