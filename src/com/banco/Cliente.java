package com.banco;

public class Cliente {

    String nome;
    ContaCorrente cc;
    ContaPoupanca cp;

    public Cliente (String nome){
        this.nome = nome;
        this.cc = new ContaCorrente(this.nome);
        this.cp = new ContaPoupanca(this.nome);

    }

    public String getNome() {
        return nome;
    }


}
