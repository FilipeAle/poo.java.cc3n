/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.filipe2026;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {

        Conta c1 = new Conta(123, 999, 8000, 10000);
        Conta c2 = new Conta(345, 888, 1000, 800);

        Scanner sc = new Scanner(System.in);

        //System.out.println("Digite a agencia:");
        int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da sua conta 1: "));

        //System.out.println("Digite a numero:");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sua conta 1: "));

        //System.out.println("Digite a saldo:");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da sua conta 1: "));

        //System.out.println("Digite a saldo:");
        double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da sua conta 1: "));

        c1.transferir(c2, 10000);

        System.out.println("Saldo atual da conta 1: " + c1.getSaldo() + "R$");
        System.out.println("Saldo atual da conta 2: " + c2.getSaldo() + "R$");
    }
}
