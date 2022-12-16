package lista_faccat;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do produto:");

		String produto = sc.nextLine();

		System.out.println("Qual quantidade atual deste produto no estoque:");
		short quantAtual = sc.nextShort();

		System.out.println("Qual a quantidade máxima que este produto pode ter:");
		short quantMaxima = sc.nextShort();

		System.out.println("Qual a quantidade mínima que este produto pode ter: ");
		short quantMinima = sc.nextShort();

		int quantMedia = (quantMaxima + quantMinima) / 2;

		if (quantAtual >= quantMedia) {
			System.out.println("Não efetuar a compra: " + produto);
		} else {
			System.out.println("Efetuar a compra: " + produto);
		}

	}

}
