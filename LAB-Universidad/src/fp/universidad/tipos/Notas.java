package fp.universidad.tipos;

import java.time.LocalDate;

public record Notas( String asignatura, LocalDate añoEscolar, Double nota,
							Boolean estado, TipoNotas tipo) {
	
	
 public String CalculaCalificacion()  {
	 if (nota<5) {
		 return "suspenso";
		 
		 
	 }
	 
	 else if(nota<7) {
		 return "aprobado";
	 }
	 
	 else if ( nota<9) {
		 return "notable";
				 
	 }
	 
	 else {
		 return "matricula de honor";
		 
		 
	 }
	 
	 
 }
 
 
 public String toString() {
		
		return "(" + asignatura + "," + añoEscolar + "," + tipo + ","+ nota + ","+ CalculaCalificacion() + ")";
	}
		
}



	
	
	
	

