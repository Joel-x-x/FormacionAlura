package com.alura.gerenciador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NuevaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		
		Empresa empresa = new Empresa(1, nombre);
		
		DB.agregarEmpresa(empresa);
		
		// Llamar jsp
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/nuevaEmpresaRegistrada.jsp");
		request.setAttribute("empresa", empresa.getNombre());
		requestDispatcher.forward(request, response);
	}

}
