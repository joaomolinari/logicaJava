package lista3java;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu saldo em reais:");
		float saldoReais=sc.nextFloat();
		
		System.out.println("Digite quantos reais voc� quer converter em d�lar:");
		float convertDolar=sc.nextFloat();
		
		System.out.println("Digite a cota��o do d�lar hoje:");
		float cotacaoDolar=sc.nextFloat();
		
		float saldoAtual= saldoReais-convertDolar;
		
		float saldoDolar= convertDolar/cotacaoDolar;
		
		System.out.println("Parab�ns! Seus $" + saldoDolar + " " + "d�lares j� foram creditados em sua conta americana");
		
		System.out.println("");
		
		System.out.println("Seu saldo atual em reais � de: R$"+saldoAtual);
		
	}

}
