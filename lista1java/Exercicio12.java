package lista1java;

import java.util.Scanner;


public class Exercicio12 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite o raio do c�rculo:");
		int raio=sc.nextInt();
		
		int area=(int) (Math.PI*raio*raio);
		
		System.out.println("A �rea do c�rculo �:"+ area);
		
	}

}
