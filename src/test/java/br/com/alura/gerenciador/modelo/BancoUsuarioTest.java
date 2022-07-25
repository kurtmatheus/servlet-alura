package br.com.alura.gerenciador.modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoUsuarioTest {
	
	private Banco banco;
	
	@BeforeEach
	public void beforeEach() {
		this.banco = new Banco();
	}

	@Test
	void deveriaEncontrarUsuario() {
		String login = "mar";
		String senha = "123456";
		
		Usuario encontrado = banco.existeUsuarioComCredenciais(login, senha);
		
		assertEquals(login, encontrado.getLogin());
	}
	
	@Test
	void jogaExcecaoQuandoTentaEncontrarUsuario() {
		String login = "mar";
		String senha = "654321";
		
		assertNull(banco.existeUsuarioComCredenciais(login, senha));;
	}

}
