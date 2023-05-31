package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class ProductoController {

	public void modificar(String nombre, String descripcion, Integer id) {
		// TODO
	}

	public void eliminar(Integer id) {
		// TODO
	}

	public List<?> listar() throws SQLException{
		
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/control_stock?useTimeZone=true&serverTimeZone=UTC", "root", "root");
			
			Statement statement = connection.createStatement();
			
			boolean result = statement.execute("select * from producto");
			
			System.out.println(result);
			
			
			connection.close();

		
		
		return new ArrayList<>();
	}

    public void guardar(Object producto) {
		// TODO
	}

}
