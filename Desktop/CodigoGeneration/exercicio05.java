package br.com.generation.exercicios.Java;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		
		double notaPesoDois, notaPesoTres, NotaPesoCinco, media; 
		
		System.out.println("Digite a nota de peso 2: " );
		notaPesoDois = scan.nextDouble();
		
		System.out.println("Digite a nota de peso 2: " );
		notaPesoTres = scan.nextDouble();
		
		System.out.println("Digite a nota de peso 2: " );
		NotaPesoCinco = scan.nextDouble();
		
		media = ((notaPesoDois * 2) + (notaPesoTres * 3) + (NotaPesoCinco * 5)) /10;
		
		System.out.println("A media e: " + media);
		
		leia.close();
	
		
	

	}

}
