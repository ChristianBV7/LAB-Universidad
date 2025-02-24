package fp.universidad.tipos.test;

import fp.universidad.tipos.Asignatura;
import fp.universidad.tipos.TipoAsignatura;

public class TestAsignatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Asignatura fp= new Asignatura("fundamentos de programacion", "0000325", 12.0, TipoAsignatura.ANUAL,  1);
		
		System.out.println(fp);
		
		System.out.println(fp);
		
		
		Asignatura adda= new Asignatura("analisis y diseños de datos y algoritmos","0000589", 12.0, TipoAsignatura.ANUAL, 2);
		
		
		System.out.println(fp.compareTo(adda));
		System.out.println(fp.equals(adda));
		
	}

	
	

	}



