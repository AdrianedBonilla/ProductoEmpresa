package com.example.productoempresa.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.productoempresa.entities.Empresa;
import com.example.productoempresa.services.ServicioEmpresa;


@RestController
public class ControlEmpresa {

    ServicioEmpresa sFac1;

    public ControlEmpresa(ServicioEmpresa sFac1){
        this.sFac1 = sFac1;
    }

    //http://localhost:8080/empresa
    @GetMapping("/empresa")
    public List<Empresa> fac(){
        return this.sFac1.getRepository();
    }

    @PostMapping("/empresa")
    public Empresa crearEmpresa(@RequestBody Empresa fac){
        return this.sFac1.crearRegistro(fac);
    }

 @DeleteMapping("/empresa/{id}")
    public void borrarEmpresa(@PathVariable Long id) {
        this.sFac1.borrarRegistro(id);
    }
    @PutMapping("empresa/{id}")
    public Empresa modificaeEmpresa(@PathVariable Long id, @RequestBody Empresa fac){        
        return this.sFac1.actualizarRegistro(id, fac);
    }
}
