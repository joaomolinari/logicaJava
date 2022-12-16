package lista_faccat;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		int primeiraNota = sc.nextInt();
		
		System.out.println("Digite a segunda nota:");
		int segundaNota = sc.nextInt();
		
		double media = primeiraNota*segundaNota;
		
		if (media >= 6) {
			System.out.println("O aluno foi aprovado!");
		} else {
			System.out.println("O aluno foi reprovado!");
		}
	}

}
