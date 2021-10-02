package br.com.generation.exercicios.Java;

import java.util.Scanner;

public class exercicio04 {
	

    public static void main(String[] args) {
      
    	
    	
            Scanner scan = new Scanner(System.in);
            Scanner leia = new Scanner(System.in);
            int a, b, c, r, s, d;
        
        
           System.out.print("Digite a: ");
           a = scan.nextInt();
           System.out.print("Digite b: ");
           b = scan.nextInt();
           System.out.println("Digite c: ");
           c = scan.nextInt();
           r = (a + b)^2;
           s = (b + c)^2;
           d = (r + s)/2;
          System.out.println("D = " + d);
        
          leia.close(); 
         
       
        
    }
}