/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author alunodev13
 */
public class Principal {

   
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Digite a agencia:");
    int agencia = sc.nextInt();
    
    System.out.println("Digite a agencia:");
    int numro = sc.nextInt();
    
    System.out.println("Digite a agencia:");
    int saldo = sc.nextInt();
    
       
        
        
    Conta c1 = new Conta(123, 999, 8000, 10000);
    Conta c2 = new Conta(345, 888, 1000, 800);
    
    c1.transferir(c2, 10000);
    
        System.out.println("Saldo atual da conta 1: " + c1.getSaldo()+"R$");
        System.out.println("Saldo atual da conta 2: " + c2.getSaldo()+"R$");
    }
}
