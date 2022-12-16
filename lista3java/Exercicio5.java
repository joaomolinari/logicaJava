package lista3java;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu saldo em dólar:");
		float saldoDolares=sc.nextFloat();
		
		System.out.println("Digite quantos dólares você quer converter em reais:");
		float convertReais=sc.nextFloat();
		
		System.out.println("Digite a cotação do dólar hoje:");
		float cotacaoDolar=sc.nextFloat();
		
		float saldoAtual= saldoDolares-convertReais;
		
		float saldoReais= convertReais*cotacaoDolar;
		
		System.out.println("Parabéns! Seus R$" + saldoReais + " " + "reais já foram creditados em sua conta brasileira");
		
		System.out.println("");
		
		System.out.println("Seu saldo atual em dólares é de: $"+saldoAtual);
		
	}
}
