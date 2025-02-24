package fp.universidad.tipos;

import java.time.LocalDate;

import fp.utiles.Checkers;

public class Persona {
	
	
	private String nombre;
	private String apellidos ;
	private LocalDate fechaNacimiento;
	private String DNI;
	private String email;
	
	
	
	
	

	private Boolean sonDigitos(String cadena) {
		
		Boolean res= true;
			
			for( int i=0; i<cadena.length(); i++) {
				
				if( ! Character.isDigit(cadena.charAt(i))) {
					
					res= false;
					break;
					
				}
			}
			
			return res;
		}  
	
	
	public Persona(String nombre, String apellidos, LocalDate f, String d, String e) {
		super();
		
		
		
		Checkers.check("dni incorrecto", sonDigitos(d) && d.length()==8 );
		Checkers.check("DNI incorrecto", !Character.isLetter(d.charAt(d.length()-1)));
		
		
				
	
		this.nombre = nombre;
		this.apellidos = apellidos;
		fechaNacimiento = f;
		DNI = d;
		email = e;
	}



	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, String dNI) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		DNI = dNI;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getDNI() {
		return DNI;
	}



	public void setDNI(String dNI) {
		DNI = dNI;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	 //"28864657W – García Vaquero, Pascual – 15/09/1998". 
	public String toString() {
		
		return "(" + DNI + "-"  + nombre + "-" + apellidos + "-" + fechaNacimiento + "-" + email + ")" ;
	}
}
