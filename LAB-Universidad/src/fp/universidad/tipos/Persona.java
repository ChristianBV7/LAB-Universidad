package fp.universidad.tipos;

import java.time.LocalDate;

public class Persona {
	
	
	private String nombre;
	private String apellidos ;
	private LocalDate fechaNacimiento;
	private String DNI;
	private String email;
	
	
	
	public Persona(String nombre, String apellidos, LocalDate f, String d, String e) {
		super();
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
