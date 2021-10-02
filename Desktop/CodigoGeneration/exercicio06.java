package br.com.generation.exercicios.Java;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		Scanner scan = new Scanner(System.in);
		double xUm, xDois,yUm, yDois, d;
		
		System.out.println("Digite x1: ");
		xUm = scan.nextDouble();
		
		System.out.println("Digite x2: ");
		xDois = scan.nextDouble();
		
		System.out.println("Digite y1: ");
		yUm = scan.nextDouble();
		
		
		System.out.println("Digite y2: ");
		yDois = scan.nextDouble();
		
		d = Math.sqrt(Math.pow(xDois - xUm, 2 ) + Math.pow(yDois, yUm)); 
		System.out.println("a distancia e = " + d);
		
		
		leia.close();
		
	}

}
