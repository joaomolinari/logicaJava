package lista_faccat;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dura��o de jogo: 24h");
		System.out.println("Digite a hora de in�cio do jogo: ");
		float inicio = sc.nextFloat();

		System.out.println("Digite a hora de t�rmino do jogo: ");
		float termino = sc.nextFloat();

		float horas = termino - inicio;

		if (horas < 0) {
			horas += 24;

		} else if (horas == 0) {
			System.out.println("O jogo teve dura��o de: 24h");

		} else {
			System.out.println("O jogo teve dura��o de:" + horas + " horas");

		}
		
	}

}
