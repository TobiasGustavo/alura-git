package br.com.generation.exercicios.Java;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		
		int anos, meses, dias;
		
		System.out.println("Digite os anos: ");
		anos = scan.nextInt();
		
		System.out.println("Digite os meses: ");
		meses = scan.nextInt();
		
		System.out.println("Digite os dias: ");
		dias = scan.nextInt();
		
		
		System.out.println(anos +  " anos, " + meses + " meses, \n" + dias + " dias  \n" ); 
	    System.out.println(+anos * 365 + meses * 30 + dias);
		 
	   scan.close();
	   
	   
	}

}
