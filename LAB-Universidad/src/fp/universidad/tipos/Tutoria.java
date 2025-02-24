package fp.universidad.tipos;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Objects;

import fp.utiles.Checkers;

public record Tutoria(DayOfWeek diaDeLaSemana, LocalTime horaInicio, LocalTime horaFinal) {
	
	
	
	
	
	
		
		
		
	
	
	
	
	public Tutoria(DayOfWeek diaDeLaSemana, LocalTime horaInicio, int duracionMinutos ) { 
		
		
		
		
		
		
		
		
		
		this(diaDeLaSemana, horaInicio, horaInicio.plusMinutes(duracionMinutos));
		
		Checkers.check("dia no valido", diaDeLaSemana== DayOfWeek.MONDAY ||diaDeLaSemana== DayOfWeek.FRIDAY || diaDeLaSemana== DayOfWeek.THURSDAY || diaDeLaSemana==DayOfWeek.THURSDAY ||  diaDeLaSemana== DayOfWeek.WEDNESDAY);
		
	}
		public int getDuracion() {
			return (int) Duration.between(horaInicio, horaFinal).toMinutes();
		}	
		public String toString() {
			
			return diaDeLaSemana + " " + horaInicio + " " + horaFinal;
			
			
			
			
			
			
			
		}
		@Override
		public int hashCode() {
			return Objects.hash(diaDeLaSemana, horaInicio);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Tutoria other = (Tutoria) obj;
			return diaDeLaSemana == other.diaDeLaSemana && Objects.equals(horaInicio, other.horaInicio);
			

		}
		
		
		public int compareTo(Tutoria o) {
			
			int r;
			r= diaDeLaSemana().compareTo(o.diaDeLaSemana()); 
			
			if(r==0) {
				
				r= horaInicio().compareTo(o.horaInicio());
			}
			
			return r;
		} 
		

	}


