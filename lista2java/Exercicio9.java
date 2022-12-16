package lista2java;
import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prestação:");
		int valorPrestacao=sc.nextInt();
		System.out.println("Digite o valor da taxa:");
		int taxa=sc.nextInt();
		System.out.println("Digite os dias de atraso:");
		int atraso=sc.nextInt();
		
		int valorFinal=valorPrestacao + (valorPrestacao*taxa/100) * atraso;
		
		System.out.println("O valor final da prestação é de R$:"+valorFinal);
		
	}

}
