package lista_faccat;

import java.util.Scanner;

public class Exercicio29 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		byte valorA = sc.nextByte();
		
		System.out.println("Digite o segundo valor: ");
		byte valorB = sc.nextByte();
		
		System.out.println("Digite o terceiro valor: ");
		byte valorC = sc.nextByte();
		int soma;
		
		if ((valorA>valorB) && (valorB>valorC)) {
			soma = valorA+valorB;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
			
		} else if ((valorA>valorC) && (valorC>valorB)) {
			soma = valorA+valorC;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
			
		} else if ((valorB>valorA) && (valorA>valorC)) {
			soma = valorB+valorA;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
			
		} else if ((valorB>valorC) && (valorC>valorA)) {
			soma = valorB+valorC;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
			
		} else if ((valorC>valorA) && (valorA>valorB)) {
			soma = valorC+valorA;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
			
		} else {
			soma = valorC+valorB;
			System.out.println("A soma dos 2 maiores valores é: "+soma);
		}

	}

}
