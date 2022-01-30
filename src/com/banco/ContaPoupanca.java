package com.banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        imprimirInfosComuns();
    }
}
