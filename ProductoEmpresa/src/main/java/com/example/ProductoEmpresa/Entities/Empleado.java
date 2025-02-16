package com.example.ProductoEmpresa.Entities;


import jakarta.persistence.*;

//import jakarta.persistence.Entity;
@Entity
@Table(name = "empleado")
public class Empleado {
    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    @Column(name = "empresaEmpleadoPertenece")
    private String empresaEmpleadoPertenece;

    @Column(name = "rolEmpleado")
    private String rolEmpleado;

    @Transient
    //Objeto de la clase movimientoDinero
    MovimientoDinero movimientoDinero1;

    //Constructor


    public Empleado(String nombre, String correo, String empresaEmpleadoPertenece, String rolEmpleado, MovimientoDinero movimientoDinero1) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
        this.rolEmpleado = rolEmpleado;
        this.movimientoDinero1 = movimientoDinero1;
    }

    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaEmpleadoPertenece() {
        return empresaEmpleadoPertenece;
    }

    public void setEmpresaEmpleadoPertenece(String empresaEmpleadoPertenece) {
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public MovimientoDinero getMovimientoDinero1() {
        return movimientoDinero1;
    }

    public void setMovimientoDinero1(MovimientoDinero movimientoDinero1) {
        this.movimientoDinero1 = movimientoDinero1;
    }

    //toString

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresaEmpleadoPertenece='" + empresaEmpleadoPertenece + '\'' +
                ", rolEmpleado='" + rolEmpleado + '\'' +
                ", movimientoDinero1=" + this.movimientoDinero1 +
                '}';
    }
}
