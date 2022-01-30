package com.buenoezandro.dio.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public Banco() {
	}

	public Banco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return this.contas;
	}

	public void imprimirClientesCadastrados() {
		System.out.println("=== Lista de Clientes Cadastrados ===");
		for (Conta nomes : this.getContas()) {
			System.out.println(nomes.cliente.getNome());
		}
	}
}
