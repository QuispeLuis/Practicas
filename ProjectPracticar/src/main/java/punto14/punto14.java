package punto14;

import java.time.LocalDate;

public class punto14 {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado();
		Empleado emp2 = new Empleado("jose",15,150);
		Empleado emp3 = new Empleado("jose2",LocalDate.of(2022, 4, 15),160);
		Empleado emp4 = new Empleado("jose3",170);

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
	}

}
