/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class aula0607 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        
             
       int batata[]=new int[4];
       
       
        
        batata[0] =10;
        batata[1]= 3;
        batata[2]= 4;
        batata[3]=10;
        
       
        System.out.println(batata[1]);
        
       
            for (int i = 0; i < batata.length; i++) {
                System.out.println("Seu vetor é: "+i+ " "+ batata[i]);
        }
        
      
             batata[1]=30;
             
             System.out.println("-------------------------------------");
             System.out.println(batata[1]);
             
             String nome[] = new String[5];
             for (int i =0; 1< nome.length ; i++)
             {
       
        System.out.println("informe o primeiro nome" +i);
        nome[i]=teclado.next();
        
        String numero [] = new String[10];
             for (int i =0; 1< numero.length ; i++)
             {
       
        System.out.println("informe o primeiro número" +i);
        nome[i]=teclado.next();
        
            
            
       
            
        
      
    }
    
}
    }
    
}
