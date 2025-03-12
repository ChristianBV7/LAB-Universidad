package fp.universidad.tipos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.SortedSet;
import java.util.TreeSet;

import fp.utiles.Checkers;

public class Profesor extends Persona{
	
	private Categoria categoria;
	private SortedSet<Tutoria> tutoria;
	
	public Profesor(String nombre, String apellidos,  LocalDate fechaNacimiento, String dni, String email, Categoria categoria) {
		super(nombre, apellidos, fechaNacimiento, dni, email);
		
		Checkers.check("profesor tiene que ser mayor de 18 años", getEdad()>=18);
		this.categoria= categoria;
		this.tutoria= new TreeSet<Tutoria>();
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	
	public SortedSet<Tutoria> getTutorias(){
		return new TreeSet<Tutoria>(tutoria);
	}
	
	public void setCategoria(Categoria c) {
		this.categoria=c;
	}

	
	public String toString() {
		
		return super.toString() + "(" + getCategoria() + ")";
		
	}
		
		
		
		// otros metodos
		
		
		public void nuevaTutoria(LocalTime horaInicio, Integer duracionMinutos, DayOfWeek dia) {
			
			tutoria.add(new Tutoria(dia,horaInicio,duracionMinutos));
			
		}
			
			public void borraTutoria(LocalTime horaInicio, DayOfWeek dia) {
				tutoria.remove(new Tutoria(dia, horaInicio, 15));
				
			}
				
				
			public void borraTutorias() {
				tutoria.clear();
			
				
			
			
		
	}
}
