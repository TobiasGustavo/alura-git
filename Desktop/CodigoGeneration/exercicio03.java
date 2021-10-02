package br.com.generation.exercicios.Java;

import java.util.Scanner;

public class exercicio03 {

	
		// Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		//expressa em segundos e mostre-o expresso em horas, minutos e segundos.

		
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    Scanner leia = new Scanner(System.in);
		
				int horas, minutos, segundos;
		
		System.out.println("Digite os segundos: ");
		
		segundos = scan.nextInt();
		horas    = (segundos / 3600); 
		minutos  = (segundos % 3600)  /  60;
		segundos = (segundos % 3600)  %  60;
		
		System.out.println("Duracao de " + horas +  " horas, " + minutos + "\n minutos e " + segundos + "\n segundos");
		
		leia.close();
		
	}

}
