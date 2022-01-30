package com.buenoezandro.dio.banco;

public class ContaPoupanca extends Conta {
	protected ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Poupança ===");
		super.imprimirInformacoesDaConta();
	}
}
