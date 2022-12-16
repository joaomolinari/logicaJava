package lista_faccat;

import java.util.Scanner;

public class Exercicio28 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		byte valorA = sc.nextByte();
		
		System.out.println("Digite o segundo valor:");
		byte valorB = sc.nextByte();
		
		System.out.println("Digite o terceiro valor:");
		byte valorC = sc.nextByte();
		
		if ((valorA>valorB) && (valorA>valorB)) {
			System.out.println("Dos valores informados, o maior valor é A");
		} else if ((valorB>valorA) && (valorB>valorC)) {
			System.out.println("Dos valores informados, o maior valor é B");
		} else {
			System.out.println("Dos valores informados, o maior valor é C");
		}
	
	}

}
