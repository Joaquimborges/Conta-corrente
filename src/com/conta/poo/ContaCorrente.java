package com.conta.poo;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double chequeEspecial;
    double saldo;

    void mostrarInfo(){
        System.out.println("Numero da conta: " + numero);
        System.out.println("Agência: " + agencia);

    }

    void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
        System.out.println("Limite do cheque Especial = " + chequeEspecial);
    }

    boolean realizarSaque(double valorASacar) {
        if (saldo >= valorASacar) {
            saldo -= valorASacar;
            System.out.println("Saque realizado com sucesso");
            return true;
        } else {
            if (especial){
                double limite = saldo + chequeEspecial;
                if (limite >= valorASacar){
                    saldo -= valorASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        }
    }

    void fazerDeposito(double valorADepositar){
        saldo += valorADepositar;
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }

    void novaAtividade(){
        System.out.println("---------------------------- Nova atividade -------------------");
    }

}
