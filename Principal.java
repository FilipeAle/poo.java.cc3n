/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filipe20261902;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(500);
        c1.creditar(1000);
        c1.debitar(600);
        
        Conta c2 = new Conta();
        c1.transferir(c2, 1000);
        System.out.println("Saldo atual da conta 1: " + c1.obterSaldo()+"R$");
        
        System.out.println("Saldo atual da conta 2: " + c2.obterSaldo()+"R$");

    }
}
