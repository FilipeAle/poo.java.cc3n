/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filipizza;

/**
 *
 * @author alunolab13
 */
public class Bebida extends Produto {
    private int quantidadeEstoque;

    public Bebida() {
    }

    public Bebida(int quantidadeEstoque, int Codigo, String Nome, double valor) {
        super(Codigo, Nome, valor);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /**
     * @return the quantidadeEstoque
     */
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /**
     * @param quantidadeEstoque the quantidadeEstoque to set
     */
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    
    

    
}
