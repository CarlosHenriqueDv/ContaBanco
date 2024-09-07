package com.dio.banco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do cliente");
        nomeCliente = scan.nextLine();

        System.out.println("Informe o número da conta");
        numero = scan.nextInt();

        System.out.println("Informe o número da agencia");
        agencia = scan.next();


        System.out.println("Informe o saldo do cliente");
        saldo = scan.nextDouble();

        System.out.println(formataMensagem(nomeCliente, agencia, numero, saldo));



    }


    public static String formataMensagem(String cliente,
                                         String agencia,
                                         int numero,
                                         double saldo){
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s " +
                        "e seu saldo %s já está disponível para saque",
                cliente, agencia, numero, saldo);

    }
}
