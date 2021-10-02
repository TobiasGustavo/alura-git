package br.com.generation.exercicios.Java;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);
        
        double precoFabrica, precoFinal;
        
        
        System.out.print("Digite o preço de fábrica: ");
        precoFabrica = scan.nextDouble();
        precoFinal = precoFabrica + (precoFabrica*0.28) + (precoFabrica*0.45);
        
        System.out.println("Preço final: " + precoFinal);
        
        leia.close();
    }
}