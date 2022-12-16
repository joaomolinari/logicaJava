package lista3java;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para a letra A:");
		int letraA=sc.nextInt();
		
		System.out.println("Digite um valor para a letra B:");
		int letraB=sc.nextInt();
		
		System.out.println("Digite um valor para a letra C:");
		int letraC=sc.nextInt();
		
		System.out.println("Digite um valor para a letra D:");
		int letraD=sc.nextInt();
		
		int variavelP = letraA + letraC;
		int variavelS = letraB + letraD;
		
		System.out.println("A soma do primeiro com o terceiro valor é:" + variavelP);
		System.out.println("A soma do segundo com o quarto valor é:" + variavelS);
		
}
	
}