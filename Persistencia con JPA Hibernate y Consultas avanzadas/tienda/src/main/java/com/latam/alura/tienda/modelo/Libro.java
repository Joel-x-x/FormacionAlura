package com.latam.alura.tienda.modelo;

import javax.persistence.Entity;

@Entity
public class Libro extends Producto{
	private String autor;
	private Long paginas;
	
	public Libro(String autor, Long paginas) {
		this.autor = autor;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Long getPaginas() {
		return paginas;
	}

	public void setPaginas(Long paginas) {
		this.paginas = paginas;
	}
	
}
