package lista3java;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu saldo em d�lar:");
		float saldoDolares=sc.nextFloat();
		
		System.out.println("Digite quantos d�lares voc� quer converter em reais:");
		float convertReais=sc.nextFloat();
		
		System.out.println("Digite a cota��o do d�lar hoje:");
		float cotacaoDolar=sc.nextFloat();
		
		float saldoAtual= saldoDolares-convertReais;
		
		float saldoReais= convertReais*cotacaoDolar;
		
		System.out.println("Parab�ns! Seus R$" + saldoReais + " " + "reais j� foram creditados em sua conta brasileira");
		
		System.out.println("");
		
		System.out.println("Seu saldo atual em d�lares � de: $"+saldoAtual);
		
	}
}
