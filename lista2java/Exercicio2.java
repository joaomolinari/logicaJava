package lista2java;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero total de eleitores no munic�pio");
		float eleitores=sc.nextFloat();
		
		System.out.println("Digite o n�mero total de votos v�lidos no munic�pio");
		float validos=sc.nextFloat();
		
		System.out.println("Digite o n�mero total de votos nulos no munic�pio");
		float nulos=sc.nextFloat();
		
		System.out.println("Digite o n�mero total de votos brancos no munic�pio");
		float brancos=sc.nextFloat();
		
		float votosValidos= validos/eleitores*100;
		float votosNulos= nulos/eleitores*100;
		float votosBrancos= brancos/eleitores*100;
		
		System.out.println("O percentual de votos v�lidos no munic�pio �:"+votosValidos+"%");
		System.out.println("O percentual de votos nulos no munic�pio �:"+votosNulos+"%");
		System.out.println("O percentual de votos brancos no munic�pio �:"+votosBrancos+"%");
		
		
	}

}
