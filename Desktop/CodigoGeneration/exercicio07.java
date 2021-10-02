package br.com.generation.exercicios.Java;

import java.util.Scanner;

public class exercicio07  {
	

	public static void main(String[] args) {
		
		
		
		Scanner leia = new Scanner (System.in);
		double a, b, c, d, e, f, x, y;
		
		
		
		
		
		System.out.println("Escreva o valor de a: ");
		a = leia.nextDouble(); 
		
		System.out.println("Escreva o valor de b: ");
		b = leia.nextDouble();
		
		System.out.println("Escreva o valor de c: ");
		c = leia.nextDouble();
		
		System.out.println("Escreva o valor de d: ");
		d = leia.nextDouble();
		
		System.out.println("Escreva o valor de e: ");
		e = leia.nextDouble();
		
		System.out.println("Escreva o valor de f: ");
		f = leia.nextDouble();
		
		
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.println("O valor de x e: " + x);
		System.out.println("O valor de x y: " + y);
		
		

	}

}