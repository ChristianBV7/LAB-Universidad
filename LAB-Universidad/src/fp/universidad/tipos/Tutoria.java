package fp.universidad.tipos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tutoria {
// "X 10:30-12:30"
	
	private Integer  DayOfWeek;
	private LocalTime horaInicio;
	private LocalTime horaFinal;
	private LocalTime duracion;
	
	





	public Tutoria(Integer dayOfWeek, LocalTime horaInicio, LocalTime horaFinal) {
		super();
		DayOfWeek = dayOfWeek;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
	}














	public Integer getDayOfWeek() {
		return DayOfWeek;
	}







	public void setDayOfWeek(Integer dayOfWeek) {
		DayOfWeek = dayOfWeek;
	}







	public LocalTime getHoraInicio() {
		return horaInicio;
	}







	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}







	public LocalTime getHoraFinal() {
		return horaFinal;
	}







	public void setHoraFinal(LocalTime horaFinal) {
		this.horaFinal = horaFinal;
	}







	public LocalTime getDuracion() {
		return duracion;
	}







	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}







	public String toString() {
		
		return ""+ DayOfWeek + "-" +  horaInicio +"-" + horaFinal + "";
	}
	
	
	
	
	
}
