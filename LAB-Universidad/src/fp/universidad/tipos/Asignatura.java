package fp.universidad.tipos;

import java.util.Objects;

import fp.utiles.Checkers;

public record Asignatura(String nombre, String codigo, 
		Double creditos,TipoAsignatura tipo, Integer curso ) implements Comparable<Asignatura>{

	// constructor compacto para modificar el canonico
	
	public Asignatura{
		Checkers.check("num de creditos incorrecto", creditos>0);
		Checkers.check("curso incorrecto",  curso>=1 && curso<=4);
		Checkers.check("codigo incorrecto",  sonDigitos(codigo)&& codigo.length() == 7);
		
	}
	
	
	private Boolean sonDigitos(String cadena) {
		
		//0000789
		// devuelve verdadero si todas las cadenas son digitos
	
		
		Boolean res= true;
				
				for  (int i=0 ; i <cadena.length(); i++) {
					
					if (!Character.isDigit(cadena.charAt(i))) {
						res= false;
						break;
					}
					
					
				}
				
				return res;
	}
	// propiedad derivada
	public String getAcronimo() {
	return null;
	
	}
	
	// nueva representacion como cadena
	
	public String toString() {
		
		return "(" + codigo + ")" + nombre;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
	
	//criterio de orden
	
	public int compareTo( Asignatura o) {
		
		return codigo.compareTo(o.codigo());
	}

	
	
	
	
	
}
