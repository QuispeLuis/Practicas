package com.example.demo.ejercio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TestFechas {

	public static void main(String[] args) {
		// uso de fechas
		LocalDate fecha1 = LocalDate.now();
		System.out.println(fecha1);
		LocalDate fecha2 = LocalDate.of(2022, 4, 11);
		System.out.println(fecha2);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresar una fecha: "); String fechaStr = scanner.next();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			LocalDate fecha3 = LocalDate.parse(fechaStr, formateador);
			System.out.println(fecha3); 
			System.out.println(formateador.format(fecha3));
		} catch (DateTimeParseException e) { System.out.println("sdasd" +
				e.getMessage()); }catch (Exception e) { System.out.println(e.getMessage()); 
		}
		 
		
		/*LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		LocalTime time2 = LocalTime.of(19, 10, 30);
		System.out.println(time2);*/
		
		/*LocalDateTime dateTime1 = LocalDateTime.of(2020, 10, 20, 22, 15, 10);
		System.out.println(dateTime1);*/
		
		Period periodo = Period.between(fecha2, fecha1);
		System.out.println("han transcurrido "+periodo.getYears()+" años, "+periodo.getMonths()+ " meses y "+periodo.getDays()+ "días ");
		
		if(fecha1.isAfter(fecha2)) {
			System.out.println("fecha1 es posterior a fecha2");
		}else if(fecha1.isBefore(fecha2)) {
			System.out.println("fecha1 es anterior a fecha2");
		}else {
			System.out.println("Ambas fechas son iguales");
			
		}
		
	}

}
