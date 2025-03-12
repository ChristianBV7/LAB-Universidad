package fp.universidad.tipos;

import java.util.Set;

import fp.utiles.Checkers;

public class Despachos extends Espacio{
	
	
	
	private Set<Profesor> profesores;
	
	private TipoEspacio tipo;
	private String espacio;
	private Integer capacidad;
	private Integer planta;
	
	public Despachos( String espacio, Integer capacidad, Integer planta) {
	
	super(TipoEspacio.OTROTIPO, espacio, capacidad, planta);
	
	
	Checkers.check("demasiados profesores", getCapacidad()>= profesores.size());
	
	}
	
	//Para asegurar la integridad de los datos, se debe tener en cuenta que el número de profesores
	//que ocupan un despacho no puede superar la capacidad del mismo. También se debe asegurar que el tipo de
	//espacio asignado a un despacho siempre tiene que ser el correspondiente a ‘otro tipo’. Por lo tanto, si
	//se intenta invocar 
	//a la operación setTipo, heredada del tipo Espacio, se debe elevar la excepción UnsupportedOperationException.

	
}
