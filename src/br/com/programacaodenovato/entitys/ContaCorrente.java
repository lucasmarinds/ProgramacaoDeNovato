package br.com.programacaodenovato.entitys;

import java.io.Serializable;

public class ContaCorrente implements Serializable {

    int numeroDaConta;
    int agencia;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
