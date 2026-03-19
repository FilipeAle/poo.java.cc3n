/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta_bancaria;

/**
 *
 * @author alunolab13
 */
public class Conta {
    private String numeroConta;
    private double saldo;
    private Titular titular;
    private Notificador notificador;

    public Conta(String numeroConta, Titular titular, Notificador notificador) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.notificador = notificador;
    }

    /**
     * @return the numeroConta
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return the titular
     */
    public Titular getTitular() {
        return titular;
    }
    
    
    
    
    
}
