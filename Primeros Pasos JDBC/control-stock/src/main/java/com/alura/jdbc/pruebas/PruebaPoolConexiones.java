package com.alura.jdbc.pruebas;

import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaPoolConexiones {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory con = new ConnectionFactory();

		for (int i = 0; i < 20; i++) {
			con.creaConexion();
			System.out.println("Connection: " + (i + 1));
			con.creaConexion().close();
		}
	}
}
