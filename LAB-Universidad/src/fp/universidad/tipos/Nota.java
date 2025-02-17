package fp.universidad.tipos;

import java.time.LocalDate;

public class Nota {
	
	

	
	
	private String asignatura;
	private LocalDate añoEscolar;
	private TipoNota tipo;
	private Double nota;
	private String estado;
	
	
	
	
	public Nota(String asignatura, LocalDate añoEscolar, TipoNota tipo, Double nota, String estado) {
		super();
		this.asignatura = asignatura;
		this.añoEscolar = añoEscolar;
		this.tipo = tipo;
		this.nota = nota;
		this.estado = estado;
	}




	public String getAsignatura() {
		return asignatura;
	}




	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}




	public LocalDate getAñoEscolar() {
		return añoEscolar;
	}




	public void setAñoEscolar(LocalDate añoEscolar) {
		this.añoEscolar = añoEscolar;
	}




	public TipoNota getTipo() {
		return tipo;
	}




	public void setTipo(TipoNota tipo) {
		this.tipo = tipo;
	}




	public Double getNota() {
		return nota;
	}




	public void setNota(Double nota) {
		this.nota = nota;
	}




	public String getEstado() {
		return estado;
	}




	public void setEstado(String estado) {
		this.estado = estado;
	
	
	
	if (nota< 5 ){
		
		estado= "suspenso";
	}
	if (nota>=5 & nota<7 ) {
		
		estado= "aprobado";
		
	}
	
	if (nota >=7 & nota<9)  {
		
		estado="notable";
		
	}
	
	
	if (nota>9) {
		
		estado= "sobresaliente";
		}
	

	}
	
	// //Fundamentos de Programación, 2014-15, PRIMERA, 7.5, NOTABLE". 
	public String toString() {
		
		return "(" + asignatura + "," + añoEscolar + "," + tipo + ","+ nota + ","+ estado + ")";
	}
}
