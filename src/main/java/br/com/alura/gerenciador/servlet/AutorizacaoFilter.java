package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter(urlPatterns = "/entrada")
public class AutorizacaoFilter implements Filter {
	
	@Override
	public void init(FilterConfig config) throws ServletException {}
	
	@Override
	public void destroy() {}
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = servletRequest.getParameter("acao");

		HttpSession session = request.getSession();
		boolean usuarioNaoEstaLogado = session.getAttribute("usuarioLogado") == null;
		boolean ehAcaoLogin = paramAcao.equals("Login") || paramAcao.equals("LoginForm");
		if (!ehAcaoLogin  && usuarioNaoEstaLogado) {
			response.sendRedirect("entrada?acao=LoginForm");
			return;
		}	
		
		chain.doFilter(request, response);
	}

}
