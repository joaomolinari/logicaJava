package lista1java;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite a Diagonal maior do losango:");
		int base=sc.nextInt();
		
		System.out.println("Digite a diagonal menor do losango:");
		int altura=sc.nextInt();
		
		System.out.println("A área do losango é:"+ base*altura/2);
	}

}
