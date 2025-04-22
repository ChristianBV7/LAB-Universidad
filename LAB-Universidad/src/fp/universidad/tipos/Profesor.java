package fp.universidad.tipos;

import java.time.DayOfWeek;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import fp.utiles.Checkers;

public class Profesor extends Persona{
	
	private Categoria categoria;
	private SortedSet<Tutoria> tutoria;
	private  Map<Asignatura,Double> mapa;
	
	
	public Profesor(String nombre, String apellidos,  LocalDate fechaNacimiento, String dni, String email, Categoria categoria) {
		super(nombre, apellidos, fechaNacimiento, dni, email);
		
		Checkers.check("profesor tiene que ser mayor de 18 años", getEdad()>=18);
		this.categoria= categoria;
		this.tutoria= new TreeSet<Tutoria>();
		this.mapa= new HashMap<Asignatura, Double>();
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
	
	 public List<Asignatura> getAsignaturas() {
	        return new ArrayList<>(mapa.keySet());
	    }

	    public List<Double> getCreditos() {
	        return new ArrayList<>(mapa.values());
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
			
			
			  public boolean imparteAsignatura(Asignatura asignatura, double creditos) {
			        if (creditos <= 0 || creditos > asignatura.creditos()) {
			            return false;
			        }
			        double totalCreditos = getDedicacionTotal() - mapa.getOrDefault(asignatura, 0.0) + creditos;
			        if (totalCreditos > 24) {
			            return false;
			        }
			        mapa.put(asignatura, creditos);
			        return true;
			    }

			    public void eliminaAsignatura(Asignatura asignatura) {
			        mapa.remove(asignatura);
			    }

			    public double dedicacionAsignatura(Asignatura asignatura) {
			        return mapa.getOrDefault(asignatura, 0.0);
			    }

			    public double getDedicacionTotal() {
			        double total = 0.0;
			        for (double creditos : mapa.values()) {
			            total += creditos;
			        }
			        return total;
			    }
			    
			    
			 

}
