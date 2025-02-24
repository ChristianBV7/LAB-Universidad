package fp.universidad.tipos;

import java.util.Objects;

import fp.utiles.Checkers;

public class Espacio implements Comparable <Espacio>     {

	
	private TipoEspacio tipo;
	private String espacio;
	private Integer capacidad;
	private Integer planta;
	
	
	
	
	
	
	

		
		
		
	public Espacio(TipoEspacio tipo, String espacio, Integer capacidad, Integer planta) {
		super();
		
		Checkers.check("numero incorrecto", capacidad > 0 );
		
		this.tipo = tipo;
		this.espacio = espacio;
		this.capacidad = capacidad;
		this.planta = planta;
	}




	public TipoEspacio getTipo() {
		return tipo;
	}




	public void setTipo(TipoEspacio tipo) {
		this.tipo = tipo;
	}




	public String getEspacio() {
		return espacio;
	}




	public void setEspacio(String espacio) {
		this.espacio = espacio;
	}




	public Integer getCapacidad() {
		return capacidad;
	}




	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}




	public Integer getPlanta() {
		return planta;
	}






	public String toString() {
		 return  espacio + "(" + planta + "," +  capacidad +  ")";
		
		
	}




	@Override
	public int hashCode() {
		return Objects.hash(espacio, planta);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Espacio other = (Espacio) obj;
		return Objects.equals(espacio, other.espacio) && Objects.equals(planta, other.planta);
	}




	@Override
	public int compareTo(Espacio o) {
		
		
		int r;
		
		r= getPlanta().compareTo(o.getPlanta());
		
		
		if (r==0) {
			
			r= getEspacio().compareTo(o.getEspacio());
			
		}
		
		return r;
	}
	
	
	
	
	
	
}

	
	
	

