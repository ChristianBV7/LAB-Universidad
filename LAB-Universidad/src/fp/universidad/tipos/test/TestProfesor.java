package fp.universidad.tipos.test;

import java.time.LocalDate;

import fp.universidad.tipos.Categoria;
import fp.universidad.tipos.Profesor;

public class TestProfesor {

	public static void main(String[] args) {
		
		
		Profesor p1= new Profesor("Ana", "Garcia", LocalDate.of(1990, 10, 2), "20943567P", "aquatic@gmail.com", Categoria.AYUDANTE );
		
		
		System.out.println(p1);
		// TODO Auto-generated method stub

	}

}
