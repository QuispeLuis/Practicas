package com.example.demo.model;

import java.time.LocalDate;

public class Alumno {
	
	private String nombre;
	private LocalDate fechaIngreso;
	private String carrera;
	private int curso;
	private String libretaUniversitaria;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Alumno(String nombre, LocalDate fechaIngreso, String carrera, int curso, String libretaUniversitaria) {
		super();
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.carrera = carrera;
		this.curso = curso;
		this.libretaUniversitaria = libretaUniversitaria;
	}



	public Alumno(String nombre, String carrera,int curso) {
		this.nombre = nombre;
		this.carrera = carrera;
		this.curso = curso;
		this.fechaIngreso = LocalDate.of(1900, 1, 1);
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public String getLibretaUniversitaria() {
		return libretaUniversitaria;
	}
	public void setLibretaUniversitaria(String libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", carrera=" + carrera + ", curso="
				+ curso + ", libretaUniversitaria=" + libretaUniversitaria + "]";
	}
	
	

}
