package com.conta.poo;

public class Conta01 {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.setAgencia("0458");
        conta.setNumero("45680");
        conta.setEspecial(true);
        conta.setChequeEspecial(500);
        conta.setSaldo(10);

        ContaCorrente conta1 = new ContaCorrente("0265","45790");
        conta1.setSaldo(5);



        conta.mostrarInfo();

        if (conta.verificarUsoChequeEspecial()){
            System.out.println("você esta usando o cheque especial");
        } else {
            System.out.println("você não esta usando o cheque especial");
        }

        conta.consultarSaldo();

        conta.novaAtividade();

        conta1.consultarSaldo();
        conta.consultarSaldo();
        conta.fazerDeposito(100);
        conta.consultarSaldo();
        conta.novaAtividade();
        conta.realizarTransferencia(50, conta1);
        conta1.consultarSaldo();

    }
}
