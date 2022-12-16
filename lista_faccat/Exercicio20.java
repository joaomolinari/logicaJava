package lista_faccat;

import java.util.Scanner;

public class Exercicio20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int primeiroValor = sc.nextInt();
		
		System.out.println("Digite um segundo valor:");
		int segundoValor = sc.nextInt();
		
		if (primeiroValor < segundoValor) {
			System.out.println("Os valores em ordem crescente são:" + " " + primeiroValor + ", " + segundoValor);
		} else {
			System.out.println("Os valores em ordem crescente são:" + " " + segundoValor + ", " + primeiroValor);
		}
	}


}
