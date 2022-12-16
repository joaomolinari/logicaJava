package lista_faccat;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero1=sc.nextInt();
		
		if (numero1 < 0) {
			System.out.println("É negativo");
			
		} else {
				System.out.println("É positivo");
			}
		
		sc.close();
			
		}
	
	}
