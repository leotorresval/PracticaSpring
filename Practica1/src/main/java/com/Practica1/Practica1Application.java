package com.Practica1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Practica1.models.UsrRol;
import com.Practica1.services.UsrRolService;

@SpringBootApplication
public class Practica1Application implements CommandLineRunner {
	
	@Autowired
	private UsrRolService usrRolService;

	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);
	}
	
	public void run(String... args) throws Exception{
		System.out.println("Hola mundo");
		usrRolService.ingresarNuevoRol(new UsrRol(new Long(1), "Juan", "Casado","Ninguna"));
		usrRolService.ingresarNuevoRol(new UsrRol(new Long(2), "Pedro", "Casado","Ninguna"));
		
		
		usrRolService.obtenerTodosRol().forEach(rol->{
			System.out.println(rol.getNombre());
		});
		usrRolService.actualizarRol(new UsrRol(new Long(2), "Torres", "Casado","Ninguna"));
		usrRolService.eliminarRol(new UsrRol(new Long(2), "Torres", "Casado","Ninguna"));
	}

}
