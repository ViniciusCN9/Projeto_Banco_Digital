package com.banco;

public class Main {

    public static void main(String[] args) {

    // Primeiro cliente

        Cliente cliente1 = new Cliente("Vinicius");

        cliente1.cc.depositar(1000);

    // Segundo cliente

        Cliente cliente2 = new Cliente("Matheus");

        cliente2.cc.depositar(1000);

    // Transações

        cliente1.cc.transferir(500, cliente2.cc); // cliente1 transfere R$500,00 de sua CC para a CC do cliente2.
        cliente2.cc.transferir(250, cliente1.cc); // cliente2 transfere R$250,00 de sua CC para a CC do cliente1.

        cliente1.cc.imprimirExtrato();
        cliente2.cc.imprimirExtrato();
    }

}
