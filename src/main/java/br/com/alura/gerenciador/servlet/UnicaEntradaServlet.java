package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String paramAcao = request.getParameter("acao");	
//				
//		String nomeClasse = "br.com.alura.gerenciador.acao." + paramAcao;
//		String caminho;
//		try {
//			Class classe = Class.forName(nomeClasse);
//			Acao acao = (Acao) classe.newInstance();
//			caminho = acao.executa(request, response);
//		} catch (Exception e) {
//			throw new ServletException(e);
//		}
//		
//		String[] endereco = caminho.split(":");
//		
//		if(endereco[0].equals("foward")) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + endereco[1]);
//			rd.forward(request, response);	
//		} else {
//			response.sendRedirect(endereco[1]);
//		}
		
//		String caminho = "";		
//		switch(paramAcao) {
//			case "NovaEmpresa":
//				NovaEmpresa acaoNova = new NovaEmpresa();
//				caminho = acaoNova.executa(request, response);
//				break;
//			case "ListaEmpresas": 				
//				ListaEmpresas acaoLista = new ListaEmpresas();
//				caminho = acaoLista.executa(request, response);				
//				break;
//			case "RemoveEmpresa":
//				RemoveEmpresa acaoRemove = new RemoveEmpresa();
//				caminho = acaoRemove.executa(request, response);
//				break;
//			case "ExibeEmpresa":
//				ExibeEmpresa acaoExibe = new ExibeEmpresa();
//				caminho = acaoExibe.executa(request, response);
//				break;
//			case "AtualizaEmpresa":
//				AtualizaEmpresa acaoAtualiza = new AtualizaEmpresa();
//				caminho = acaoAtualiza.executa(request, response);
//				break;
//			case "NovaEmpresaForm":
//				NovaEmpresaForm acaoForm = new NovaEmpresaForm();
//				caminho = acaoForm.executa(request, response);		
//				break;
//		}
		
	}
}
