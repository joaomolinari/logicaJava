package lista_faccat;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int numero1=sc.nextInt();
		
		if (numero1 < 0) {
			System.out.println("� negativo");
			
		} else {
				System.out.println("� positivo");
			}
		
		sc.close();
			
		}
	
	}
