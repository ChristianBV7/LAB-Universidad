package fp.universidad.tipos.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import fp.universidad.tipos.Tutoria;

public class TestTutoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Tutoria z = new Tutoria(DayOfWeek.THURSDAY, LocalTime.of(10, 40), 20);
		Tutoria r= new Tutoria(DayOfWeek.MONDAY, LocalTime.of(10, 40), 20);
		
		
		
		System.out.println(z);
		System.out.println(z.compareTo(r));
		
		
		

	}

}
