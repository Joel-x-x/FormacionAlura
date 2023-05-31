package com.alura.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static void main(String[] args) throws SQLException {
		Connection conection = DriverManager.getConnection("jdbc:mysql://localhost/control_stock?useTimeZone=true&serverTimeZone=UTC","root","root");
		conection.close();
	}
}
