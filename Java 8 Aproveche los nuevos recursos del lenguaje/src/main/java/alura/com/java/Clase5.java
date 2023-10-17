package alura.com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Clase5 {
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		
		cursos.add("Curso de fisica");
		cursos.add("Curso de java 8");
		cursos.add("Curso de java web");
		cursos.add("Curso de abstracion");
		
		Function<String, Integer> function = x -> x.length();
		cursos.sort(Comparator.comparing(function));
		
		// Uso de reference
		cursos.sort(Comparator.comparing(String::length));

		cursos.forEach(System.out::println);
		
	}
}
