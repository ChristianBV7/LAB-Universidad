package fp.universidad.tipos.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import fp.universidad.tipos.Tutoria;

public class TestTutoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Tutoria z = new Tutoria(DayOfWeek.FRIDAY , LocalTime.of(10, 40), LocalTime.of(11, 40));
		
		
		
		System.out.println(z);
		
		
		

	}

}
