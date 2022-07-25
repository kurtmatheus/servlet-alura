package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ExibeEmpresa implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("exibirEmpresa");
		String id = request.getParameter("id");
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPorId(Integer.valueOf(id));
		
		request.setAttribute("empresa", empresa);

		
		return "foward:formAtualizaEmpresa.jsp";
	}

}
