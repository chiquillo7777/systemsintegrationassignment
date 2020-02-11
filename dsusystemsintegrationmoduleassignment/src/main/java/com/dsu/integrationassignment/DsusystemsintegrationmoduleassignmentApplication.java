package com.dsu.integrationassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsusystemsintegrationmoduleassignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsusystemsintegrationmoduleassignmentApplication.class, args);
		
		String texto1 = "war";
		String texto2 = "war";
		
		System.out.println("Iguales? " + texto1.equals(texto2));
		System.out.println("Iguales? " + texto1 == texto2);
		
		//===
	}

}
