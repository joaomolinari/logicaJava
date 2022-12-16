package exemplosAulas;

public class ExerciciovetorCadastro {
	
	public static void main(String[] args) {
		
		String [] nomes = {"João", "Gustavo", "Gleison", "Ana", "Gabriel"};
		String [] telefone = {"(11)97759-6913","(11)94329-5574","(11)97429-5641","(11)97429-9230","(11)95289-6913"};
		String [] email = {"joao@gmail.com","jv@gmail.com","molinari@gmail.com","jvm@gmail.com","jv03@gmail.com"};
		String [] idade = {"18","19","20","21","22"};
		String [] generos = {"Masculino", "Feminino", "Outros"};
		boolean[] casados = {false,true,false,false,false};
		
		for (int i = 0; i < nomes.length; i++) {
			
			System.out.println(nomes[i]);
			
		}
		System.out.println("A quantidade de valores armazenados corresponde a:" + " " + nomes.length);
		
		for (int i = 0; i < telefone.length; i++) {
			
			System.out.println(telefone[i]);
			
		}
		System.out.println("A quantidade de valores armazenados corresponde a:" + " " + telefone.length);
		
		for (int i = 0; i < email.length; i++) {
			
			System.out.println(email[i]);
			
		}
		System.out.println("A quantidade de valores armazenados corresponde a:" + " " + email.length);
		
		for (int i = 0; i < idade.length; i++) {
			
			System.out.println(idade[i]);
			
		}
		System.out.println("A quantidade de valores armazenados corresponde a:" + " " + idade.length);
		
		for (int i = 0; i < generos.length; i++) {
			
			System.out.println(generos[i]);
			
		}
		System.out.println("A quantidade de valores armazenados corresponde a:" + " " + generos.length);
		
		for (int i = 0; i < casados.length; i++) {
			
			System.out.println(casados[i]);
			
		}
		System.out.println("A quantidade de valores armazenados corresponde a:" + " " + casados.length);
	}
	

}
