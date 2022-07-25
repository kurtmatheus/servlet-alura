package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class AtualizaEmpresa implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String idEmpresa = request.getParameter("id");
		String novoNome = request.getParameter("nome");
		String novaData = request.getParameter("data");
		
		Date novaDataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			novaDataAbertura = sdf.parse(novaData);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		banco.atualizaDado(Integer.valueOf(idEmpresa), novoNome, novaDataAbertura);
		
		return "redirect:entrada?acao=ListaEmpresas";

	}

}
