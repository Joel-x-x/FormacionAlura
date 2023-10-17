package alura.com.java;

import java.util.ArrayList;
import model.Curso;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Clase8 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		
		cursos.add(new Curso("Curso de fisica", 5));
		cursos.add(new Curso("Curso de java 8", 6));
		cursos.add(new Curso("Curso de java web", 10));
		cursos.add(new Curso("Curso de abstracion", 16));
		
		// Uso de reference
		cursos.sort(Comparator.comparing(Curso::getHoras));

		int sum = cursos.stream().filter(x -> x.getHoras() >= 6).mapToInt(x -> x.getHoras()).sum();
		
		System.out.println(sum);
		
		OptionalInt max = cursos.stream().mapToInt(x -> x.getHoras()).max();
		
		System.out.println(max.getAsInt());
		
		boolean validarTodos = cursos.stream().allMatch(x -> x.getHoras() > 4);
		
		System.out.println(validarTodos);
		
		Optional<Curso> optionCurso = cursos.stream().filter(x -> x.getHoras() > 15).findFirst();
		
		if(optionCurso.isPresent()) {
			System.out.println(optionCurso.get().getNombre());
		}
	}
}
