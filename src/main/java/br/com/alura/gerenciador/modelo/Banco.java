package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static int chaveSquencial;
	
	static {
		Empresa e = new Empresa();
		e.setNome("Alura");
		e.setId(chaveSquencial++);
		Banco.listaEmpresas.add(e);
		Empresa e1 = new Empresa();
		e1.setNome("Google");
		e1.setId(chaveSquencial++);
		Banco.listaEmpresas.add(e1);
		
		Usuario u1 = new Usuario();
		u1.setLogin("dani");
		u1.setSenha("123456");
		Banco.listaUsuarios.add(u1);
		Usuario u2 = new Usuario();
		u2.setLogin("mar");
		u2.setSenha("123456");		
		Banco.listaUsuarios.add(u2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSquencial++);
		Banco.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> retornaDados() {
		return Banco.listaEmpresas;
	}

	public void removeDado(int id) {
		Empresa empresa = Banco.listaEmpresas.stream()
											 .filter(e -> e.getId() == id)
											 .findFirst()
											 .get();
		Banco.listaEmpresas.remove(empresa);
	}
	
	public void atualizaDado(int id, String novoNome, Date novaData) {
		Banco.listaEmpresas.stream()
						   .filter(e -> e.getId() == id)
						   .findFirst()
						   .ifPresent(e -> {e.setNome(novoNome);
						   					e.setDataAbertura(novaData);});
											 
	}

	public Empresa buscaEmpresaPorId(int id) {
		return Banco.listaEmpresas.stream()
				 .filter(e -> e.getId() == id)
				 .findFirst()
				 .get();
	}

	public Usuario existeUsuarioComCredenciais(String login, String senha) {
		Usuario usuario = null;
		try {
			usuario = Banco.listaUsuarios.stream()
			  .filter(u -> u.ehIgual(login, senha))
			  .findFirst()
			  .get();
		} catch (NoSuchElementException e) {
			System.out.println("UsuárioNãoEncontrado!");
		}
		return usuario; 
								  
	}

}
