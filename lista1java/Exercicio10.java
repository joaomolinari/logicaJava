package lista1java;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado:");
		int lado=sc.nextInt();
		
		int area=lado*lado;
		
		System.out.println("A área do quadrado é:"+ area);
		
	}

}
