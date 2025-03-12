package fp.universidad.tipos.test;

import java.time.LocalDate;
import fp.universidad.tipos.Notas;

import fp.universidad.tipos.Expediente;
import fp.universidad.tipos.TipoNotas;

public class TestExpediente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expediente warren= new Expediente();
		Notas n= new Notas("mates", LocalDate.of(2023, 4, 10), 9.0, true , TipoNotas.PRIMERACONVOCATORIA, "matriculaaaaaa");
		
		Notas x = new Notas("mates", LocalDate.of(2023, 4, 10), 10.0, true , TipoNotas.PRIMERACONVOCATORIA, "matriculaaaaaa");
		warren.nuevaNota(n);
		warren.nuevaNota(x);
		
		System.out.println(warren);
		
		warren.getNotazas().remove(x);
		System.out.println(warren);
		
	}

	

	
	
	
}
