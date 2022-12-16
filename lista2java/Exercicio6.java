package lista2java;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Fahrenheit:");
		float fahrenheit=sc.nextFloat();
		
		float celsius=(fahrenheit-32) * 5/9;
		
		System.out.println("A temperatura em Celsius é de:"+ celsius);
	}

}
