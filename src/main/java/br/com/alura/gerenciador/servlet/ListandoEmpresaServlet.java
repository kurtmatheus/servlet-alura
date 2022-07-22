package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListandoEmpresaServlet
 */
@WebServlet("/listarempresas")
public class ListandoEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> lista = banco.retornaDados();
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><h2>Lista de Empresas Adicionadas</h2>"
				+ "<ul>");
		
		lista.forEach(a -> {out.println("<li>" + a.getNome() + "</li>");});
		
		out.println("</ul></body></html>");
	}

}
