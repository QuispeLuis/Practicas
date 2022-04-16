package punto14;

import java.time.LocalDate;

public class Empleado {
	
	private String nombre;
	private LocalDate fingreso = LocalDate.of(1900,01,01);
	private int legajo = -9999;
	private String mail;
	private int sueldo;
	private int horastrabajadas;
	
	
	
	public Empleado() { //constructor por defecto
		super();
//		this.legajo=-9999;
//		this.fingreso=LocalDate.of(1900,01,01);
	}
	
	public Empleado(String nombre, int legajo, int horastrabajadas) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.horastrabajadas = horastrabajadas;
	}

	public Empleado(String nombre, LocalDate fingreso, int horastrabajadas) {
		super();
		this.nombre = nombre;
		this.fingreso = fingreso;
		this.horastrabajadas = horastrabajadas;
	}

	public Empleado(String nombre, int horastrabajadas) {
		super();
		this.nombre = nombre;
		this.horastrabajadas = horastrabajadas;
	}
	

//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public LocalDate getFingreso() {
//		return fingreso;
//	}
//
//	public void setFingreso(LocalDate fingreso) {
//		this.fingreso = fingreso;
//	}
//
//	public int getLegajo() {
//		return legajo;
//	}
//
//	public void setLegajo(int legajo) {
//		this.legajo = legajo;
//	}
//
//	public String getMail() {
//		return mail;
//	}
//
//	public void setMail(String mail) {
//		this.mail = mail;
//	}
//
//	public int getSueldo() {
//		return sueldo;
//	}
//
//	public void setSueldo(int sueldo) {
//		this.sueldo = sueldo;
//	}
//
//	public int getHorastrabajadas() {
//		return horastrabajadas;
//	}
//
//	public void setHorastrabajadas(int horastrabajadas) {
//		this.horastrabajadas = horastrabajadas;
//	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fingreso=" + fingreso + ", legajo=" + legajo + ", mail=" + mail
				+ ", sueldo=" + sueldo + ", horastrabajadas=" + horastrabajadas + "]";
	}

}
