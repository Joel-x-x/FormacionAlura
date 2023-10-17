package alura.com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Clase1 {
	
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		
		cursos.add("Curso de física");
		cursos.add("Curso de java 8");
		cursos.add("Curso de java web");
		cursos.add("Curso de abstración");

		Collections.sort(cursos, new Comparar());

		for(String curso : cursos) {
			System.out.println(curso);
		}
		
	}
}

class Comparar implements Comparator<String> {

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
