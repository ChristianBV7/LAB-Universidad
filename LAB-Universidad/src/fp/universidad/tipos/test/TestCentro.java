package fp.universidad.tipos.test;
import java.util.HashSet;
import java.util.Set;

import fp.universidad.tipos.Centro;
import fp.universidad.tipos.Espacio;
import fp.universidad.tipos.TipoEspacio;


	
	
	


public class TestCentro {

	public static void main(String[] args) {
		
		
		Centro x = new Centro("ETSII", "reina mercedes", 6,4);
		
		
		Espacio lab = new Espacio(TipoEspacio.LABORATORIO, "f1.33", 30, 5);
		x.nuevoEspacio(lab);
		
		
	
		System.out.println(x);
		
		
		

	}
		
		
		
		// TODO Auto-generated method stub

	

}
