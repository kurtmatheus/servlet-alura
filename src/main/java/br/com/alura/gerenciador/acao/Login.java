package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Usuario;

public class Login implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse Response)	throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		System.out.println("Logando: " + login);
		
		Banco banco = new Banco();
		Usuario usuario = banco.existeUsuarioComCredenciais(login, senha);
		HttpSession session = request.getSession();
		session.setAttribute("usuarioLogado", usuario);
		
		if (usuario == null) {
			return "redirect:entrada?acao=LoginForm";
		}
		
		return "redirect:entrada?acao=ListaEmpresas";
	}

}
