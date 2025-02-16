package com.example.ProductoEmpresa.Services;
import com.example.ProductoEmpresa.Entities.Empleado;
import com.example.ProductoEmpresa.Entities.Empresa;
public class ServicioEmpresa {
    Empresa fac1;
    ServicioEmpleado sEmp1 = new ServicioEmpleado();
    //Generamos un constructor vacío para activar el servicio
    public ServicioEmpresa(){
        Empleado emp1 = this.sEmp1.getEmpleado();
        /*this.fac1 = new Empresa("MoviTech","Calle 29 sur",
                "8140235-2",3142000, emp1);*/
    }

    //método para devolver la empresa
    public Empresa getEmpresa(){
        return this.fac1;
    }
}
