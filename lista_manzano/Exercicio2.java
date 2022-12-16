package lista_manzano;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte contadora = 1;
		int acumuladora = 0;

		while (contadora <= 100) {
			acumuladora += contadora;
			contadora++;
		}

		System.out.println("O total da soma obtida é: " + acumuladora);
	}

}
