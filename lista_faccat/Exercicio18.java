package lista_faccat;

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano em que nasceu:");
		int nascimento = sc.nextInt();
		
		if (nascimento <= 2004) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Você não pode votar!");
		}
	}

}
