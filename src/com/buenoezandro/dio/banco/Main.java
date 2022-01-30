package com.buenoezandro.dio.banco;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		var c1 = new Cliente("Ezandro");
		var contaCorrente = new ContaCorrente(c1);
		contaCorrente.depositar(100.0);

		var c2 = new Cliente("Nayara");
		var contaPoupanca = new ContaPoupanca(c2);
		contaCorrente.transferir(100.0, contaPoupanca);

		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
		
		var banco = new Banco();
		banco.getContas().addAll(Arrays.asList(contaCorrente, contaPoupanca));
		banco.imprimirClientesCadastrados();
	}
}
