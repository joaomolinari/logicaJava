package exemplosAulas;

public class ExercicioVetorTelefone {
	
	public static void main(String[] args) {
		
		String [] telefone = {"(11)97759-6913","(11)94329-5574","(11)97429-5641","(11)97429-9230","(11)95289-6913"};
		
		for (int i = 0; i < telefone.length; i++) {
			
			System.out.println(telefone[i]);
			
		}
		
		System.out.println("A quantidade de valores armazenados corresponde a:" + " " + telefone.length);
	}
	
}
