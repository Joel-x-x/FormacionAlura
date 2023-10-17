package alura.com.java;

import java.util.ArrayList;
import java.util.List;

public class Clase3 {
  	
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		
		cursos.add("Curso de fisica");
		cursos.add("Curso de java 8");
		cursos.add("Curso de java web");
		cursos.add("Curso de abstracion");

		cursos.sort((String o1, String o2) -> Integer.compare(o2.length(), o1.length()));

    cursos.forEach(t -> System.out.println(t));
		
	}
}
