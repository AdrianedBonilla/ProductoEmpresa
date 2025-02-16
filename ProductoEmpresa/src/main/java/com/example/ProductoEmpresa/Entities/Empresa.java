package com.example.ProductoEmpresa.Entities;

import jakarta.persistence.*;

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
    private int telefono;

    @Transient
    //objeto empleado
    Empleado empleado1;

    //Constructor

    public Empresa(String nombre, String direccion, String nit, int telefono, Empleado empleado1) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = telefono;
        this.empleado1 = empleado1;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
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
