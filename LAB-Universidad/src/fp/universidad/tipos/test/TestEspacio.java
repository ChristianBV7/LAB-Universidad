package fp.universidad.tipos.test;

import fp.universidad.tipos.Espacio;
import fp.universidad.tipos.TipoEspacio;

public class TestEspacio {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Espacio p1= new Espacio(TipoEspacio.EXAMEN,"A310", 3, 2);
		System.out.println(p1);
		System.out.println(p1.getTipo());;

	}

}

