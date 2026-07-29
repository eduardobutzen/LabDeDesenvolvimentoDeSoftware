/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;

/**
 *
 * @author laboratorio
 */
public class Project {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        //conta.saldo = 1000;
        
        conta.definirSaldoInicial(1000);
       
        
        System.out.println("Saldo: " +conta.getSaldo());
        if(conta.sacar(550)){
            
            System.out.println("operação realizada");
        }
        else{
            
            System.out.println("Operação não realizada");
        }
        
        
        System.out.println("Novo saldo: " +conta.getSaldo());
        
        conta.depositar(50);
        
        System.out.println("Novo saldo: " +conta.getSaldo());
    }
}
