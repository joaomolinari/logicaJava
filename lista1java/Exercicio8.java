package lista1java;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite a base do tri�ngulo:");
		int base=sc.nextInt();
		
		System.out.println("Digite a altura do tri�ngulo:");
		int altura=sc.nextInt();
		
		System.out.println("A �rea do tri�ngulo �:"+ base*altura/2);
	}

}
