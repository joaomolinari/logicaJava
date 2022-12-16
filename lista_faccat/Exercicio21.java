package lista_faccat;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Duração de jogo: 24h");
		System.out.println("Digite a hora de início do jogo: ");
		float inicio = sc.nextFloat();

		System.out.println("Digite a hora de término do jogo: ");
		float termino = sc.nextFloat();

		float horas = termino - inicio;

		if (horas < 0) {
			horas += 24;

		} else if (horas == 0) {
			System.out.println("O jogo teve duração de: 24h");

		} else {
			System.out.println("O jogo teve duração de:" + horas + " horas");

		}
		
	}

}
