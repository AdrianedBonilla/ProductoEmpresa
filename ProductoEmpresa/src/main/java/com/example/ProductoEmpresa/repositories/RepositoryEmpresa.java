package com.example.productoempresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productoempresa.entities.Empresa;

@Repository
public interface RepositoryEmpresa extends JpaRepository<Empresa, Long>{
    //Empresa save(Empresa fac);
    // void delete(Empresa fac);
    //Empresa update(Long id, Empresa fac);
}
