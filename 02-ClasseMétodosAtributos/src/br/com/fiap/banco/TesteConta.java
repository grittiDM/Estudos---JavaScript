package br.com.fiap.banco;

public class TesteConta {

    public static void main(String[] args) {
        
        Conta contaCorrente = new Conta(50.5);

        System.out.println(contaCorrente.recuperarSaldo());

    }

}
