package com.example.productoempresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productoempresa.entities.MovimientoDinero;

@Repository
public interface RepositoryMovimientoDinero extends JpaRepository <MovimientoDinero, Long>{
    MovimientoDinero save(MovimientoDinero mov);
}
