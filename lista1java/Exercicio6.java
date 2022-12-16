package lista1java;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int valor1=sc.nextInt();
		
		System.out.println("Digite um número:");
		int valor2=sc.nextInt();
		
		System.out.println("O resultado é:"+ valor1/valor2 );
		
	}

}