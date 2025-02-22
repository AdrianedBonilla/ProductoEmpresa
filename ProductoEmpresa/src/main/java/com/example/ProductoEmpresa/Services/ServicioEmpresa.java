package com.example.productoempresa.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.productoempresa.entities.Empresa;
import com.example.productoempresa.repositories.RepositoryEmpresa;

@Service
public class ServicioEmpresa {


    private RepositoryEmpresa repositoryEmpresa;

    //Almacenamos en repositorio
    public ServicioEmpresa(RepositoryEmpresa repositoryEmpresa) {
        this.repositoryEmpresa = repositoryEmpresa;
    }

    //Enviamos al controlador
    public List<Empresa> getRepository(){
        return this.repositoryEmpresa.findAll();
    }

    public Empresa crearRegistro(Empresa fac){
        return this.repositoryEmpresa.save(fac);
    }
    public void borrarRegistro(Long id) {
        this.repositoryEmpresa.deleteById(id);
    }
    // public Empresa actualizarRegistro(Long id, Empresa fac) {
    //     return this.repositoryEmpresa.update(id, fac);

    public Empresa actualizarRegistro(Long id, Empresa fac) {
        Empresa empresaExistente = this.repositoryEmpresa.findById(id).orElseThrow(() -> new RuntimeException("Empresa no encontrada"));
        empresaExistente.setId(fac.getId());
        empresaExistente.setNombre(fac.getNombre());
        empresaExistente.setDireccion(fac.getDireccion());
        empresaExistente.setNit(fac.getNit());
        empresaExistente.setTelefono(fac.getTelefono());
        return this.repositoryEmpresa.save(empresaExistente);
    }
}
