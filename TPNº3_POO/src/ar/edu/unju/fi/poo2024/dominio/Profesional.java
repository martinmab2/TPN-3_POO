package ar.edu.unju.fi.poo2024.dominio;

import java.time.LocalDate;

public class Profesional extends Empleado{
	private byte cantidadTitulos;
	
	public Profesional(long id, String nombre, String legajo, LocalDate fechaNacimiento, byte cantidadHijos,
			byte aniosDeAntiguedad, double sueldoBasico, String archivoSalarioPorTitulo, byte cantidadTitulos) {
		super(id, nombre, legajo, fechaNacimiento, cantidadHijos, aniosDeAntiguedad, sueldoBasico);
		this.cantidadTitulos = cantidadTitulos;
	}
	
	public byte getCantidadTitulos() {
		return cantidadTitulos;
	}
	public void setCantidadTitulos(byte cantidadTitulos) {
		this.cantidadTitulos = cantidadTitulos;
	}
	
	
}
