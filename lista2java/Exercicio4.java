package lista2java;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final float DISTRIBUIDOR = 28;
		final float IMPOSTO = 45;
		
		System.out.println("Digite o custo de fábrica do carro");
		float custoFabrica=sc.nextFloat();
		
		float valorDISTRIBUIDOR= DISTRIBUIDOR*custoFabrica/100;
		float valorIMPOSTO= IMPOSTO*custoFabrica/100;
		
		float custoConsumidor= valorDISTRIBUIDOR+valorIMPOSTO+custoFabrica;
		
		System.out.println("O valor final ao consumidor é: R$"+custoConsumidor);
		
	}

}
