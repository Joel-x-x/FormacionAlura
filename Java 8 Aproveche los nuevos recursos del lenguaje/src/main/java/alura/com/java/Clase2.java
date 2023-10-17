package alura.com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Clase2 {
  	
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		
		cursos.add("Curso de física");
		cursos.add("Curso de java 8");
		cursos.add("Curso de java web");
		cursos.add("Curso de abstración");

		cursos.sort(new CompararClase2());

    cursos.forEach(new ConsumidorClase2());
		
	}
}

class ConsumidorClase2 implements Consumer<String> {

  @Override
  public void accept(String t) {
    System.out.println(t);
  }
  
}

class CompararClase2 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() > o2.length()) {
			return 1;
		} else if(o1.length() < o2.length()) {
			return -1;
		}

		return 0;
	}
	
}
