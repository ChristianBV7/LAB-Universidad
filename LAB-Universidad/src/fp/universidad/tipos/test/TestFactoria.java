package fp.universidad.tipos.test;

import java.util.List;

import fp.universidad.tipos.Despachos;
import fp.universidad.tipos.Espacio;
import fp.universidad.tipos.FactoriaUniversidad;

public class TestFactoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	List<Espacio> espacios= FactoriaUniversidad.leeEspacios("C:\\Users\\aquat\\Desktop\\java\\LAB-Universidad\\LAB-Universidad\\src\\data\\espacios.csv");
	
	for(Espacio e: espacios) {
		System.out.println(e);
	}
	
	
	
List<Despachos> despachoss= FactoriaUniversidad.leeDespachos("C:\\Users\\aquat\\Desktop\\java\\LAB-Universidad\\LAB-Universidad\\src\\data\\despachos.csv");
	
	for(Despachos e: despachoss) {
		System.out.println(e);
}
	}
}
	
	


