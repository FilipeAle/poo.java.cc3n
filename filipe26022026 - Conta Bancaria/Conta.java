/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filipe26022026;

/**
 *
 * @author alunolab13
 */
public class Conta {

    private double saldo, limite;
    private int agencia, numero;

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    Conta() {
    }

    public Conta(double saldoInicial, double limite, int agencia, int numero) {
        this.saldo = saldoInicial;
        this.agencia = agencia;
        this.limite = limite;
        this.numero = numero;

    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    //Cheque especial
    public double getSaldoDisponivel(){
        return saldo + limite;
    }
    public void creditar(double valor){
        // saldo = saldo + valor
        saldo += valor;
    }
    public boolean debitar(double valor){
        if(valor <= getSaldoDisponivel()){
            saldo -= valor;
            return true;
        }
        else{
           System.out.println("Saldo insuficiente");
           return false;
            
        }

    }
    public void transferir(Conta destino, double valor) {
        debitar(valor);
        destino.creditar(valor);
    }

}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              

