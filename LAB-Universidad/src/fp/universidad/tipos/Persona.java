package fp.universidad.tipos;

import java.time.LocalDate;
import java.util.Objects;

import fp.utiles.Checkers;

public class Persona implements Comparable <Persona> { 
	
	
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
	
	
	public Persona(String nombre, String apellidos, LocalDate f, String DNI, String e) {
		super();
		
		
		
		Checkers.check("dni incorrecto", sonDigitos(DNI) && DNI.length()==8 );
		Checkers.check("DNI incorrecto", !Character.isLetter(DNI.charAt(DNI.length()-1)));
		Checkers.check("email incorrecto", email.contains("@"));
		
		
				
	
		this.nombre = nombre;
		this.apellidos = apellidos;
		fechaNacimiento = f;
		this.DNI = DNI;
		email = e;
	}



	public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, String DNI) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.DNI = DNI;
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


	@Override
	public int hashCode() {
		return Objects.hash(DNI, apellidos, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(DNI, other.DNI) && Objects.equals(apellidos, other.apellidos)
				&& Objects.equals(nombre, other.nombre);
	}


	@Override
	public int compareTo(Persona o) {
		
		
	int r;
	
	r= getApellidos().compareTo(o.getApellidos());
	
	if (r==0) {
		
		r=getNombre().compareTo(o.getNombre ());
		
		if( r==0) {
			
			r=getDNI().compareTo(o.getDNI());
		}
		
		
	}
		return r;
		
		
		
		
		
		
	}
	
	
}
