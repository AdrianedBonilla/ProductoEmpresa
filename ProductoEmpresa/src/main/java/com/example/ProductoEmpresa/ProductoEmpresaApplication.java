package com.example.ProductoEmpresa;

import com.example.ProductoEmpresa.Entities.Empleado;
import com.example.ProductoEmpresa.Entities.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductoEmpresaApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductoEmpresaApplication.class, args);
//		//Creamos un objeto del tipo empleado
//		Empleado emp1 = new Empleado("Jose",
//				"jose@udea",
//				"MoviTech",
//				"Vendedor",
//				null);
//
//		Empresa fac1 = new Empresa("MoviTech","Calle 29 sur",
//				"8140235-2",3142000,emp1);
//
//		System.out.println(fac1.toString());
	}

}
