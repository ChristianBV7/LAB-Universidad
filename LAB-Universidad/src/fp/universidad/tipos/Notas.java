package fp.universidad.tipos;

import java.time.LocalDate;
import java.util.Objects;

import fp.utiles.Checkers;

public record Notas( String asignatura, LocalDate añoEscolar, Double valor,
							Boolean estado, TipoNotas tipo, String matriculaHonor) implements Comparable <Notas> {
	
	
	
	public Notas {
		
		
		Checkers.check("nota incorrecta ", valor>= 0 && valor<=10);
		Checkers.check("no hay matricula", valor >=9);
	}
	
	
 public String CalculaCalificacion()  {
	 if (valor<5) {
		 return "suspenso";
		 
		 
	 }
	 
	 else if(valor<7) {
		 return "aprobado";
	 }
	 
	 else if ( valor<9) {
		 return "notable";
				 
	 }
	 
	 else {
		 return matriculaHonor;
		 
		 
	 }
	 
	 
 }
 
 
 public String toString() {
		
		return "(" + asignatura + "," + añoEscolar + "," + tipo + ","+ valor + ","+ CalculaCalificacion() + ")";
	}


@Override
public int hashCode() {
	return Objects.hash(asignatura, añoEscolar, tipo);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Notas other = (Notas) obj;
	return Objects.equals(asignatura, other.asignatura) && Objects.equals(añoEscolar, other.añoEscolar)
			&& tipo == other.tipo;
}
 
 public int compareTo(Notas o) {
	int r= añoEscolar.compareTo(o.añoEscolar);
	
	 if (r==0) {
		 
		r=asignatura.compareTo(o.asignatura);
		 
		 if(r==0) {
			 
			r= tipo.compareTo(o.tipo);
			 
			 
		 }
	 }
	return r;  
 }

	 
}



	
	
	
	

