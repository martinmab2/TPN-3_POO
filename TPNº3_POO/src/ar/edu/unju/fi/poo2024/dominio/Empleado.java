package ar.edu.unju.fi.poo2024.dominio;

import java.time.LocalDate;

public abstract class Empleado {
	private long id;
	private String nombre;
	private String legajo;
	private LocalDate fechaNacimiento;
	private byte cantidadHijos;
	private byte aniosDeAntiguedad;
	private double sueldoBasico=150000.00;
	
	public Empleado(long id, String nombre, String legajo, LocalDate fechaNacimiento, byte cantidadHijos,
			byte aniosDeAntiguedad, double sueldoBasico) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.legajo = legajo;
		this.fechaNacimiento = fechaNacimiento;
		this.cantidadHijos = cantidadHijos;
		this.aniosDeAntiguedad = aniosDeAntiguedad;
		this.sueldoBasico = 150000.00;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public byte getCantidadHijos() {
		return cantidadHijos;
	}
	public void setCantidadHijos(byte cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	public byte getAniosDeAntiguedad() {
		return aniosDeAntiguedad;
	}
	public void setAniosDeAntiguedad(byte aniosDeAntiguedad) {
		this.aniosDeAntiguedad = aniosDeAntiguedad;
	}
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	
}
