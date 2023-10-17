package com.alura.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class DB {

	private static List<Empresa> listaEmpresas = new ArrayList<>();
	
	static {
		listaEmpresas.add(new Empresa(1, "Alura"));
		listaEmpresas.add(new Empresa(1, "Oracle"));
		listaEmpresas.add(new Empresa(1, "Linux"));
	}
	
	public static void agregarEmpresa(Empresa empresa) {
		DB.listaEmpresas.add(empresa);
	}
	
	public static List<Empresa> getListaEmpresas() {
		return DB.listaEmpresas;
	}
	
}
