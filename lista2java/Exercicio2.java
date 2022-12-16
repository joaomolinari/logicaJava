package lista2java;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número total de eleitores no município");
		float eleitores=sc.nextFloat();
		
		System.out.println("Digite o número total de votos válidos no município");
		float validos=sc.nextFloat();
		
		System.out.println("Digite o número total de votos nulos no município");
		float nulos=sc.nextFloat();
		
		System.out.println("Digite o número total de votos brancos no município");
		float brancos=sc.nextFloat();
		
		float votosValidos= validos/eleitores*100;
		float votosNulos= nulos/eleitores*100;
		float votosBrancos= brancos/eleitores*100;
		
		System.out.println("O percentual de votos válidos no município é:"+votosValidos+"%");
		System.out.println("O percentual de votos nulos no município é:"+votosNulos+"%");
		System.out.println("O percentual de votos brancos no município é:"+votosBrancos+"%");
		
		
	}

}
