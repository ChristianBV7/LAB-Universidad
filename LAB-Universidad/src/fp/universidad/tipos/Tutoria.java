package fp.universidad.tipos;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public record Tutoria(DayOfWeek diaDeLaSemana, LocalTime horaInicio, LocalTime horaFinal) {
	
	
	
	public Tutoria(DayOfWeek diaDeLaSemana, LocalTime horaInicio, int duracionMinutos ) { 
		this(diaDeLaSemana, horaInicio, horaInicio.plusMinutes(duracionMinutos));
		
	}
		public int getDuracion() {
			return (int) Duration.between(horaInicio, horaFinal).toMinutes();
		}	
		public String toString() {
			
			return diaDeLaSemana + " " + horaInicio + " " + horaFinal;
			
		}
		
	}


