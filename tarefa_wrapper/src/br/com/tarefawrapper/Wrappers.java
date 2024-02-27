package br.com.tarefawrapper;

public class Wrappers {

	public static void main(String[] args) {
		// autoboxing
		int MaiorIdade = 18;
		Integer menorIdade = MaiorIdade - 1;
		System.out.println(menorIdade);
		
		//Casting
		Integer menorIdade2 = 17;
		int MaiorIdade2 = (int) menorIdade2 +1;
		System.out.println(MaiorIdade2);
	}

}
