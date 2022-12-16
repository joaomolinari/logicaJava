package lista1java;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite a Diagonal maior do losango:");
		int dMaior=sc.nextInt();
		
		System.out.println("Digite a diagonal menor do losango:");
		int dMenor=sc.nextInt();
		
		int area=dMaior*dMenor/2;
		
		System.out.println("A área do losango é:"+ area);
		
		
		
	}
}
