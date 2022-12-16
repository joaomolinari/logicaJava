package lista_faccat;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int primeiroValor = sc.nextInt();
		
		System.out.println("Digite um segundo valor:");
		int segundoValor = sc.nextInt();
		
		if (primeiroValor < segundoValor) {
			System.out.println("O valor maior é o segundo:" + segundoValor);
		} else {
			System.out.println("O valor maior é o primeiro:" + primeiroValor);
		}
	}

}
