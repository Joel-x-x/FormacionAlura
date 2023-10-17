package alura.com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clase4 {
  	
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		
		cursos.add("Curso de fisica");
		cursos.add("Curso de java 8");
		cursos.add("Curso de java web");
		cursos.add("Curso de abstracion");

		cursos.sort(Comparator.comparing(x -> x.length()));

    cursos.forEach(t -> System.out.println(t));
		
	}
}