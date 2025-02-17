package fp.universidad.tipos.test;

import java.time.LocalDate;

import fp.universidad.tipos.Nota;
import fp.universidad.tipos.TipoNota;

public class TestNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////Fundamentos de Programación, 2014-15, PRIMERA, 7.5, NOTABLE". 
		
		Nota x = new Nota("mates", LocalDate.of(2014, 03, 7), TipoNota.SEGUNDACONVOCATORIA, 9.2, "sobresaliente");
		
		System.out.println(x + x.getEstado());

	}

}
