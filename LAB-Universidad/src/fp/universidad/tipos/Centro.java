package fp.universidad.tipos;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import fp.utiles.Checkers;

public class Centro implements Comparable <Centro>{
	
	
	private String nombre;
	private String direccion;
	private Integer plantas;
	private Integer sotanos;
	private Set<Espacio> espacio;
	
	
	
	
	
	
	public Centro(String nombre, String direccion, Integer plantas, Integer sotanos) {
		
		
		
		Checkers.check("numero de plantas incorrecto", plantas>=1);
		Checkers.check("numero de sotanos incorrecto", sotanos>=0);
		this.nombre = nombre;
		this.direccion = direccion;
		this.plantas = plantas;
		this.sotanos = sotanos;
		this.espacio = new HashSet<Espacio>();
	}






	public Set<Espacio> getEspacio() {
		
		//retorno una copia de espacio!!!!
		return new HashSet<Espacio>(espacio);
	}






	






	public String getNombre() {
		return nombre;
	}






	public String getDireccion() {
		return direccion;
	}






	public Integer getPlantas() {
		return plantas;
	}






	public Integer getSotanos() {
		return sotanos;
	}






	public String toString() {
		return (nombre );
	}





	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centro other = (Centro) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public int compareTo(Centro o) {
		
		int r;
		
		r= getNombre().compareTo(o.getNombre());
		
		return r;
	}
	 // nuevo espacio
	public void nuevoEspacio( Espacio e) {
		
		Checkers.check("numero espacio incorrecto", e.getPlanta()>= sotanos && e.getPlanta()< plantas);
		
		espacio.add(e);
		
		
		
	}
	// elimina espacio
	
	public void eliminaEspacio(Espacio e) {
		
		espacio.remove(e);
		
	}
	
	
	// tratamientos secuenciales
	// devuelva un conjunto con los espacios del centro que sean de tipo laboratorio
	
	
	
	public Set<Espacio> espaciosLaboratorio(){
		Set<Espacio> resultado = new HashSet<Espacio>();
		for ( Espacio e: espacio) {
			if(e.getTipo().equals(TipoEspacio.LABORATORIO)) {
				resultado.add(e);
			}
		}
		return resultado;
	}
	
	
	public int sumaPlantas(int Plantas  ) {
		
		int res=0;
		for(Espacio e: espacio) {
			if(e.getPlanta().equals(plantas)) {
				res= res + e.getCapacidad();
			}
			
			return res;
			}
		return res;
		}
	
	
	public Set<Espacio> getEspacios() {
		// Devolvemos una copia de espacios, esto hay que añadirlo siempre, esto se hace para que no devuelva la lista vacía.
		return new HashSet<Espacio>(getEspacios());
	}
	
	
	public Set<Despachos> getDespacho(){
		
		Set<Despachos> despachos= new HashSet<Despachos>(); 
		
		
		for(Espacio e : getEspacios()) {
			if ( e instanceof Despachos) {
				despachos.add((Despachos) e);
			}
		} return despachos;
		
		
	}
		


public SortedMap<String, Despachos> getDespachosPorProfesor (){
	
	SortedMap<String, Despachos> res= new TreeMap<>();
	for (Despachos d: getDespacho()) {
		for (Profesor p: d.getProfesores()) {
			res.put(p.toString(), d);
		}
		
	}
	return res;
}
}
	



	// dada una planta, devuelva la suma de las capacidades de esa planta
	



