package lista2java;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos:");
		int anos=sc.nextInt();
		System.out.println("Digite quantos meses passaram desde seu último mêsversário:");
		int meses=sc.nextInt();
		System.out.println("Digite quantos dias passaram desde seu aniversário:");
		int dias=sc.nextInt();
		
		int idade=anos*365+meses*30+dias;
				
		System.out.println("Seus dias vividos são:"+idade);
						
				
	}

}
