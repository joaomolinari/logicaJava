package lista_manzano;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número que queira ver a tabuada:");
		byte numero = sc.nextByte();
		
		int tabuada;
		
		byte contadora = 1;
		
		while (contadora<=10) {
			tabuada = numero*contadora;
			System.out.println(numero + " x " + contadora + " = " + tabuada);
			contadora++;
		}

	}

}
