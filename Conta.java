/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filipe23022026;

/**
 *
 * @author alunolab01
 */
public class Conta {

    private double saldo;
    private int agencia, numero;

    public double getSaldo() {
        return saldo;
    }

    void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    int getAgencia() {
        return agencia;
    }
    
    void setNumero(int numero){
        this.numero = numero;
    }
    
    int getNumero(){
        return numero;
    }

    Conta() {

    }

    public Conta(int agencia, int numero, double valor) {
        this.agencia = agencia;
        this.numero = numero;
        creditar(valor);

    }

    public void creditar(double valor) {
        saldo = saldo + valor;
    }

    public void debitar(double valor) {
        saldo = saldo - valor;
    }

    public void transferir(Conta destino, double valor) {
        debitar(valor);
        destino.creditar(valor);
    }

}

