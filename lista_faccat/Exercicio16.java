package lista_faccat;

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de ma�as que quer comprar: ");
		int macas = sc.nextInt();

		if (macas < 12) {
			double valorFinal = macas * 1.30;
			System.out.println("O valor final das ma�as ser� de: " + valorFinal);
			
		} else {
			double valorFinal = macas * 1.00;
			System.out.println("O valor final � de: " + valorFinal);
			
		}

		sc.close();

     }
	
}