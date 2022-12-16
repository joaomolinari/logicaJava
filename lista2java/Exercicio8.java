package lista2java;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto de viagem:");
		int tempo=sc.nextInt();
		System.out.println("Digite a velocidade média na viagem:");
		int velocidade=sc.nextInt();
		
		int distancia=tempo*velocidade;
		
		int litrosUsados=distancia/12;
		
		System.out.println("A velocidade média na viagem foi de:"+velocidade+"km/h");
		System.out.println("O tempo gasto na viagem foi de:"+tempo);
		System.out.println("A distância percorrida foi de:"+distancia+"m/km");
		System.out.println("A quantidade de litros usados foi de:"+litrosUsados+"L");
		
	}

}
