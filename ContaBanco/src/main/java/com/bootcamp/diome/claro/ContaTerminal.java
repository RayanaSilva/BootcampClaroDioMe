package com.bootcamp.diome.claro;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua agencia: ");
        String numeroAgencia = sc.nextLine();
        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Insira o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome  +
                            ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                            ", conta " + numeroConta +
                            " e seu saldo " + saldo +
                            " já está disponível para saque.");

        sc.close();
    }
}