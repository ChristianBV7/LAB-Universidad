package fp.universidad.tipos.test;

import java.util.HashSet;
import java.util.Set;

import fp.universidad.tipos.Asignatura;
import fp.universidad.tipos.Grado;
import fp.universidad.tipos.TipoAsignatura;

public class TestGrado {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub

	
		// obligatorias
		Asignatura d= new Asignatura("FP", "0435436", 12.0F, TipoAsignatura.SEGUNDO_CUATRIMESTRE, 2);
		Asignatura r= new Asignatura("edc", "0427436", 7.0F, TipoAsignatura.SEGUNDO_CUATRIMESTRE, 3);
		Asignatura s= new Asignatura("adda", "0435336", 6.0F, TipoAsignatura.SEGUNDO_CUATRIMESTRE, 4);
		
		Set<Asignatura>conjuntoAsignaturas= new HashSet<Asignatura>();
		
		conjuntoAsignaturas.add(d);
		conjuntoAsignaturas.add(r);
		conjuntoAsignaturas.add(s);
		
		// optativas
		Asignatura x= new Asignatura("FP", "0435436", 12.0F, TipoAsignatura.SEGUNDO_CUATRIMESTRE, 2);
		Asignatura f= new Asignatura("edc", "0427436", 7.0F, TipoAsignatura.SEGUNDO_CUATRIMESTRE, 3);
		Asignatura p= new Asignatura("adda", "0435336", 6.0F, TipoAsignatura.SEGUNDO_CUATRIMESTRE, 4);
		
		Set<Asignatura>conjuntoAsignaturas2= new HashSet<>();
		
		conjuntoAsignaturas2.add(x);
		conjuntoAsignaturas2.add(f);
		conjuntoAsignaturas2.add(p);
		
		
		Grado c= new Grado("TI", conjuntoAsignaturas, conjuntoAsignaturas2, 12.0f);
		System.out.println(c	);
		
		
		
		
	}

}
