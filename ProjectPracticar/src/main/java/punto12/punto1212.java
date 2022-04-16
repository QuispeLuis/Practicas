package punto12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class punto1212 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float altura;
		double tiempo;
		double gravedad=9.81;
		System.out.print("Ingrese la Altura: ");
		try {
			altura = entrada.nextFloat();
			if (altura >0) {
				tiempo = (double) Math.sqrt((2*altura)/gravedad);
				System.out.println("el tiempo de caida es: "+tiempo+" seg");	
			}
			else {
				System.out.println("Debe ingresar un valor positivo");
			}		
		} catch (InputMismatchException e) {
			System.out.println("Error! Debe ingresar un valor numerico");
		}	
		entrada.close();
	}

}
