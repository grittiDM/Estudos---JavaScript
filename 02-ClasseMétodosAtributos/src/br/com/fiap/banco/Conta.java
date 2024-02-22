package br.com.fiap.banco;

public class Conta {

    int numero;

    int agencia;

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    double saldo;

    public Conta(){

    }

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double recuperarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void retirar(double valor) {
        saldo = saldo - valor;
    }

    public void retirar(double valor, double taxa) {
        saldo = saldo - valor - taxa;
    }


    Cliente cliente = new Cliente();

}
