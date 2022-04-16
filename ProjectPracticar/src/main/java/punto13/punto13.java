package punto13;

import java.time.LocalDate;

//import punto13.Empleado;

public class punto13 {
 
	public static void main(String[] args) {
		Empleado emp= new Empleado("jose",LocalDate.of(2022, 4, 15),1987,"jose@gmail.com",180);
		
//		System.out.println(emp.getNombre());
//		System.out.println(emp.getFingreso());
//		System.out.println(emp.getLegajo());
//		System.out.println(emp.getMail());
//		System.out.println(emp.getHorastrabajadas());
//		System.out.println(emp.getSueldo());
		System.out.println(emp);
	}
}
