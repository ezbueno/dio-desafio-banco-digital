package com.buenoezandro.dio.banco;

public class ContaCorrente extends Conta {
	protected ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Corrente ===");
		super.imprimirInformacoesDaConta();
	}
}
