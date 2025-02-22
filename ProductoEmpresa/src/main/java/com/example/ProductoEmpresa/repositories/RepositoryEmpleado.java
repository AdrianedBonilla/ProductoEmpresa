package com.example.productoempresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productoempresa.entities.Empleado;

@Repository
public interface RepositoryEmpleado extends JpaRepository<Empleado, Long>{
    // Empleado save(Empleado emp);
    // void delete(Empleado emp);
}
