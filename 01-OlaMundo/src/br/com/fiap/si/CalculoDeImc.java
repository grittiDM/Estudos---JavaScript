package br.com.fiap.si;

import java.util.Scanner;

public class CalculoDeImc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é seu peso? ");
        double peso = sc.nextDouble();
        System.out.print("Qual é sua altura? ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        boolean resultado = imc > 18.5 && imc < 25;
        if(resultado) {
            System.out.println("Seu peso é ideal!!");
        }else {
            System.out.println("Seu peso não é ideal...");
        }

        sc.close();

    }

}
