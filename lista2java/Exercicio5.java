package lista2java;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Celsius:");
		float celsius=sc.nextFloat();
		
		float fahrenheit=(celsius+160)/5;
		
		System.out.println("A temperatura em Fahrenheit é de:"+ fahrenheit);
	}

}
