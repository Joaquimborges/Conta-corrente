package com.conta.poo;

public class ContaCorrente {
   private String numero;
   private String agencia;
   private boolean especial;
   private double chequeEspecial;
   private double saldo;

    public ContaCorrente() {  }

    public ContaCorrente(String numero, String agencia, boolean especial, double chequeEspecial, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.chequeEspecial = chequeEspecial;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarInfo(){
        System.out.println("Numero da conta: " + this.numero);
        System.out.println("Agência: " + this.agencia);

    }

    public void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + this.saldo);
        System.out.println("Limite do cheque Especial = " + this.chequeEspecial);
    }

    public boolean realizarSaque(double valorASacar) {
        if (this.saldo >= valorASacar) {
            this.saldo -= valorASacar;
            System.out.println("Saque realizado com sucesso");
            return true;
        } else {
            if (isEspecial()){
                double limite = this.saldo + this.chequeEspecial;
                if (limite >= valorASacar){
                    this.saldo -= valorASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        }
    }

   public void fazerDeposito(double valorADepositar){

        this.saldo += valorADepositar;
    }

   public boolean verificarUsoChequeEspecial(){
        return this.saldo < 0;
    }

   public void novaAtividade(){

        System.out.println("---------------------------- Nova atividade -------------------");
    }

}
