package alura.com.java;

import java.util.ArrayList;
import model.Curso;
import java.util.Comparator;
import java.util.List;

public class Clase7 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Curso de fisica", 5));
		cursos.add(new Curso("Curso de java 8", 6));
		cursos.add(new Curso("Curso de java web", 10));
		cursos.add(new Curso("Curso de abstracion", 16));
		
		// Uso de reference
		cursos.sort(Comparator.comparing(Curso::getHoras));

		cursos.stream().filter(x -> x.getHoras() >= 6).forEach(x -> System.out.println(x.getNombre() + " " + x.getHoras()));
		
	}
}
