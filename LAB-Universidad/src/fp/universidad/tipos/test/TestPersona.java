package fp.universidad.tipos.test;

import java.time.LocalDate;

 

import fp.universidad.tipos.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		
		Persona p1= new Persona( "christian", "ballesta valderrama", LocalDate.of(2006,4 ,14 ), " 23234414a","djdjweoefxd.com");
		Persona p2= new Persona( "christian", "ballesta valderrama", LocalDate.of(2006,4 ,14 ), " 23231444a","djdjweoefxd.com");
		
		System.out.println(p1);
		System.out.println(p1.compareTo(p2));
	
		
		
		
		

		
	}

}
