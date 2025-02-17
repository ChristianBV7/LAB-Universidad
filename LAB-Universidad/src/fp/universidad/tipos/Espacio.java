package fp.universidad.tipos;

public class Espacio {

	
	private TipoEspacio tipo;
	private String espacio;
	private Integer capacidad;
	private Integer planta;
	
	
	
	
	
	
	

		
		
		
	public Espacio(TipoEspacio tipo, String espacio, Integer capacidad, Integer planta) {
		super();
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
		 return  espacio + "(" + planta + ")";
		
		
	}
	
	
	
}

	
	
	

