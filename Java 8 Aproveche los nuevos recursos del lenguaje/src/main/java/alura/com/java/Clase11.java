package alura.com.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Clase11 {
	public static void main(String[] args) {
		LocalDate fechaActual = LocalDate.now().minusDays(8).plusMonths(1);
		
		LocalDate fechaMundial = LocalDate.of(2026, 5, 14);
		
		System.out.println(fechaMundial);
		
		System.out.println(fechaActual);
		
		System.out.println(ChronoUnit.DAYS.between(fechaActual, fechaMundial));
		
		LocalDateTime fecha = LocalDateTime.now();
		
		System.out.println(fecha.getMonthValue());
	}
}
