package lista_faccat;

import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de maças que quer comprar: ");
		int macas = sc.nextInt();

		if (macas < 12) {
			double valorFinal = macas * 1.30;
			System.out.println("O valor final das maças será de: " + valorFinal);
			
		} else {
			double valorFinal = macas * 1.00;
			System.out.println("O valor final é de: " + valorFinal);
			
		}

		sc.close();

     }
	
}