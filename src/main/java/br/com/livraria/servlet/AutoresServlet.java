package br.com.livraria.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.livraria.dao.AutorDao;
import br.com.livraria.factory.ConnectionFactory;
import br.com.livraria.modelo.Autor;

@WebServlet ("/autores")

public class AutoresServlet extends HttpServlet{
	
	private AutorDao dao;
	
	public AutoresServlet() {
		this.dao = new AutorDao(new ConnectionFactory().getConnection());
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("autores",dao.listar());
		request.getRequestDispatcher("WEB-INF/jsp/autores.jsp").forward(request, response);
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			LocalDate dataNascimento =  LocalDate.parse(request.getParameter("dataNascimento"),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			String miniCurriculo = request.getParameter("miniCurriculo");
			 
			
			Autor autor = new Autor(
			nome,
			email,
			dataNascimento,
			miniCurriculo
			);
			dao.cadastrar(autor);
			response.sendRedirect("autores");
		}catch (NumberFormatException erro) {
			response.sendRedirect("autores?erro=campo invalido!");
		}
	}
}
