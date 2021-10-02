package br.com.generation.exercicios.Java;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
       int idadeAnos, idadeMeses, idadeDias, totalDias;
       
       
       
       System.out.println("Digite quantos dias voce viveu: ");
       totalDias = leia.nextInt();
       
       idadeAnos = totalDias/365;
       
       //totalDias = totalDias%365;
       
       idadeMeses = (totalDias%365) / 30;
       
       idadeDias = (totalDias%365) % 30;
       
       System.out.println("A idade e: " + idadeAnos);
       System.out.println("Meses  " + idadeMeses);
       System.out.println("Dias: " +idadeDias);
    
       leia.close(); 
       
       
    
	}

}
