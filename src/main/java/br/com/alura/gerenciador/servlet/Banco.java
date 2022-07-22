package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();

	public void adiciona(Empresa empresa) {
		Banco.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> retornaDados() {
		return Banco.listaEmpresas;
	}

}
