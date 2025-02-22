package com.example.productoempresa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //Atributos
    @Column(name = "montoMovimiento")
    private double montoMovimiento;

    @Column(name = "conceptoMovimiento")
    private String conceptoMovimiento;

    //Constructor
    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
    }

    //getters and setters

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    //Creamos el método crearMonto
    public double crearMonto(){
        return -1;
    }

    //Creamos el método usuarioEncargadoRegistrarMovimiento
    public String usuarioEncargadoRegistrarMovimiento(){
        return "-1";
    }

    //toString

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "montoMovimiento=" + montoMovimiento +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                '}';
    }
}
