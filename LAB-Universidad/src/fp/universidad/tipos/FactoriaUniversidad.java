package fp.universidad.tipos;

import java.util.ArrayList;
import java.util.List;

import fp.utiles.Ficheros;

public class FactoriaUniversidad {
	
	
	public static Espacio creaEspacio(String espacioStr) {
		
		return new Espacio(espacioStr);
	}

	
	public static List<Espacio> leeEspacios(String filename){
		
		List<Espacio> espacios= new ArrayList<>();
		List<String> lineas=
				Ficheros.
				leeFichero("error leyendo fichero", filename);
		for(String linea: lineas) {
			espacios.add(creaEspacio(linea));
		
		
		}
	return espacios;
	
	}
	
	
	public static Despachos creaDespachos(String Despachosstr) {
		return new Despachos(Despachosstr);
		
		
		
	}
	
	public static List<Despachos> leeDespachos (String filename){
		
		List<Despachos> despachoss= new ArrayList<>();
		
		List<String> lineas= Ficheros.leeFichero("error leyendo fichero", filename);
		
		for (String linea: lineas) {
			
			despachoss.add(creaDespachos(linea));
		}
		return despachoss;
		
	}

}


