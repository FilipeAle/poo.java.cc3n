/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conta_bancaria;

/**
 *
 * @author alunolab13
 */
public class ContaPoupanca {
    private double taxaJuros;
    private int diaAniversario;

    public ContaPoupanca(double taxaJuros, int diaAniversario) {
        this.taxaJuros = taxaJuros;
        this.diaAniversario = diaAniversario;
    }

    /**
     * @return the taxaJuros
     */
    public double getTaxaJuros() {
        return taxaJuros;
    }

    /**
     * @param taxaJuros the taxaJuros to set
     */
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    /**
     * @return the diaAniversario
     */
    public int getDiaAniversario() {
        return diaAniversario;
    }
    
    
    
    
    
}
