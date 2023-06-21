package com.alura.jdbc.controller;

import java.util.List;

import com.alura.jdbc.dao.CategoriaDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.model.Categoria;

public class CategoriaController {

	private CategoriaDAO categoriaDAO;
	
	public CategoriaController() {
		categoriaDAO = new CategoriaDAO(new ConnectionFactory().creaConexion());
	}
	
	public List<Categoria> listar() {
		return categoriaDAO.listar();
	}

    public List<Categoria> cargaReporte() {
        return this.categoriaDAO.listarConProductos();
    }

}
