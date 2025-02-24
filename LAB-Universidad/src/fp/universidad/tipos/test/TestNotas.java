package fp.universidad.tipos.test;

import java.time.LocalDate;

import fp.universidad.tipos.Notas;
import fp.universidad.tipos.TipoNotas;

public class TestNotas {

	public static void main(String[] args) {
		
		
		
		
		Notas x = new Notas("mates", LocalDate.of(2023, 4, 10), 9.0, true , TipoNotas.PRIMERACONVOCATORIA, "matriculaaaaaa");
		Notas z = new Notas("mates", LocalDate.of(2023, 4, 10), 9.0, true , TipoNotas.PRIMERACONVOCATORIA, "matriculaaaaaa");
		
			
			System.out.println(x );
			System.out.println(x.compareTo(z));


		}

	

		// TODO Auto-generated method stub

	}


