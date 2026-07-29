/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author laboratorio
 */
public class Casa {
    public float valor;
    public float calcularPreco(int tamanho){
        valor = 4300*tamanho;
        return valor;
    }
    
    public float calcularPreco(int tamanho, int quantidadeQuartos){
        
        valor = (4300 * tamanho) + (2500*quantidadeQuartos);
        return valor;
    }
    
}
