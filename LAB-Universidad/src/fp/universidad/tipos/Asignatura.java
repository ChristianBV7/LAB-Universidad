package fp.universidad.tipos;

public record Asignatura(String nombre, String codigo, 
		Double creditos,TipoAsignatura tipo, Integer curso ) {


	// propiedad derivada
	public String getAcronimo() {
	return null;
	
	}
	
	// nueva representacion como cadena
	
	public String toString() {
		
		return "(" + codigo + ")" + nombre;
	}

	
	
	
	
	
}
