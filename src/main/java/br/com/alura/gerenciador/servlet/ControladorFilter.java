package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.Acao;

public class ControladorFilter implements Filter {

	@Override
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("acao");	
		
		String nomeClasse = "br.com.alura.gerenciador.acao." + paramAcao;
		String caminho;
		try {
			Class classe = Class.forName(nomeClasse);
			Acao acao = (Acao) classe.newInstance();
			caminho = acao.executa(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		String[] endereco = caminho.split(":");
		
		if(endereco[0].equals("foward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + endereco[1]);
			rd.forward(request, response);	
		} else {
			response.sendRedirect(endereco[1]);
		}

	}

}
