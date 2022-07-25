package br.com.alura.gerenciador.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoEmpresaTest {
	private Banco banco;
	
	@BeforeEach
	public void beforeEach() {
		this.banco = new Banco();
	}

	@Test
	void deveriaRemoverEmpresaDaLista() {
		this.banco.removeDado(1);
		assertEquals(1, banco.retornaDados().size());
	}
	
	@Test
	void deveriaAtualizarEmpresaComNovosDados() throws ServletException {
		String nomeEmpresa = "Facebook";
		String dataString = "20/05/2060";
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataString);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		System.out.println(banco.retornaDados().get(0).getNome());
		System.out.println(banco.retornaDados().get(0).getDataAbertura());
		
		this.banco.atualizaDado(1, nomeEmpresa, dataAbertura);
		
		assertEquals(nomeEmpresa, banco.retornaDados().get(0).getNome());
		assertEquals(dataAbertura, banco.retornaDados().get(0).getDataAbertura());
		
		System.out.println(banco.retornaDados().get(0).getNome());
		System.out.println(banco.retornaDados().get(0).getDataAbertura());
	}
	

}
