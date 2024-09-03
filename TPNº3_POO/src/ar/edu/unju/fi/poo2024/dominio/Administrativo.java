package ar.edu.unju.fi.poo2024.dominio;

import java.time.LocalDate;

public class Administrativo extends Empleado {
	private byte categoria;
	
	public Administrativo(long id, String nombre, String legajo, LocalDate fechaNacimiento, byte cantidadHijos,
			byte aniosDeAntiguedad, double sueldoBasico, byte categoria) {
		super(id, nombre, legajo, fechaNacimiento, cantidadHijos, aniosDeAntiguedad, sueldoBasico);
	}

	public byte getCategoria() {
		return categoria;
	}

	public void setCategoria(byte categoria) {
		this.categoria = categoria;
	}
	
}
