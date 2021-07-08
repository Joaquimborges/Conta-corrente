package com.conta.poo;

public class Conta01 {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.setAgencia("0458");
        conta.setNumero("45680");
        conta.setEspecial(true);
        conta.setChequeEspecial(500);
        conta.setSaldo(10);

        conta.mostrarInfo();

        conta.fazerDeposito(100);
        conta.consultarSaldo();

        conta.novaAtividade();

        conta.realizarSaque(500);

        if (conta.verificarUsoChequeEspecial()){
            System.out.println("você esta usando o cheque especial");
        } else {
            System.out.println("você não esta usando o cheque especial");
        }

        conta.consultarSaldo();

        conta.novaAtividade();
        conta.fazerDeposito(600);
        conta.consultarSaldo();
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("você esta usando o cheque especial");
        } else {
            System.out.println("você não esta usando o cheque especial");
        }

        conta.realizarSaque(5);
    }
}
