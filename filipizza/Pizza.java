/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filipizza;
import java.util.List;

/**
 *
 * @author alunolab13
 */
public class Pizza extends Produto {

    private String tamanho;
    private int diametro;
    private List<String> ingredientes;

    public Pizza() {
    }

    public Pizza(String tamanho, int diametro, List<String> ingredientes, int Codigo, String Nome, double valor) {
        super(Codigo, Nome, valor);
        this.tamanho = tamanho;
        this.diametro = diametro;
        this.ingredientes = ingredientes;
    }

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the diametro
     */
    public int getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    /**
     * @return the ingredientes
     */
    public List<String> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    


    
}
