package lista3java;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para a letra A:");
		int letraA=sc.nextInt();
		
		System.out.println("Digite um valor para a letra B:");
		int letraB=sc.nextInt();
		
		System.out.println("Digite um valor para a letra C:");
		int letraC=sc.nextInt();
		
		int soma = letraA+letraB+letraC;
		
		System.out.println("A soma dos 3 valores é:" + soma);
		
}
	
}