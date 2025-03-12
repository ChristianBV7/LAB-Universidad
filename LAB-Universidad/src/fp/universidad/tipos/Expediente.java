package fp.universidad.tipos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Expediente implements Comparable <Expediente>{
	
	
	
	
	private List<Notas> notazas;
	
	
	
	
	public Expediente() {
		
		this.notazas= new ArrayList<Notas>();
	

	}



	public List<Notas> getNotazas() {
		return notazas;
	}



	
	
	public double calcularMedia(List<Notas> notas) {
		double r = 0.0;
		
	int aprobadas=0;
		for (Notas nota : notas) {
			if (nota.valor() >= 5) {
				r = r + nota.valor();
				aprobadas++;
			}
		}
		r = r / aprobadas;
		return r;
	
	

}
	
	public String toString() {
		
		return "[" + notazas + "]";
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(notazas);
	}



	@Override
	public boolean equals(Object o) {
		
		
		if( o instanceof Expediente) {
			
			Expediente t= (Expediente) o;
			
			if(notazas== t.notazas) {
				
				return true;
			
				
		} 
			
			else {
				
				return false;
		}
	}
		return false;
		
		
}



	@Override
	public int compareTo(Expediente o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public void nuevaNota(Notas n) {
		if (notazas.contains(n)) {
			notazas.remove(n);
			notazas.add(n);
		} else {
		notazas.add(n);
		}
		
	}

	
	
	
	
	
}