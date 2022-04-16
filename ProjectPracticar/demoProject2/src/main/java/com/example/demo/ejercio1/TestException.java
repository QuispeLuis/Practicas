package com.example.demo.ejercio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		//Uso de exceptions
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese dividendo:");
		String dividendoString = teclado.next();
		System.out.println("Ingrese divisor:");
		String divisorString = teclado.next();
		try {
		    int cociente = Integer.parseInt(dividendoString) / Integer.parseInt(divisorString);
			System.out.println("El cociente es: " + cociente);
		} catch (NumberFormatException e){
			System.out.println("El valor ingreso no es numerico: " + e.getMessage());
		} catch (ArithmeticException e){
			System.out.println("La operación cociente no se puede realizar: " + e.getMessage());
		} finally {
			teclado.close();
		}
		
		System.out.println("Proxima sentencia");
		
		Scanner lector = null;
		File archivo = new  File("/tmp/datos.dat");
		//File archivo = new  File("C:\\datos.dat");
		try {
			lector = new Scanner(archivo);
			while (lector.hasNextLine()) {
				System.out.println(lector.nextLine());
			}	
		} catch (FileNotFoundException e) {
			System.out.println("Ocurrio un error " + e.getMessage());
		} finally {
			if (lector != null) {
				lector.close();
			}
		}
		
	}

}
