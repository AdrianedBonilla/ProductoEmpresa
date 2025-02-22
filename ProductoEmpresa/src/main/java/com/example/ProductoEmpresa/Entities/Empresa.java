package com.example.productoempresa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Empresa")

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Atributos
    @Column(name ="nombre")
    private String nombre;

    @Column(name ="direccion")
    private String direccion;

    @Column(name = "nit")
    private String nit;

    @Column(name = "telefono")
    private String telefono;

    @Transient
    //objeto empleado
    Empleado empleado1;

    //Constructor

    public Empresa() {
    }   

    public Empresa(long id, String nombre, String direccion, String nit, String telefono, Empleado empleado1) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = telefono;
        this.empleado1 = empleado1;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    //toString

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nit='" + nit + '\'' +
                ", telefono=" + telefono +
                ", empleado1=" + empleado1 +
                '}';
    }

}
