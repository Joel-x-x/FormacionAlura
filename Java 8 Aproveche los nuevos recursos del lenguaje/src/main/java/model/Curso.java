package model;

public class Curso {
	private String nombre;
	private Integer horas;
	
	public Curso(String nombre, Integer horas) {
		this.nombre = nombre;
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return this.getNombre() + " - " + this.getHoras();
	}
}