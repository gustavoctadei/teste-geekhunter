package com.mycompany.teste.geekhunter;

import java.util.Scanner;

public class Desafio {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalVendedores = input.nextInt();
        int[] vendedores = new int[totalVendedores];
        
        for (int i = 0; i < totalVendedores; i++) {
            vendedores[i] = input.nextInt();
        }
                
        int totalClientes = input.nextInt();
        int idVendedorX = input.nextInt();
        
        int atual;
        for (int i = 0; i < totalClientes; i++) {
            atual = vendedores[0];
            
            for (int j = 0; j < totalVendedores-1; j++) {
                vendedores[j] = vendedores[j+1];
            }
            vendedores[totalVendedores-1] = atual;
        }
        
        System.out.println(vendedores[0]);
        
        int i = 0;
        while(vendedores[i] != idVendedorX) {
            i++;
        }
        
        System.out.println(i);
    }
    
}
